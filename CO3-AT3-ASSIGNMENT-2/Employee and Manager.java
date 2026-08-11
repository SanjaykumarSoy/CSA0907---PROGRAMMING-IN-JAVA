public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Rahul", 50000, 10000);
        Manager m2 = new Manager(102, "Arun", 60000, 12000);
        Manager m3 = new Manager(103, "Kumar", 70000, 15000);
        m1.display();
        m2.display();
        m3.display();
    }
}
class Employee {
    int empId;
    String name;
    double basicSalary;
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}
class Manager extends Employee {
    double bonus;
    Manager(int empId, String name, double basicSalary, double bonus) {
        super(empId, name, basicSalary);
        this.bonus = bonus;
    }
    void display() {
        double totalSalary = basicSalary + bonus;
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println();
    }
}
