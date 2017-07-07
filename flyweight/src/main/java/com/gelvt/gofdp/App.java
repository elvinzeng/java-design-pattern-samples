package com.gelvt.gofdp;

import com.gelvt.gofdp.flyweight.Block;
import com.gelvt.gofdp.flyweight.BlockFactory;
import com.gelvt.gofdp.flyweight.BlockType;

import java.util.Random;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-7.
 */
public class App {
    public static void main(String[] args){
        BlockFactory blockFactory = BlockFactory.getInstance();
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++){
            int t = random.nextInt(3);
            Block block = null;
            if (t == 0){
                block = blockFactory.getBlock(BlockType.WOOD_BRICK);
            } else if (t == 1){
                block = blockFactory.getBlock(BlockType.STONE_BRICK);
            }else{
                block = blockFactory.getBlock(BlockType.SNOW_BRICK);
            }

            System.out.println(block.getBrickTypeName());

            int x = random.nextInt(30);
            int y = random.nextInt(30);
            int z = random.nextInt(30);
            block.put(x, y, z);

            block.dismantle(x, y, z);

            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
