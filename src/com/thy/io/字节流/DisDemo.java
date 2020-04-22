package com.thy.io.字节流;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 16:31
 */
public class DisDemo {
    public static void main(String[] args) throws IOException {
        String file = "demo/dos.dat";
        IoUtil.printHex(file);
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        int i = dis.readInt();
        System.out.println(i);
        i = dis.readInt();
        System.out.println(i);
        long l =dis.readLong();
        System.out.println(l);
        double d = dis.readDouble();
        System.out.println(d);
        String s = dis.readUTF();
        System.out.println(s);
        dis.close();
    }
}
