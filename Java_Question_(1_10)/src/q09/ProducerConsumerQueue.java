package q09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class SharedQueue {
    private Queue<Integer> q = new LinkedList<>();
    private static final int size = 10;

    public synchronized void produce(int num) {
        while (q.size() >= size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        q.add(num);
        System.out.println("Produced: " + num);
        notifyAll();  // Notify waiting threads after producing an item
    }

    public synchronized int consume() {
        while (q.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int num = q.poll();
        System.out.println("Consumed: " + num);
        notifyAll();  //  Notify waiting threads after consuming an item
        return num;
    }
}

class Producer extends Thread {
    private SharedQueue sharedQueue;
    private int prodItems = 0;
    private static final int max = 15;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        Random random = new Random();
        while (prodItems < max) {
            int num = random.nextInt(50); // Generates random numbers between 0 and 50
            sharedQueue.produce(num);
            prodItems++; // Increment the number of produced items
            try {
                Thread.sleep(1000); // Sleeps for time up to 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedQueue sharedQueue;
    private int conItems = 0;
    private static final int max = 100;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        while (conItems < max) {
            sharedQueue.consume();
            conItems++; // Increment the number of consumed items
            try {
                Thread.sleep(500); // Sleeps for 0.5 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerQueue {
	public static void main(String[] args) {

		SharedQueue sharedQueue = new SharedQueue();
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);

		producer.start();
		consumer.start();
	}
}
