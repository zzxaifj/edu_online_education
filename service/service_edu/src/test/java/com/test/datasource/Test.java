package com.test.datasource;

import com.alibaba.excel.EasyExcel;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/1
 * @version: 1.0
 */
public class Test {

    @org.junit.Test
    public void test(){
        //1、设置写入文件夹地址和Excel文件名称
        String filename = "E:\\Project\\write.xlsx";
        //2、Excel 读取操作
        //EasyExcel.read(filename,DemoData.class,new ExcelListener()).sheet().doRead();
//        //2、造数据
//        DemoData demoData = new DemoData();
//        demoData.setSno(1);
//        demoData.setSname("zzx");
//        List<DemoData> list = Arrays.asList(demoData);
//        //3、调用 easyExcel 中的write 方法写数据
//        EasyExcel.write(filename, DemoData.class).sheet("学生列表").doWrite(list);
    }
}
