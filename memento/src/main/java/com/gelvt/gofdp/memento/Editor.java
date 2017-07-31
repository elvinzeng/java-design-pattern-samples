package com.gelvt.gofdp.memento;

/**
 * 文本编辑器模型
 * @author: Elvin Zeng
 * @date: 17-7-31.
 */
public class Editor {
    private String author;
    private String content;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 创建编辑器当前状态的快照（生成一个版本）
     * @return 当前版本
     */
    public Version snapshoot(){
        Version version = new Version();
        version.setAuthor(this.author);
        version.setContent(this.content);
        return version;
    }

    /**
     * 恢复历史版本
     * @param version 要恢复的历史版本
     */
    public void revertSnapshot(Version version){
        this.content = version.getContent();
        this.author = version.getAuthor();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
