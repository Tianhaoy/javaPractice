package com.thy.io.encode;

import java.io.UnsupportedEncodingException;

/**
 * @Description: TODO(文件的编码)
 * @Author ASUS
 * @Date 2019/10/13 14:51
 */
public class EncodeDemo {
    public static void main(String[] args) {
        String s = "慕课ABC";
        byte [] bytes1 = s.getBytes();//转换成字节序列用的项目默认的编码utf-8
        //utf-8编码中文占用3个字节，英文占用1个字节
        for (byte b:bytes1){
            //把字节（转换成了int）以16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();
        byte [] bytes2 = new byte[0];
        try {
            bytes2 = s.getBytes("gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //gbk编码中文占用两个字节，英文占用1个字节
        for (byte b:bytes2){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();
        //java是双字节编码 utf-16be
        byte[] bytes4 = new byte[0] ;
        try {
            bytes4 = s.getBytes("utf-16be");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //utf-16be 中文占用两个字节，英文占用两个字节
        for (byte b:bytes4){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();
        /*
        当你的字节序列式某种编码时，这个时候想把字节序列变成字符串
        也需要用这种编码方式，否则会出现乱码
         */
        String str1 = new String(bytes4);
        System.out.println(str1);
        try {
            String str2 = new String(bytes4,"utf-16be");
            System.out.println(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        /**
         * 文本文件 就是字节序列
         * 可以是任意编码的字节序列
         * 如果我们在中文机器上直接创建文本文件，那么该文本文件只认识ansi编码
         * 联通，联是一种巧合，他们正好符合了utf-8的编码规则
         */
    }


}
