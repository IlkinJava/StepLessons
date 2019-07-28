public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
//        new MyThread().start();
//        new MyThread().start();
//        new MyThread().start();


//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread runnable = new Thread(myRunnable);
//        runnable.start();

//        Runnable runnable = () -> System.out.println("Thread with anon class");
//        Thread thread = new Thread(runnable);
//        thread.start();

//        Thread.sleep(1000);

//        myThread.join();



        System.out.println(Thread.currentThread().getName());
    }
}
