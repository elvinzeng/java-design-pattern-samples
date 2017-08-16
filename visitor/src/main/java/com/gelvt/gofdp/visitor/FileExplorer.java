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
     * 从指定的目录开始用访问者遍历文件树
     * @param visitor 访问者
     * @param directoryInfo 要遍历的目录
     */
    private void traverseFileTree(FileTreeVisitor visitor, DirectoryInfo directoryInfo){
        System.out.println("path: " + directoryInfo.getPath());
        directoryInfo.traverseFileTree(visitor);
    }

    /**
     * 从当前所在目录开始用访问者遍历文件树
     * @param visitor 访问者
     */
    public void traverseFileTree(FileTreeVisitor visitor){
        traverseFileTree(visitor, currentDirectory);
    }
}
