package com.gelvt.gofdp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务器状态监视组件
 * @author: Elvin Zeng
 * @date: 17-7-25.
 */
public class ServerStateMonitor {
    private List<ServerStateListener> serverStateChangeListeners;
    private boolean monitorStarted;
    private Thread worker;

    public ServerStateMonitor(){
        this.serverStateChangeListeners = new ArrayList<>();
        monitorStarted = false;
    }

    public void addStateChangeListener(ServerStateListener listener){
        serverStateChangeListeners.add(listener);
    }

    public void removeStateChangeListener(ServerStateListener listener){
        serverStateChangeListeners.remove(listener);
    }

    /**
     * 开始监控
     */
    public void start(){
        this.worker = new Thread(){
            @Override
            public void run(){
                ServerState state = ServerState.DOWN;
                while (monitorStarted){
                    //  这里仅是模拟程序
                    if (state == ServerState.DOWN){
                        state = ServerState.RUNNING;
                    }else{
                        state = ServerState.DOWN;
                    }

                    for (ServerStateListener listener : serverStateChangeListeners){
                        listener.stateChanged(ServerStateMonitor.this, state);
                    }

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        this.monitorStarted = true;
        this.worker.start();
    }

    /**
     * 停止监控
     */
    public void stop(){
        this.monitorStarted = false;
    }
}
