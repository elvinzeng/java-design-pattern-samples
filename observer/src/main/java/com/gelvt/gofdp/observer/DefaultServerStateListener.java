package com.gelvt.gofdp.observer;

/**
 * 默认的服务器状态监听器
 * @author: Elvin Zeng
 * @date: 17-7-25.
 */
public class DefaultServerStateListener implements ServerStateListener {
    @Override
    public void stateChanged(ServerStateMonitor sender, ServerState currentState) {
        System.out.println("发送邮件给管理员，内容：服务器状态又改变了，当前状态：" + currentState);
    }
}
