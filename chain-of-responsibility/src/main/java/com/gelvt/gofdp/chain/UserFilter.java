package com.gelvt.gofdp.chain;

import java.util.regex.Pattern;

/**
 * 用户过滤器
 * 限制对指定URL的请求必须已经登录
 * @author: Elvin Zeng
 * @date: 17-7-23.
 */
public class UserFilter extends SecurityFilter{
    private String urlPattern;

    public UserFilter(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    @Override
    public void doFilter(HttpRequest request, HttpResponse response) {
        if(Pattern.matches(urlPattern, request.getUrl())){
            if (null == request.getUser()){
                response.writeString(String.format("当前路径[%s]必须要登录才能访问",
                        request.getUrl()));
                return;
            }
        }
        doNext(request, response);
    }
}
