import java.util.Comparator;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
class std{
	String name;
	String id;
	int age;
	String gender;
	std(String name, String id, int age, String gender){
		this.age = age;
		this.gender = gender;
		this.id = id;
		this.name = name;
	}
	
}
public class Ex12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("D:/testing.csv");
		List<std> list = 
				Files.lines(path)
				.map(line -> line.split(","))
				.map(parts -> new std(
						parts[0],
						parts[1],
						Integer.parseInt(parts[2]),
						parts[3]
						))
				.sorted(Comparator.comparing(n -> n.name))
						.toList();
		list.forEach(s -> System.out.printf("%-15s %-10s %-10d %s\n", s.name,s.id,s.age,s.gender));
	}

}
