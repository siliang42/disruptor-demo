package io.jiayi.disruptor;

import com.lmax.disruptor.RingBuffer;
import io.jiayi.disruptor.event.LongEvent;

public class LongEventProducer {

    private final RingBuffer<LongEvent> ringBuffer;

    public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void onData(long abc) {
        long sequence = ringBuffer.next();
        try {
            LongEvent event = ringBuffer.get(sequence);
            event.setValue(abc);
        } finally {
            ringBuffer.publish(sequence);
        }
    }
}
