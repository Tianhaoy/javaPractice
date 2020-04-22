package com.thy.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO(File的常用API介绍)
 * @Author ASUS
 * @Date 2019/10/13 15:17
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("F:\\java demo\\c");
        System.out.println(file.exists());//判断这个文件目录存不存在
        if(!file.exists())
            file.mkdir();//file.mkdirs() 创建多级目录
        else
            file.delete();
        //是否是一个目录
        System.out.println(file.isDirectory());
        //是否是一个文件
        System.out.println(file.isFile());

        File file2 = new File("F:\\java demo","12.txt");
        if (!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            file2.delete();
            //常用的File对象的API
            System.out.println(file);//file.toString（）的内容
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file2.getName());
            System.out.println(file.getParent());//父目录
            System.out.println(file2.getParent());
            System.out.println(file.getParentFile().getAbsolutePath());
        }

    }
}
