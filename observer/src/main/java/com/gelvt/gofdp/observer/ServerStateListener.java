package com.gelvt.gofdp.observer;

/**
 * 服务器状态变更监听器
 * @author: Elvin Zeng
 * @date: 17-7-25.
 */
public interface ServerStateListener {

    /**
     * 服务器状态变更
     * @param sender 发送者
     * @param currentState 新的状态
     */
    void stateChanged(ServerStateMonitor sender, ServerState currentState);
}
