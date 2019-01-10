package QueueConstructor;

import java.util.Arrays;

public class QueueBuilder {
    private int head = 0, tail = 0;
    private int[] queue;

    public QueueBuilder() {
        this(10);
    }

    public QueueBuilder(int length) {
        if (length < 10) {
            length = 10;
        }
        queue = new int[length];
    }

    public void push(int item) {
        queue[tail] = item;
        tail++;
        if (tail >= queue.length) {
            tail = tail % queue.length;
        }
        if (tail == head) {
            resize();
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int result = queue[head];
        head++;
        if (head >= queue.length) {
            head = head % queue.length;
        }
        return result;
    }

    public boolean isEmpty() {
        if (head == tail) {
            return true;
        } else {
            return false;
        }
    }

    /*扩容*/
    private void resize() {
        tail = tail + queue.length;
        queue = Arrays.copyOf(queue, queue.length * 2);
    }

}
