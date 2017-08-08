package com.gelvt.gofdp.mediator;

/**
 * 音效播放器
 * @author: Elvin Zeng
 * @date: 17-8-8
 */
public class AudioPlayer extends EventHandler{

    public AudioPlayer(EventBus eventBus) {
        super(eventBus);
    }

    @Override
    public void handle(Object message) {
        System.out.println("播放音效[" + message.toString() + "]");
    }
}
