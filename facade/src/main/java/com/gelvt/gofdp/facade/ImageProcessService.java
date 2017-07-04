package com.gelvt.gofdp.facade;

import java.io.File;

/**
 * 图片处理服务
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class ImageProcessService {
    private Integer currentUserId;
    private RateLimiter rateLimiter = RateLimiter.create(10);
    private BillingService billingService = new BillingService();
    private FileManager fileManager = new FileManager();

    public ImageProcessService(Integer currentUserId){
        this.currentUserId = currentUserId;
    }

    /**
     * 缩放图片
     * @param image 图片文件
     * @param width 宽度
     * @param height 高度
     * @throws InterruptedException
     */
    public void scaleImage(File image, double width, double height)
            throws InterruptedException {
        rateLimiter.acquire();
        System.out.println("对图片[" + image.getPath() + "]进行缩放操作");
        fileManager.saveFile(image);
        billingService.charge(currentUserId, BillingService.BILLING_TYPE_PROCESS_IMG);
    }

    /**
     * 图片加水印
     * @param image 图片文件
     * @param content 水印内容
     * @throws InterruptedException
     */
    public void watermark(File image, String content) throws InterruptedException {
        rateLimiter.acquire();
        System.out.println("对图片[" + image.getPath() + "]加水印:" + content);
        fileManager.saveFile(image);
        billingService.charge(currentUserId, BillingService.BILLING_TYPE_PROCESS_IMG);
    }
}
