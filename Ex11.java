import java.util.Arrays;
import java.util.List;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(5,2,9,-1,3,-8,20,-50);
				numbers
				.stream()
				.sorted()
				.forEach(System.out::println);
	}

}
