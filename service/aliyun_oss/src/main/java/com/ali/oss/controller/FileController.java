package com.ali.oss.controller;

import com.ali.oss.service.FileService;
import com.edu.tools.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/8
 * @version: 1.0
 */
@Api(description="阿里云文件管理")
@RestController
@CrossOrigin
@RequestMapping("/eduoss/fileoss")
public class FileController {

    @Autowired
    private FileService fileService;

    /**
    * @Description 文件上传
    * @Author zhengzhaoxiang
    * @Date 2020/6/8 22:41
    * @Param [file]
    * @Return R
    */
    @ApiOperation(value = "文件上传")
    @PostMapping("upload")
    public R upload(
            @ApiParam(name = "file", value = "文件", required = true)
            @RequestParam("file") MultipartFile file) {

        String uploadUrl = fileService.upload(file);
        //返回r对象
        return R.ok().message("文件上传成功").data("url", uploadUrl);
    }
}
