package com.thy.lambda.impl;

import com.thy.lambda.IUserCredential;

/**
 * @Author 皓宇QAQ
 * @Date 2020/7/3 22:36
 * @Description:
 */
public class UserCredentialImpl implements IUserCredential {
    @Override
    public String verifyUser(String username) {
        if ("admin".equals(username)){
            return "系统管理员";
        }else if ("manage".equals(username)){
            return  "用户管理员";
        }
        return "普通会员";
    }
}
