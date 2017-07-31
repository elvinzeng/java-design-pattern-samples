package com.gelvt.gofdp.memento;

/**
 * 版本
 * @author: Elvin Zeng
 * @date: 17-7-31.
 */
public class Version {
    private String content;
    private String author;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Version{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
