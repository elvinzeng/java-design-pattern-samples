package com.gelvt.gofdp;

import com.gelvt.gofdp.visitor.*;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public class App {
    public static void main(String[] args) {
        FileExplorer fileExplorer = new FileExplorer();
        fileExplorer.setCurrentDirectory(generateTestDir());

        System.out.printf("显示目录结构 ");
        fileExplorer.traverseFileTree(new DirectoryStructureDisplayer(2));

        System.out.println("\n");
        System.out.println("=======================");
        System.out.println("搜索名称包含'.rmvb'的文件");
        fileExplorer.traverseFileTree(new FileSearcher("\\.rmvb"));
    }

    /**
     * @return 用于测试的目录结构
     */
    private static DirectoryInfo generateTestDir(){
        DirectoryInfo homeDirectory = new DirectoryInfo("/home/elvin");
        RegularFileInfo file1 = new RegularFileInfo("MySql从删库到跑路.pdf");
        homeDirectory.add(file1);

        DirectoryInfo videoDir = new DirectoryInfo("/home/elvin/video");
        homeDirectory.add(videoDir);
        RegularFileInfo videoFile1 = new RegularFileInfo("新年第一天.avi");
        videoDir.add(videoFile1);
        RegularFileInfo videoFile2 = new RegularFileInfo("生日.rmvb");
        videoDir.add(videoFile2);
        DirectoryInfo videoDir2 = new DirectoryInfo("/home/elvin/video/不可描述");
        videoDir.add(videoDir2);
        RegularFileInfo videoFile3 = new RegularFileInfo("事務室の一日.rmvb");
        videoDir2.add(videoFile3);
        RegularFileInfo videoFile4 = new RegularFileInfo("Bug輝の一日.rmvb");
        videoDir2.add(videoFile4);

        DirectoryInfo photoDir = new DirectoryInfo("/home/elvin/photo");
        homeDirectory.add(photoDir);
        RegularFileInfo photo1 = new RegularFileInfo("除夕全家福.png");
        photoDir.add(photo1);

        return homeDirectory;
    }

}
