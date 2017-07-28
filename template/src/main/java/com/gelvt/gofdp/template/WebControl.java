package com.gelvt.gofdp.template;

import java.util.Map;

/**
 * 仿ASP.NET Web控件抽象基类
 * @author: Elvin Zeng
 * @date: 17-7-28.
 */
public abstract class WebControl {
    private String id;

    /**
     * @return 返回控件对应的html标签的Tag名
     */
    protected abstract String getTagName();

    /**
     * @return web控件对应的html标签的属性。key为名，value为值。
     */
    protected abstract Map<String, String> getAttributes();

    /**
     * 渲染内容
     * @param writer Html writer
     */
    protected abstract void renderContents(HtmlTextWriter writer);

    /**
     * 渲染控件
     */
    public void renderWebControl(){
        HtmlTextWriter writer = new HtmlTextWriter();
        writer.write(String.format("<%s", getTagName()));
        Map<String, String> attributes = getAttributes();
        for(Map.Entry<String, String> entry : attributes.entrySet()){
            writer.write(String.format(" %s=\"%s\"", entry.getKey(),
                    entry.getValue()));
        }
        writer.write(">");
        renderContents(writer);
        writer.write(String.format("</%s>", getTagName()));
    }
}
