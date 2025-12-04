public class Employee {

    private String name;
    private int id;
    private String department;
    private double salary;
    private int age;

    public Employee(String name, int id, String department, double salary, int age) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }


}

