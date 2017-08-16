package com.gelvt.gofdp.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 目录描述信息
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public class DirectoryInfo extends FileInfo {
    private List<FileInfo> children;

    public DirectoryInfo(String path) {
        String[] pathParts = path.split("/");
        this.setName(pathParts[pathParts.length - 1]);
        this.setPath(path);
        children = new LinkedList<>();
    }

    @Override
    public void traverseFileTree(FileInfoVisitor visitor) {
        visitor.visitFile(this);
        for(FileInfo file : children){
            file.traverseFileTree(visitor);
        }
    }

    /**
     * @return 子节点总数
     */
    public int countChildren() {
        return children.size();
    }

    /**
     * 往目录中添加文件
     * @param fileInfo 待添加文件的描述信息
     */
    public void add(FileInfo fileInfo) {
        children.add(fileInfo);
        fileInfo.setPath(getPath() + "/" + fileInfo.getName());
    }

    /**
     * 从目录中移除文件
     * @param fileInfo 待移除文件
     */
    public void remove(FileInfo fileInfo) {
        children.remove(fileInfo);
    }

    /**
     * 清空目录
     */
    public void clear() {
        children.clear();
    }

    @Override
    public String toString() {
        return "DirectoryInfo{" +
                "path='" + getPath() + '\'' +
                '}';
    }
}
