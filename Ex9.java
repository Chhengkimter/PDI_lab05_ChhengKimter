
import java.util.Arrays;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		.stream()
		.map (n -> n*n*n)
		.forEach(System.out::println);
	}

}