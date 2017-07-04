package com.gelvt.gofdp;

import com.gelvt.gofdp.facade.ImageProcessService;

import java.io.File;
import java.io.IOException;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-21.
 */
public class App {
    public static void main(String[] args) throws IOException,
            InterruptedException {
        ImageProcessService imageProcessService =
                new ImageProcessService(getCurrentUserId());

        for (int i = 0; i < 10; i++){
            System.out.println("--------------------");
            //  创建一张用于测试的"图片"
            File testImage = File.createTempFile("com.gelvt.gofdp.facade.test",
                    ".png");

            imageProcessService.scaleImage(testImage, 100, 120);
            imageProcessService.watermark(testImage, "My name is Elvin Zeng");
        }
    }

    private static Integer getCurrentUserId(){
        //  这里获取当前登录的用户的用户id
        return 1993;
    }
}
