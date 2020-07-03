package com.thy.lambda;

/**
 * @Author 皓宇QAQ
 * @Date 2020/7/3 22:33
 * @Description: 消息传输格式化转换接口
 */
@FunctionalInterface
public interface IMessageFormat {

    /**
     * 消息转换方法
     * @param message 要转换的消息
     * @param format 转换的格式【xml/json】
     * @return 返回转换后的数据
     */
    String format(String message,String format);

}
