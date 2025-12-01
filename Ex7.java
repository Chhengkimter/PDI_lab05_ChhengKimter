import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
class Ourthread extends Thread{
	int n;
	int sum =0;
	Ourthread(int n){
		this.n = n;
	}
	public void run() {
		for (int i =1 ; i<=n ; i++) {
			sum +=i;
	}
	System.out.println("The sum From 1 to " + n + " is: "+ sum);
	
}
}
class Ourthread1 extends Thread{
    private boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	 public void run() {
	        System.out.println("All prime numbers from 1 to 100 are: ");
	        for (int i = 2; i <= 100; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
	    }
	    

}
class Std{
	String name;
	int id;
	int age;
	String gender;
	Std(String name, int id, int age, String gender){
		this.age = age;
		this.gender= gender;
		this.id= id;
		this.name = name;
	}
public void show() {
		
		System.out.printf("%-15s %-5d %-10d %s\n", name,id,age,gender);
		}
}
class Ourthread2 extends Thread{
	String s;
	String[] a;
	public void run() {
		List<Std> U = new ArrayList<Std>();
		try{
			File f = new File("D:/testing.csv");
		Scanner reader;
			reader = new Scanner(f); 
			while(reader.hasNext()) {
				s = reader.next();
				a =s.split(",");
				int num = Integer.parseInt(a[1]);
				int num1 = Integer.parseInt(a[2]);
				Std u = new Std(a[0],num,num1,a[3]);
				U.add(u);
			}
			for(Std t: U) {
				t.show();
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n; 
		System.out.println("Enter number: ");
		n = input.nextInt();
		Ourthread thread = new Ourthread(n);
		thread.start();
		input.close();
		
		Ourthread1 thread1 = new Ourthread1();
		thread1.start();
		
		Ourthread2 thread2 = new Ourthread2();
		thread2.start();
		
	}

}
