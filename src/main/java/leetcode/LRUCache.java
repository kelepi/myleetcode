package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Patrick on 15/3/10.
 *
 * 不能用时间戳。要自己实现一个 priorityQueue
 */
public class LRUCache {
    private final int capacity_;
    private Map<Integer, TimeStampedValue> map = new HashMap<Integer, TimeStampedValue>();
    private PriorityQueue<TimeStampedValue> queue = new PriorityQueue<TimeStampedValue>();
    private int curCapacity;

    public LRUCache(int capacity) {
        capacity_ = capacity;
        curCapacity = 0;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            TimeStampedValue timeStampedValue = map.get(key);
            timeStampedValue.updateTimeStamp();
            queue.remove(timeStampedValue);
            queue.add(timeStampedValue);
            return timeStampedValue.val_;
        } else
            return -1;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            TimeStampedValue timeStampedValue = map.get(key);
            timeStampedValue.updateTimeStamp();
            timeStampedValue.val_ = value;
            queue.remove(timeStampedValue);
            queue.add(timeStampedValue);
        } else {
            if (curCapacity == capacity_) {
                TimeStampedValue timeStampedValue = queue.poll();
                map.remove(timeStampedValue.key_);
                curCapacity--;
            }
            TimeStampedValue val = new TimeStampedValue(key, value);
            queue.add(val);
            map.put(key, val);
            curCapacity++;
        }
    }

}

class TimeStampedValue implements Comparable<TimeStampedValue> {
    static AtomicInteger cnt = new AtomicInteger();
    int key_;
    int val_;
    long timeStamp;

    public TimeStampedValue(int key, int val) {
        key_ = key;
        val_ = val;
        timeStamp = cnt.getAndIncrement();
    }

    public void updateTimeStamp() {
        timeStamp = cnt.getAndIncrement();
    }

    @Override
    public int compareTo(TimeStampedValue timeStampedValue) {
        return timeStamp > timeStampedValue.timeStamp ? 1 : timeStamp == timeStampedValue.timeStamp ? 0 : -1;
    }
}