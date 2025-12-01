class OurThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
            sum = sum + k;
        }
        System.out.println("TOTAL: " + sum);
    }
}

class OurThread2 extends Thread {
    @Override
    public void run() {
        for (int k = 100; k >= 0; k--) {
            System.out.println(k);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        OurThread th = new OurThread();
        th.start();

        OurThread2 th2 = new OurThread2();
        th2.start();

        System.out.println("Hi");
        System.out.println("Done");

        Thread mythread = new Thread() {
            @Override
            public void run() {
                System.out.println("Welcome");
            }
        };
        mythread.start();
    }
}
