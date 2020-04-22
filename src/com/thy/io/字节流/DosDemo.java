package com.thy.io.字节流;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 16:23
 */
public class DosDemo {
    public static void main(String[] args) throws IOException {
        String file = "demo/dos.dat";
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.write(10);
        dos.writeInt(-10);
        dos.writeLong(10);
        dos.writeDouble(10.5);
        //采用utf-8编码写出
        dos.writeUTF("中国");
        //采用utf-16be编码写出
        dos.writeChars("中国");
        dos.close();
        IoUtil.printHex(file);
    }
}
