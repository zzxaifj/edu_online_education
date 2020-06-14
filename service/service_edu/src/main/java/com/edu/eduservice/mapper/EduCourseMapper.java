package com.edu.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.eduservice.entity.EduCourse;
import com.edu.eduservice.entity.vo.CoursePublishVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author zhengzhaoxiang
 * @since 2020-06-11
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    CoursePublishVo getPublishCourseInfo(String id);
}
