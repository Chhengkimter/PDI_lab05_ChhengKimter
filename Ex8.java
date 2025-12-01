import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class student{
	String name;
	int id;
	int age;
	String gender;
	student(String name, int id, int age, String gender){
		this.age = age;
		this.gender= gender;
		this.id= id;
		this.name = name;
	}
public void show() {
		
		System.out.printf("%-15s %-5d %-10d %s\n", name,id,age,gender);
		}
}
public class Ex8 {
    private static boolean isPrime(int num) {
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
    public static void main(String[] args) {
    	Runnable task = () ->{
    		Scanner input = new Scanner(System.in);
    		int n;
    		System.out.println("Please input number: ");
    		n = input.nextInt();
    		int sum =0;
    			for (int i =1 ; i<=n ; i++) {
    				sum +=i;
    		}
    			input.close();
    		System.out.println("The sum From 1 to " + n + " is: "+ sum);
    		
    	};
    	Runnable task2 =() -> {
    		System.out.println("All prime numbers from 1 to 100 are: ");
	        for (int i = 2; i <= 100; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
    	};
    	Runnable task3 = () ->{
    		String s;
    		String[] a;
    		
    		List<student> U = new ArrayList<student>();
    		try{
    			File f = new File("D:/testing.csv");
    		Scanner reader;
    			reader = new Scanner(f); 
    			while(reader.hasNext()) {
    				s = reader.next();
    				a =s.split(",");
    				int num = Integer.parseInt(a[1]);
    				int num1 = Integer.parseInt(a[2]);
    				student u = new student(a[0],num,num1,a[3]);
    				U.add(u);
    			}
    			for(student t: U) {
    				t.show();
    			}
    			reader.close();
    		}
    		catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	};
    	
    	Thread t1 = new Thread(task);
    	Thread t2 = new Thread(task2);	
    	Thread t3 = new Thread(task3);
    
    	t1.start();
    	t2.start();
    	t3.start();
    
    
}
}
