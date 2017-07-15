package com.gelvt.gofdp;

import com.gelvt.gofdp.proxy.ModelFile;
import com.gelvt.gofdp.proxy.Polygon;
import com.gelvt.gofdp.proxy.StlModelFileProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-13.
 */
public class App {
    public static void main(String[] args){
        //  先创建一批模型文件代理对象
        List<ModelFile> modelFileList = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            ModelFile modelFile = createModelProxy();
            modelFileList.add(modelFile);
            System.out.println("模型文件名: " + modelFile.getName());
            System.out.println("模型文件Uri: " + modelFile.getUri());
        }

        System.out.println("------------------------");

        //  但是当前场景中实际上只需要使用到第3个模型的真实数据
        ModelFile modelFile = modelFileList.get(2);
        loadRealModelFile(modelFile);

    }

    private static ModelFile createModelProxy(){
        long t1 = System.currentTimeMillis();
        System.out.println("正在创建模型文件代理对象...");
        ModelFile modelFile = new StlModelFileProxy(
                "https://github.com/elvinzeng/stl2png/blob/master/test_stl/Hulk.stl",
                "Hulk");
        long t2 = System.currentTimeMillis();
        System.out.println("创建代理耗时：" + (t2 - t1) + "毫秒");
        return modelFile;
    }

    private static void loadRealModelFile(ModelFile modelFile){
        long t1 = System.currentTimeMillis();
        System.out.println("正在加载真实文件...");
        List<Polygon> polygonList = modelFile.getPolygons();
        long t2 = System.currentTimeMillis();
        System.out.println("加载真实文件耗时：" + (t2 - t1) + "毫秒");
    }
}
