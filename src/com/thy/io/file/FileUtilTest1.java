package com.thy.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/13 15:41
 */
public class FileUtilTest1 {
    public static void main(String[] args)throws IOException {
        FileUtils.listDirectory(new File("F:\\java demo"));

    }
}
