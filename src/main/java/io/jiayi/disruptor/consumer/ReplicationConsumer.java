package io.jiayi.disruptor.consumer;

import com.lmax.disruptor.EventHandler;
import io.jiayi.disruptor.event.LongEvent;

/**
 * 将输入数据发送到另一台机器以确保存在数据的远程副本的消费者
 */
public class ReplicationConsumer implements EventHandler<LongEvent> {
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
        System.out.println(Thread.currentThread().getName() + "Replication Event: " +  event.getValue());
    }
}