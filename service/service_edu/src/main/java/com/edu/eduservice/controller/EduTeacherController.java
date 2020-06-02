package com.edu.eduservice.controller;


import com.edu.eduservice.entity.EduTeacher;
import com.edu.eduservice.service.EduTeacherService;
import com.edu.servicebase.handler.BusinessException;
import com.edu.tools.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zhengzhaoxiang
 * @since 2020-06-01
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    /**
    * @Description 获取所有数据
    * @Author zhengzhaoxiang
    * @Date 2020/6/2 15:27
    * @Param []
    * @Return void
    */
    @GetMapping("findAll")
    public R findAll(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return R.ok().data("items",list);
    }

    @PostMapping("save")
    public void insert(@RequestBody EduTeacher eduTeacher){
        eduTeacherService.save(eduTeacher);
    }

    @DeleteMapping("{id}")
    public boolean removeTeacher(@PathVariable String id){
        boolean b = eduTeacherService.removeById(id);
        return b;
    }

}

