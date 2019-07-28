package atomic_example;

import java.util.concurrent.atomic.AtomicInteger;

public class WithAtomic {
    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        for (int j = 0; j < 10_000; j++) {
            new MyThread().start();
        }

        Thread.sleep(2000);
        System.out.println(i.get());

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            i.incrementAndGet();
        }
    }
}
