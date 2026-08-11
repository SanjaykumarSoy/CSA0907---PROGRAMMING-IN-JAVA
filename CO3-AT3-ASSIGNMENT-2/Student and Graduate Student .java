public class Main {
    public static void main(String[] args) {
        GraduateStudent student = new GraduateStudent(
            101,
            "Rahul",
            "Computer Science",
            "Artificial Intelligence",
            "Dr. Kumar"
        );
        student.displayGraduate();
    }
}
class Student {
    int rollNo;
    String name;
    String department;
    Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }
    void display() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
    }
}
class GraduateStudent extends Student {
    String researchTopic;
    String guideName;
    GraduateStudent(int rollNo, String name, String department,
                    String researchTopic, String guideName) {
        super(rollNo, name, department);
        this.researchTopic = researchTopic;
        this.guideName = guideName;
    }
    void displayGraduate() {
        display();
        System.out.println("Research Topic : " + researchTopic);
        System.out.println("Guide Name     : " + guideName);
    }
}
