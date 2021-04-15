package com.example.controller;

import com.github.pagehelper.PageInfo;
import com.example.entity.Bed;
import com.example.service.BedService;
import com.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/bed")
public class BedController {

    @Autowired
    private BedService bedService;

    @PostMapping("create")
    public Result create(@RequestBody Bed bed){
        int flag = bedService.create(bed);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = bedService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Bed bed){
        int flag = bedService.update(bed);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Bed detail(Integer id){
        return bedService.detail(id);
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Bed bed){
        PageInfo<Bed> pageInfo = bedService.query(bed);
        return Result.ok(pageInfo);
    }

}
