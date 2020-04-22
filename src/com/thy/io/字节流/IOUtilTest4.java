package com.thy.io.字节流;

import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 16:53
 */
public class IOUtilTest4 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //IoUtil.copyFileByByte(new File("F:\\java demo\\dtt\\文本记录\\备份\\Noname1.java"),new File("F:\\java demo\\dtt\\文本记录\\备份\\aa.txt")); //50多毫秒
        //IoUtil.copyFileByBuffer(new File("F:\\java demo\\dtt\\文本记录\\备份\\Noname1.java"),new File("F:\\java demo\\dtt\\文本记录\\备份\\aa.txt"));//30多毫秒
        IoUtil.copyFile(new File("F:\\java demo\\dtt\\文本记录\\备份\\Noname1.java"),new File("F:\\java demo\\dtt\\文本记录\\备份\\aa.txt"));//10多毫秒
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
