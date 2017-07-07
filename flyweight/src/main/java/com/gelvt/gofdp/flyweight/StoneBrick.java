package com.gelvt.gofdp.flyweight;

/**
 * 石砖
 * @author: Elvin Zeng
 * @date: 17-7-7.
 */
public class StoneBrick implements Block{
    private String typeName;

    public StoneBrick(String typeName){
        this.typeName = typeName;
    }

    @Override
    public void put(int x, int y, int z) {
        System.out.println(String.format("在位置(%d, %d, %d)放置一个"
                + this.typeName, x, y, z));
    }

    @Override
    public void dismantle(int x, int y, int z) {
        System.out.println(String.format("拆毁位置(%d, %d, %d)的"
                + this.typeName, x, y, z));
    }

    @Override
    public String getBrickTypeName() {
        return typeName;
    }
}
