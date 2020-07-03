package com.thy.lambda;

/**
 * @Author 皓宇QAQ
 * @Date 2020/7/3 22:31
 * @Description: 用户验证接口
 */
@FunctionalInterface
public interface IUserCredential {
    /**
     * 通过用户账号，验证用户身份信息的接口
     * @param username 要验证的用户账号
     * @return 返回身份信息【系统管理员、用户管理员、普通用户】
     */
    String verifyUser(String username);
}
