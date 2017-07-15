package com.gelvt.gofdp.bridge;

import java.util.Arrays;

/**
 * 数组操作工具类
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public class ArrayUtils {
    /**
     * 合并数组
     * @param arrays 源数组
     * @return 合并之后的数组
     */
    static byte[] concat(byte[]... arrays) {
        int len = Arrays.stream(arrays).map(e -> e.length)
                .reduce(0, Integer::sum);
        byte[] target = new byte[len];
        int index = 0;
        for (byte[] array : arrays){
            System.arraycopy(array, 0, target, index, array.length);
            index += array.length;
        }
        return target;
    }
}
