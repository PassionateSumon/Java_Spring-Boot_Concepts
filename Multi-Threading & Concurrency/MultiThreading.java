class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread: " + t.getName() + " Priority: " + t.getPriority());
    }
}



public class MultiThreading {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
