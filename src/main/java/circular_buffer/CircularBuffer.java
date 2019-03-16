package circular_buffer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CircularBuffer {
    private final Lock lock = new ReentrantLock();
    private final int MAX_SIZE = 10;
    private int currentSize;
    private Node newest;
    private Node oldest;

    CircularBuffer(){
        this.newest = null;
        this.oldest = null;
        this.currentSize = 0;
    }

    public void add() {
        lock.lock();
    }

    private static class Node {
        private final String value;
        private final Node next;
        private Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}