package com.gelvt.gofdp.flyweight;

/**
 * 方块
 * @author: Elvin Zeng
 * @date: 17-7-7.
 */
public interface Block {

    /**
     * 将方块放到指定的位置
     * @param x x坐标
     * @param y y坐标
     * @param z z坐标
     */
    void put(int x, int y, int z);

    /**
     * 拆除指定位置的方块
     * @param x x坐标
     * @param y y坐标
     * @param z z坐标
     */
    void dismantle(int x, int y, int z);

    /**
     * @return 砖块类型名称
     */
    String getBrickTypeName();

}
