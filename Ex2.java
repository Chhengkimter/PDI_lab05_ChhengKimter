import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Sum from 1 to n");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                    System.out.print("Enter n: ");
                    int n = scanner.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i;
                    }
                    System.out.println("Sum from 1 to " + n + ": " + sum);
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        scanner.close();
    }
}