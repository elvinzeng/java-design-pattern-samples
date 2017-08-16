package com.gelvt.gofdp.visitor;

/**
 * 目录结构现实Visitor
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public class DirectoryStructureDisplayer implements FileInfoVisitor {
    private int basePathDepth;

    public DirectoryStructureDisplayer(int basePathDepth) {
        this.basePathDepth = basePathDepth;
    }

    @Override
    public void visitFile(RegularFileInfo file) {
        int depth = file.getPath().split("/").length - basePathDepth - 1;
        for(int i = 0; i < depth; i++){
            System.out.printf("    ");
        }
        if (depth > 0){
            System.out.printf("|--");
        }
        System.out.println(file.getName());
    }

    @Override
    public void visitFile(DirectoryInfo directory) {
        int depth = directory.getPath().split("/").length - basePathDepth - 1;
        for(int i = 0; i < depth; i++){
            System.out.printf("    ");
        }
        if (depth > 0){
            System.out.printf("|--");
        }
        System.out.println(directory.getName() + "/");
    }
}
