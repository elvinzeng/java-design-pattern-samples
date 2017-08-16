package com.gelvt.gofdp.visitor;

import java.util.regex.Pattern;

/**
 * 文件搜索Visitor
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public class FileSearcher implements FileTreeVisitor {
    private Pattern fileNamePattern;

    public FileSearcher(String fileNamePattern) {
        this.fileNamePattern = Pattern.compile(fileNamePattern);
    }

    @Override
    public void visitFile(RegularFileInfo file) {
        if (fileNamePattern.matcher(file.getPath()).find()){
            System.out.println(file.getPath());
        }
    }

    @Override
    public void visitFile(DirectoryInfo directory) {
        if (fileNamePattern.matcher(directory.getPath()).find()){
            System.out.println(directory.getPath());
        }
    }
}
