class Employee{
	
	private String name;
	private String Id;
	private int age;
	private String city;
	private float salary;
	Employee(String name, String Id, int age, String city, float salary){
		this.age = age;
		this.city = city;
		this.Id = Id;
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.printf("%-20s %-15s %-10d %-15s $%-10.2f\n", name, Id, age, city, salary);
	}
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-20s %-15s %-10s %-15s %-10s\n", "Name", "ID", "Age", "City", "salary");
		System.out.println("=".repeat(60));
		Employee A = new Employee("nak", "P20240045",20 ,"Phnom penh", 5000);
		A.display();
		
		Employee B = new Employee("kal", "P20240046", 25, "Siem Reap", 6000);
        B.display();
        
        Employee C = new Employee("sak", "P20240047", 22, "Battambang", 4500);
        C.display();
         
        //A.setSalary(A.getSalary()+700);
        //A.display();
	}

}

