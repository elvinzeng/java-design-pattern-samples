package com.gelvt.gofdp.chain;

import java.util.regex.Pattern;

/**
 * 允许用户匿名访问指定url
 * @author: Elvin Zeng
 * @date: 17-7-23.
 */
public class AnonymousFilter extends SecurityFilter{

    private String urlPattern;

    public AnonymousFilter(String urlPattern) {
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
            response.writeString(String.format("当前路径[%s]允许匿名访问", request.getUrl()));
        }else{
            doNext(request, response);
        }
    }
}
