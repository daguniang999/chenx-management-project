package com.chenx.admin.controller;

import com.chenx.annotation.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname SysUserController
 * @Description TODO
 * @Date 2021/6/30 8:54 下午
 * @Created by chenxiaowei
 */

@RestController
public class SysUserController {

    @GetMapping("/user")
    public String getUser() {
        return "ssss";
    }
}
