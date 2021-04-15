package com.example.service;

import com.example.entity.Dormitory;
import com.example.mapper.DormitoryMapper;
import com.example.mapper.DormitoryStudentMapper;
import com.example.entity.DormitoryStudent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DormitoryStudentService {

    @Autowired(required = false)
    private DormitoryStudentMapper dormitoryStudentMapper;
    @Autowired(required = false)
    private DormitoryMapper dormitoryMapper;

    @Autowired
    private DormitoryService dormitoryService;

    public int create(DormitoryStudent dormitoryStudent) {
        return dormitoryStudentMapper.create(dormitoryStudent);
    }

    public int delete(String ids) {
        String[] arr = ids.split(",");
        int row = 0;
        for (String s : arr) {
            if(!StringUtils.isEmpty(s)){
                dormitoryStudentMapper.delete(Integer.parseInt(s));
            row++;
            }
        }
        return row;
    }

    public int delete(Integer id) {
        return dormitoryStudentMapper.delete(id);
    }

    public int update(DormitoryStudent dormitoryStudent) {
        return dormitoryStudentMapper.update(dormitoryStudent);
    }

    public int updateSelective(DormitoryStudent dormitoryStudent) {
        return dormitoryStudentMapper.updateSelective(dormitoryStudent);
    }

    public PageInfo<DormitoryStudent> query(DormitoryStudent dormitoryStudent) {
        if(dormitoryStudent != null && dormitoryStudent.getPage() != null){
            PageHelper.startPage(dormitoryStudent.getPage(),dormitoryStudent.getLimit());
        }
        return new PageInfo<DormitoryStudent>(dormitoryStudentMapper.query(dormitoryStudent));
    }

    public DormitoryStudent detail(Integer id) {
        return dormitoryStudentMapper.detail(id);
    }

    public int count(DormitoryStudent dormitoryStudent) {
        return dormitoryStudentMapper.count(dormitoryStudent);
    }

    @Transactional(rollbackFor=Exception.class)
    public  int select_dormitory_submit (Integer studentId,Integer dormitoryId,Integer bedId) throws Exception {
        Dormitory detail = dormitoryService.detail(dormitoryId);
        int version1 = detail.getVersion();
        //获取容量
        int capacity = detail.getCapacity();
        DormitoryStudent ds = new DormitoryStudent();
        ds.setDormitoryId(dormitoryId);
        List<DormitoryStudent> list = dormitoryStudentMapper.query(ds);
        if(list.size() == capacity){
            return 0;
        }else{
            dormitoryStudentMapper.deleteByCond(studentId,dormitoryId);
            DormitoryStudent entity = new DormitoryStudent();
            entity.setDormitoryId(dormitoryId);
            entity.setBedId(bedId);
            entity.setStudentId(studentId);
            entity.setCheckin(new Date());
            entity.setStatus(1);
            dormitoryStudentMapper.create(entity);
        }
        Dormitory detail2 = dormitoryService.detail(dormitoryId);
        if(version1 != detail2.getVersion()){
            throw new Exception("版本不一致，执行分配出现问题");
        }
        Dormitory temp = new Dormitory();
        temp.setId(detail.getId());
        temp.setVersion(version1+1);
        dormitoryMapper.updateSelective(temp);
        return 1;
    }

    public int countByBuildingId(Integer buildingId){
        return dormitoryStudentMapper.countByBuildingId(buildingId);
    }

    public Map<String,Object> queryStudentByBedId(Integer bedId){
        return dormitoryStudentMapper.queryStudentByBedId(bedId);
    }
}
