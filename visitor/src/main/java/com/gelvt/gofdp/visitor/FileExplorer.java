package com.gelvt.gofdp.visitor;

/**
 * 文件管理器
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public class FileExplorer {
    private DirectoryInfo currentDirectory;  //  当前目录

    public DirectoryInfo getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(DirectoryInfo currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    /**
     * 从当前所在目录开始用访问者遍历文件树
     * @param visitor 访问者
     */
    public void traverseFileTree(FileInfoVisitor visitor){
        currentDirectory.traverseFileTree(visitor);
    }
}
