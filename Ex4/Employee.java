package Ex4;

public class Employee {
    private String name;
    private int age;
    private String id;
    private String position;
    private double salary;

    public Employee(String n, int a, String i, String p, double s) {
        name = n;
        age = a;
        id = i;
        position = p;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        id = i;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String p) {
        position = p;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }
}
