package Ex4;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("John", 30, "007", "Admin", 500);
        System.out.println(e.getName());
        System.out.println(e.getPosition());
        System.out.println(e.getId());
    }
}
