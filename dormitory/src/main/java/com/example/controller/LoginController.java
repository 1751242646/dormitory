package com.example.controller;

import com.example.entity.Student;
import com.example.entity.User;
import com.example.framework.jwt.JWTUtil;
import com.example.service.StudentService;
import com.example.service.UserService;
import com.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){

        if(user.getType() == 2){ //学生登录的
            Student entity = studentService.login(user.getUserName(),user.getPassword());
            if(entity != null){
                String token = JWTUtil.signForStudent(entity);
                Map map = new HashMap();
                map.put(JWTUtil.token,token);
                map.put("student",entity);
                return Result.ok("登陆成功",map);
            }else{
                return Result.fail("用户名或密码错误");
            }
        }else {  //宿管员和管理员
            User entity = userService.login(user.getUserName(), user.getPassword());
            if(entity != null){
                String token = JWTUtil.sign(entity);
                Map map = new HashMap();
                map.put(JWTUtil.token,token);
                map.put("user",entity);
                return Result.ok("登录成功",map);
            }else{
                return Result.fail("用户名或密码错误");
            }
        }




    }
}
