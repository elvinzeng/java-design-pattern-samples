package com.gelvt.gofdp.command;

/**
 * @author: Elvin Zeng
 * @date: 17-7-30.
 */
public class UserService {
    /**
     * 登录
     * 演示程序，实际程序中如何登录失败可以在这里抛出一个自定义异常
     * @param username 用户名
     * @param password 密码
     */
    public void login(String username, String password){
        System.out.println(String.format("用户[%s]登录", username));
    }
}
