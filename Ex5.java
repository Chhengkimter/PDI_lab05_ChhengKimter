public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mythread = new Thread() {
			public void run() {
				System.out.println("Factorial of 3 is: " + (3*2*1));
			};
		};
		Thread mythread1 = new  Thread() {
			public void run() {
				System.out.println("Factorial of 6 is: " + (6*5*4*3*2*1));
			};
		};
		Thread mythread2 = new Thread() {
			public void run() {
				System.out.println("Factorial of 10 is: " + (10*9*8*7*6*5*4*3*2*1));
			}
		};
		
		Thread mythread3 = new Thread() {
			long fac = 1;
			public void run() {
				for(int i= 20; i>1; i--) {
					fac*=i;
				}
				System.out.println("Factorial of 20 is: " + fac );
			};
		};
		mythread.start();
		mythread1.start();
		mythread2.start();
		mythread3.start();
	}

}
