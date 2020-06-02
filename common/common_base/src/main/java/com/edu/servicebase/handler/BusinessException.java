package com.edu.servicebase.handler;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 自定义异常类，包含了有参合无参构造器
 * @author: zzx
 * @createDate: 2020/6/2
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends RuntimeException {
    private Integer code;//状态码
    private String msg;//异常消息
}
