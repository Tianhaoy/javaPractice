package com.thy.io.字节流;

import java.io.IOException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 15:52
 */
public class IOUtilTest2 {
    public static void main(String[] args) {
        try {
            IoUtil.printHexByByteArray("F:\\\\java demo\\\\dtt\\\\文本记录\\\\备份\\\\Noname1.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
