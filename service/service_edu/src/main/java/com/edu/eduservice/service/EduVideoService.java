package com.edu.eduservice.service;

import com.edu.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @Description 课程视频 服务类
* @Author zhengzhaoxiang
* @Date 2020/6/13 23:32
* @Param
* @Return
*/
public interface EduVideoService extends IService<EduVideo> {

    void removeVideoByCourseId(String courseId);
}
