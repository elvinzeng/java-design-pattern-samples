package com.gelvt.gofdp.flyweight;

/**
 * 方块类型
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public enum BlockType {
    /**
     * 雪块
     */
    SNOW_BRICK("雪块"),
    /**
     * 石质砖块
     */
    STONE_BRICK("石质砖块"),
    /**
     * 木质砖块
     */
    WOOD_BRICK("木质砖块")
    ;

    private String value;
    BlockType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
