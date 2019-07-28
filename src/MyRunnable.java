public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My Runnable");
        System.out.println(Thread.currentThread().getName());
    }
}
