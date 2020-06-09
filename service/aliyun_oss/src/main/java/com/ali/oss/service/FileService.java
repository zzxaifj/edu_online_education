package com.ali.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @description: 文件上传
 * @author: zzx
 * @createDate: 2020/6/8
 * @version: 1.0
 */
public interface FileService {
    /**
    * @Description 文件上传至阿里云
    * @Author zhengzhaoxiang
    * @Date 2020/6/8 21:31
    * @Param [file]
    * @Return java.lang.String
    */
    String upload(MultipartFile file);
}
