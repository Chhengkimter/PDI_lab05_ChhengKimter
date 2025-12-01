public class Ex1 {
		public  static int sum(){
			int sum= 0;
			for (int i =1 ; i<=100; i++) {
				if (i %2 == 0) {
					sum =sum+i;
				}
			}
			return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This Program calculate sum of 1-100.");
		System.out.println("The Result is: " + sum());
	}

}
