package com.edu.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.eduservice.entity.EduSubject;
import com.edu.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
* @Description  课程分类服务类
* @Author zhengzhaoxiang
* @Date 2020/6/10 21:37
* @Param
* @Return
*/
public interface EduSubjectService extends IService<EduSubject> {

    //添加课程分类
    void saveSubject(MultipartFile file, EduSubjectService subjectService);

    //课程分类列表（树形）
    List<OneSubject> getAllOneTwoSubject();
}
