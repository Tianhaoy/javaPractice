package com.thy.io.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @Description: TODO(RandomAccessFile基本操作)
 * @Author ASUS
 * @Date 2019/10/13 16:10
 */
public class RafDemo {
    public static void main(String[] args) throws IOException {
        File demo = new File("demo");
        if (!demo.exists())
            demo.mkdir();
        File file = new File(demo,"raf.dat");
        if (!file.exists())
            file.createNewFile();

        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        //指针的位置
        System.out.println(raf.getFilePointer());

        raf.write('A');//只写了一个字节
        System.out.println(raf.getFilePointer());
        raf.write('B');

        int i = 0x7fffffff;
        //用write方法每次只能写一个字节，如果要把i写进去就得写4次
        raf.write(i>>>24);//高8位
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);
        System.out.println(raf.getFilePointer());

        //可以直接写一个int
        raf.writeInt(i);
        String s = "中";
        byte [] gbk = s.getBytes("gbk");
        raf.write(gbk);
        System.out.println(raf.length());
        System.out.println(raf.getFilePointer());
        //读文件，必须把指针移到头部
        raf.seek(0);
        //一次性读取，把文件中的内容都读到字节数组中
        byte [] buf = new byte[(int)raf.length()];
        raf.read(buf);
        System.out.print(Arrays.toString(buf));
        System.out.println();
        for (byte b:buf){
            System.out.print(Integer.toHexString(b & 0xff));
        }
        raf.close();
    }
}
