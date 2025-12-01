class SumRun implements Runnable {
    private int n;

    public SumRun(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + ": " + sum);
    }
}

class PrimeRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SumRun(100));
        Thread t2 = new Thread(new PrimeRun());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads completed!");
    }
}