import java.util.stream.IntStream;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {5,2,9,1,3,8};
		System.out.print("Here is the number in Array: ");
		for(int i= 0;i<6;i++)
		{
			System.out.print(number[i]+ " ");
		}
		System.out.println();
		int max =IntStream.of(number).max().getAsInt();
		int min =IntStream.of(number).min().getAsInt();
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}

}

