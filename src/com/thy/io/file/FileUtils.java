package com.thy.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO(列出File的一些常用操作比如过滤，遍历等操作)
 * @Author ASUS
 * @Date 2019/10/13 15:35
 */
public class FileUtils {
    /**
     * 列出制定目录下（包括其子目录）的所有文件
     * @param dir
     * @throws IOException
     */
    public  static void listDirectory(File dir) throws IOException{
    if (!dir.exists()){
        throw  new IllegalArgumentException("目录："+dir+"不存在");
    }
    if (!dir.isDirectory()){
        throw new IllegalArgumentException(dir+"不是目录");
    }
   /* String [] filename = dir.list();//返回的是字符串数组 直接子的名称，不办函子目录
    for (String string:filename){
        System.out.println(dir + "\\" +string);
    }*/
   //如果要遍历子目录下的内容就需要构造成File对象做递归操作，File提供了直接返回File对象的API
        File [] files = dir.listFiles();//返回的是直接子目录（文件）的抽象
        if (files!=null && files.length>0){
            for (File file :files){
                if (file.isDirectory()){
                    //递归
                    listDirectory(file); //在调用这个listDirectory方法 遍历出子目录 知道不是目录了 进入else输出
                }else{
                    System.out.println(file);
                }
            }
        }

    }
}
