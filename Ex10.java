import java.util.Arrays;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList(1,2,-10,-7,7,-9,20,-6)
		.stream()
		.filter(n -> n>0)
		.forEach(System.out::println);
	}

}
