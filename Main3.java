
public class Main3 {
    public static void main(String[] args) {

        SumThread sumThread = new SumThread(100);
        PrimeThread primeThread = new PrimeThread();
        CsvThread csvThread = new CsvThread();
        sumThread.start();
        primeThread.start();
        csvThread.start();
        try {
            sumThread.join();
            primeThread.join();
            csvThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads completed.");
    }
}