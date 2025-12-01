import java.util.Scanner;
class cal{
	public static float sum(float num1, float num2){
		return num1+ num2;
	}
	public static float subtract(float num1, float num2){
		return num1- num2;
	}
	public static float mul(float num1, float num2){
		return num1* num2;
	}
	public static float div(float num1, float num2){
		return num1/num2;
	}
	public  static int sumt(){
		int sum= 0;
		for (int i =1 ; i<=100; i++) {
			if (i %2 == 0) {
				sum =sum+i;
			}
		}
		return sum;
}
}
public class Ex2 {
	public static void main(String[] args) {
		int n;
		float sum1, sum2;
		boolean x = true;
		// TODO Auto-generated method stub
		System.out.println("     Welcome to Calculator Programming of ");
		System.out.println("=".repeat(45));
		System.out.println("Please choose one of the following Operation:" + "\n");
		System.out.println("1, Sum(+)");
		System.out.println("2, Subtract(-)");
		System.out.println("3, Multiply(*)");
		System.out.println("4, Division(-)");
		System.out.println("5, Sum 1-100 number");
		System.out.println("0, Exit");
		Scanner input = new Scanner(System.in);
		while(x) {
		System.out.print("Please select your option: ");
		n = input.nextInt();
		switch (n){
		case 1: 
			System.out.print("Please enter num1: ");
			sum1 =input.nextFloat();
			System.out.print("Please enter num2: " );
			sum2 =input.nextFloat();
			System.out.println("The sum of the two number is: " + cal.sum(sum1,sum2) + "\n");
			break;
		case 2: 
			System.out.print("Please enter num1: ");
			sum1 =input.nextFloat();
			System.out.print("Please enter num2 : " );
			sum2 =input.nextFloat();
			System.out.println("The subtract of the two number is: " + cal.subtract(sum1,sum2) + "\n");
			break;
		case 3: 
			System.out.print("Please enter num1: ");
			sum1 =input.nextFloat();
			System.out.print("Please enter num2 : ");
			sum2 =input.nextFloat();
			System.out.println("The multiplicaton of the two number is: " + cal.mul(sum1,sum2) + "\n");
			break;
		case 4:
			System.out.print("Please enter num1: ");
			sum1 =input.nextFloat();
			System.out.print("Please enter num2 : ");
			sum2 =input.nextFloat();
			System.out.println("The multiplicaton of the two number is: " + cal.div(sum1,sum2) + "\n");
			break;
		case 5: 
			System.out.println("The Result is: " + cal.sumt() + "\n");
			break;
		case 0:
			x = false;
			break;
			default:
				System.out.println("Please choose option 1-5 only! \n");
				
		}
	}
		input.close();
	}
}

