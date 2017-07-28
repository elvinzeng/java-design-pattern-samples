package com.gelvt.gofdp.template;

import java.util.HashMap;
import java.util.Map;

/**
 * 按钮控件
 * @author: Elvin Zeng
 * @date: 17-7-28.
 */
public class Button extends WebControl{

    private Type type;
    private String content;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected String getTagName() {
        return "button";
    }

    @Override
    protected Map<String, String> getAttributes() {
        Map<String, String> attributes = new HashMap<>();
        attributes.put("type", getType().getValue());
        return attributes;
    }

    @Override
    protected void renderContents(HtmlTextWriter writer) {
        writer.write(content);
    }

    public static enum Type{
        BUTTON("button"),
        RESET("reset"),
        SUBMIT("submit")
        ;

        private String value;

        Type(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
