package com.test.datasource;

import com.edu.eduservice.entity.EduTeacher;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/1
 * @version: 1.0
 */
public class Test {


    @org.junit.Test
    public void test(){
        EduTeacher eduTeacher = new EduTeacher();
        eduTeacher.setName("zhengzhaoxiang");
        eduTeacher.setIntro("HaFo");
        eduTeacher.setCareer("First");
        eduTeacher.setLevel(1);
        eduTeacher.setAvatar("url");
        eduTeacher.setSort(1);
        eduTeacher.setIsDeleted(0);
    }
}
