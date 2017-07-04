package com.gelvt.gofdp.facade;

import java.util.Random;

/**
 * 调用频率控制组件
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class RateLimiter {
    private static RateLimiter instance;
    private static Object lck = new Object();
    private Integer rate;
    private Random random = new Random(System.currentTimeMillis());

    private RateLimiter(Integer rate){
        this.rate = rate;
    }

    public static RateLimiter create(Integer rate) {
        if (null == instance) {
            synchronized (lck) {
                if (null == instance) {
                    instance = new RateLimiter(rate);
                }
            }
        }
        return instance;
    }

    /**
     * 当超过限制时被阻塞。成功获得令牌的话直接返回。
     */
    public void acquire() throws InterruptedException {
        //  这里只是一个模拟程序
        //  真实系统中自己实现个令牌桶 ^_^
        while (3 < random.nextInt(5)){
            System.out.println("操作过快，被阻塞了...");
            Thread.sleep(2000);
        }
    }
}
