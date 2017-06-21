package com.gelvt.gofdp;

import com.gelvt.gofdp.singleton.ApplicationContext;

import java.util.Date;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-21.
 */
public class App {
    public static void main(String[] args){
        System.out.println("hello singleton!");

        ApplicationContext ctx = ApplicationContext.getInstance();

        ctx.setConfig("log.level", "warn");
        ctx.setConfig("dal.printSQL", true);
        ctx.setConfig("author", "Elvin Zeng");
        ctx.setConfig("version", "0.1.0");
        ctx.setConfig("startTime", new Date());

        System.out.println("dal.printSQL: " + ctx.removeConfig("dal.printSQL"));

        System.out.println("config list:");
        for(String key : ctx.getConfigKeys()){
            System.out.println(key + ": " + ctx.getConfig(key).toString());
        }

        ApplicationContext ctx1 = ApplicationContext.getInstance();

        ctx1.clearConfig();
        ctx1.setConfig("stopTime", new Date());
        System.out.println("config list:");
        for(String key : ctx.getConfigKeys()){
            System.out.println(key + ": " + ctx.getConfig(key).toString());
        }
    }
}
