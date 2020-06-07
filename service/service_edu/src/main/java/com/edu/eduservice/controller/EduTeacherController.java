package com.edu.eduservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.edu.eduservice.entity.EduTeacher;
import com.edu.eduservice.entity.vo.TeacherQuery;
import com.edu.eduservice.service.EduTeacherService;
import com.edu.tools.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zhengzhaoxiang
 * @since 2020-06-01
 */
@RestController
@RequestMapping("/eduservice/teacher")
@CrossOrigin
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    /**
    * @Description 获取所有数据<分页></分页>
    * @Author zhengzhaoxiang
    * @Date 2020/6/2 15:27
    * @Param []
    * @Return void
    */
    @PostMapping("pageTeacherCondition/{current}/{limit}")
    public R pageTeacherCondition( @PathVariable long current,
                                   @PathVariable long limit,
                                  @RequestBody(required = false) TeacherQuery teacherQuery){
        Page<EduTeacher> pageTeacher = new Page<>(current,limit);
        //构建条件
        QueryWrapper<EduTeacher> wrapper = new QueryWrapper<>();
        // mybatis学过 动态sql
        if(teacherQuery != null){

            String name = teacherQuery.getName();
            Integer level = teacherQuery.getLevel();
            String begin = teacherQuery.getBegin();
            String end = teacherQuery.getEnd();
            //判断条件值是否为空，如果不为空拼接条件
            if(!StringUtils.isEmpty(name)) {
                //构建条件
                wrapper.like("name",name);
            }
            if(!StringUtils.isEmpty(level)) {
                wrapper.eq("level",level);
            }
            if(!StringUtils.isEmpty(begin)) {
                wrapper.ge("gmt_create",begin);
            }
            if(!StringUtils.isEmpty(end)) {
                wrapper.le("gmt_create",end);
            }
        }
        //排序
        wrapper.orderByDesc("gmt_create");
        //分页查找
        eduTeacherService.page(pageTeacher,wrapper);
        //List<EduTeacher> list = eduTeacherService.list(null);
        //获取总记录数 和 记录
        return R.ok().data("rows",pageTeacher.getRecords()).data("total",pageTeacher.getTotal() );
    }

    /**
    * @Description 保存数据
    * @Author zhengzhaoxiang
    * @Date 2020/6/6 13:27
    * @Param [eduTeacher]
    * @Return com.edu.tools.R
    */
    @PostMapping("addTeacher")
    public R insert(@RequestBody EduTeacher eduTeacher){
        boolean save = eduTeacherService.save(eduTeacher);
        if(save){
            return R.ok();
        }else {
            return R.error();
        }
    }

    /**
    * @Description 删除数据
    * @Author zhengzhaoxiang
    * @Date 2020/6/6 13:28
    * @Param [id]
    * @Return com.edu.tools.R
    */
    @DeleteMapping("{id}")
    public R removeTeacher(@PathVariable String id){
        boolean b = eduTeacherService.removeById(id);
        if(b){
          return R.ok();
        } else {
            return R.error();
        }
    }

    /**
    * @Description 根据id获取teacher信息
    * @Author zhengzhaoxiang
    * @Date 2020/6/6 13:31
    * @Param [id]
    * @Return com.edu.tools.R
    */
    @GetMapping("getTeacher/{id}")
    public R getById(@PathVariable String id){
        if(id != null){
            EduTeacher teacher = eduTeacherService.getById(id);
            return R.ok().data("teacher",teacher);
        }
        return R.error().message("id 不能为空");
    }

    @PutMapping("updateTeacher")
    public R update(@RequestBody EduTeacher teacher){
        boolean update = eduTeacherService.updateById(teacher);
        if(update){
            return R.ok();
        }else{
            return R.error();
        }
    }

}

