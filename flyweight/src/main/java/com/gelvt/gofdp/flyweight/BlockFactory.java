package com.gelvt.gofdp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 方块工厂
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public class BlockFactory {
    private static BlockFactory instance;
    private static Object lockObj = new Object();
    private Map<BlockType, Block> blockMap;

    private BlockFactory(){
        this.blockMap = new HashMap<>();
    }

    /**
     * @return 方块工厂实例
     */
    public static BlockFactory getInstance() {
        if (null == instance){
            synchronized (lockObj){
                if (null == instance){
                    instance = new BlockFactory();
                }
            }
        }
        return instance;
    }

    /**
     * 获取指定类型的方块
     * @param type 方块类型
     * @return 方块
     */
    public Block getBlock(BlockType type){
        Block block = this.blockMap.get(type);
        if (null == block){
            switch (type){
                case WOOD_BRICK:
                    block = new WoodBrick(type.getValue());
                    break;
                case STONE_BRICK:
                    block = new StoneBrick(type.getValue());
                    break;
                case SNOW_BRICK:
                    block = new StoneBrick(type.getValue());
                    break;
                default:
                    throw new IllegalArgumentException("位置类型的砖块");
            }
            this.blockMap.put(type, block);
            System.out.println("创建了一个类型为" + type.getValue() + "的方块");
        }else{
            System.out.println("复用现有的类型为" + type.getValue() + "的方块");
        }
        return block;
    }
}
