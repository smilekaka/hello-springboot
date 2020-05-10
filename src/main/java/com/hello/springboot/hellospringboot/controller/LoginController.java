package com.hello.springboot.hellospringboot.controller;

import com.hello.springboot.hellospringboot.pojo.User;
import com.hello.springboot.hellospringboot.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;


import java.util.Objects;

@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "api/hello")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
