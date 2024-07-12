package io.jiayi.disruptor.consumer;

import com.lmax.disruptor.EventHandler;
import io.jiayi.disruptor.event.LongEvent;

/**
 * 业务消费者
 */
public class ApplicationConsumer implements EventHandler<LongEvent> {
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
        System.out.println(Thread.currentThread().getName() + "Application Event: " + event.getValue());
    }
}