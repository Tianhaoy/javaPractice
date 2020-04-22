package com.thy.io.字节流;

import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 16:17
 */
public class IOUtileTest3 {
    public static void main(String[] args) {
        try {
            IoUtil.copyFile(new File(""),new File(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
