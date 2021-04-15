package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.github.pagehelper.PageInfo;
import com.example.entity.Visit;
import com.example.service.VisitService;
import com.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitService visitService;

    @Autowired
    private StudentService studentService;

    @PostMapping("create")
    public Result create(@RequestBody Visit visit){
        int flag = visitService.create(visit);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = visitService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Visit visit){
        int flag = visitService.updateSelective(visit);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Visit detail(Integer id){
        return visitService.detail(id);
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Visit visit){
        PageInfo<Visit> pageInfo = visitService.query(visit);
        pageInfo.getList().forEach(entity->{
            Student detail = studentService.detail(entity.getStudentId());
            entity.setStudent(detail);
        });
        return Result.ok(pageInfo);
    }

}
