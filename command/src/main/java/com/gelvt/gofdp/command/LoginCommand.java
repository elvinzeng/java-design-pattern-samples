package com.gelvt.gofdp.command;

/**
 * 登录命令
 * @author: Elvin Zeng
 * @date: 17-7-30.
 */
public class LoginCommand implements Command {

    private String[] parameters;

    private UserService userService = new UserService();

    @Override
    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public void execute() {
        userService.login(parameters[0], parameters[1]);
    }
}
