import java.util.Scanner;

public class lab05_2 {

    void plus(int a, int b, int ans) {
        ans = a + b;
        System.out.println("Answer: " + ans);
    }

    void minus(int a, int b, int ans) {
        ans = a - b;
        System.out.println("Answer: " + ans);
    }
    
    void mul(int a, int b, int ans) {
        ans = a * b;
        System.out.println("Answer: " + ans);
    }

    void div(int a, int b, int ans) {
        ans = a / b;
        System.out.println("Answer: " + ans);
    }
    public static void main(String[] args) {
        
        Scanner Gojo = new Scanner(System.in);

        int ans=0;
        boolean con = true;
        while(con==true){

            System.out.println("What operation would you like to do?");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice(1-4): ");
            int choice = Gojo.nextInt();
                
            switch(choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = Gojo.nextInt();
                    System.out.print("Enter second number: ");
                    int b = Gojo.nextInt();
                    new lab05_2().plus(a, b, ans);

                    System.out.print("Would you like to continue? (y/n): ");
                    if (Gojo.next().equals("n")) {
                        con = false;
                    }
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    a = Gojo.nextInt();
                    System.out.print("Enter second number: ");
                    b = Gojo.nextInt();
                    new lab05_2().minus(a, b, ans);

                    System.out.print("Would you like to continue? (y/n): ");
                    if (Gojo.next().equals("n")) {
                        con = false;
                    }
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    a = Gojo.nextInt();
                    System.out.print("Enter second number: ");
                    b = Gojo.nextInt();
                    new lab05_2().mul(a, b, ans);

                    System.out.print("Would you like to continue? (y/n): ");
                    if (Gojo.next().equals("n")) {
                        con = false;
                    }
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    a = Gojo.nextInt();
                    System.out.print("Enter second number: ");
                    b = Gojo.nextInt();
                    new lab05_2().div(a, b, ans);

                    System.out.print("Would you like to continue? (y/n): ");
                    if (Gojo.next().equals("n")) {
                        con = false;
                    }
                    break;
                default:
                    System.out.print("Invalid input!");
                    con = false;
            }
        }
        Gojo.close();
    }
}
