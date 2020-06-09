package com.edu.eduservice.controller;

import com.edu.tools.R;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/4
 * @version: 1.0
 */
@CrossOrigin
@RestController
@RequestMapping("/eduservice/user")
public class EduLoginCtroller {

    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }

    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","");
    }
}
