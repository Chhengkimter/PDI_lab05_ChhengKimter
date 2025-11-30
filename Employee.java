import java.util.Scanner;
public class Employee {
    
    private String name;
    private int age;
    private String gender;
    private String city;
    private Double salary;

    private Employee(String name, int age, String gender, String city, Double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.salary = salary;
    }

    public static Employee createEmployee(String name, int age, String gender, String city, Double salary) {
        return new Employee(name, age, gender, city, salary);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("City: " + city);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        
        Scanner Gojo = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = Gojo.nextLine();

        System.out.print("Enter age: ");
        int age = Gojo.nextInt();

        System.out.print("Enter gender: ");
        String gender = Gojo.nextLine();

        System.out.print("Enter city: ");
        String city = Gojo.nextLine();

        System.out.print("Enter salary: ");
        Double salary = Gojo.nextDouble();

        Employee employee = Employee.createEmployee(name, age, gender, city, salary);
        employee.displayDetails();

        Gojo.close();
    }
}

