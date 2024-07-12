package io.jiayi.disruptor.consumer;

import com.lmax.disruptor.EventHandler;
import io.jiayi.disruptor.event.LongEvent;

/**
 * 将输入数据写入持久性日志文件的消费者
 */
public class JournalConsumer implements EventHandler<LongEvent> {
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
        System.out.println(Thread.currentThread().getName() + "Persist Event: " +  event.getValue());
    }
}