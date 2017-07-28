package com.gelvt.gofdp.template;

import java.util.HashMap;
import java.util.Map;

/**
 * Label控件
 * @author: Elvin Zeng
 * @date: 17-7-28.
 */
public class Label extends WebControl{
    private String targetInputElement;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTargetInputElement() {
        return targetInputElement;
    }

    public void setTargetInputElement(String targetInputElement) {
        this.targetInputElement = targetInputElement;
    }

    @Override
    protected String getTagName() {
        return "label";
    }

    @Override
    protected Map<String, String> getAttributes() {
        Map<String, String> attributes = new HashMap<>();
        attributes.put("for", getTargetInputElement());
        return attributes;
    }

    @Override
    protected void renderContents(HtmlTextWriter writer) {
        writer.write(content);
    }
}
