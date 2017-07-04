package com.gelvt.gofdp.facade;

import java.io.File;

/**
 * 图片处理服务
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public interface ImageProcessFacade {
    /**
     * 缩放图片
     * @param image 图片文件
     * @param width 宽度
     * @param height 高度
     * @throws InterruptedException
     */
    public void scaleImage(File image, double width, double height)
            throws InterruptedException;

    /**
     * 图片加水印
     * @param image 图片文件
     * @param content 水印内容
     * @throws InterruptedException
     */
    public void watermark(File image, String content) throws InterruptedException;
}
