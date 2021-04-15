package com.example.controller;

import com.github.pagehelper.PageInfo;
import com.example.entity.Grade;
import com.example.service.GradeService;
import com.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping("create")
    public Result create(@RequestBody Grade grade){
        int flag = gradeService.create(grade);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = gradeService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Grade grade){
        int flag = gradeService.update(grade);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Grade detail(Integer id){
        return gradeService.detail(id);
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Grade grade){
        PageInfo<Grade> pageInfo = gradeService.query(grade);
        return Result.ok(pageInfo);
    }

}
