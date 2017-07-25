package com.gelvt.gofdp;

import com.gelvt.gofdp.observer.DefaultServerStateListener;
import com.gelvt.gofdp.observer.ServerStateMonitor;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-22.
 */
public class App {
    public static void main(String[] args){
        ServerStateMonitor monitor = new ServerStateMonitor();
        monitor.addStateChangeListener(new DefaultServerStateListener());
        monitor.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        monitor.stop();
    }
}
