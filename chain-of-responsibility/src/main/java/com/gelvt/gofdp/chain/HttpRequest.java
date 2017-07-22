package com.gelvt.gofdp.chain;

/**
 * HTTP请求
 * @author: Elvin Zeng
 * @date: 17-7-23.
 */
public class HttpRequest {
    private String url;
    //  这里为了简化代码直接用Object
    //  记得在真实的系统中这里可以是User之类的模型类
    private Object user;
    //  当前用户的角色名
    private String currentRoleName;
    //  这里省略一堆属性


    public HttpRequest(String url, Object user, String currentRoleName) {
        this.url = url;
        this.user = user;
        this.currentRoleName = currentRoleName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public String getCurrentRoleName() {
        return currentRoleName;
    }

    public void setCurrentRoleName(String currentRoleName) {
        this.currentRoleName = currentRoleName;
    }
}
