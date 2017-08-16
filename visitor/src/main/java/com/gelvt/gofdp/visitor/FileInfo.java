package com.gelvt.gofdp.visitor;

/**
 * 文件描述信息
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public abstract class FileInfo {
    private String name;  //  文件名
    private String owner;  //  文件所有者
    private String path;  //  路径

    public FileInfo(){}

    public FileInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 用访问者遍历文件树
     * @param visitor 访问者
     */
    public abstract void traverseFileTree(FileTreeVisitor visitor);
}
