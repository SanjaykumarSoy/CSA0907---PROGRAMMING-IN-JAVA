public class Main {
    public static void main(String[] args) {
        Professor p = new Professor(
            "Dr. Kumar",
            45,
            101,
            "Computer Science",
            "Artificial Intelligence",
            15
        );
        p.display();
    }
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Faculty extends Person {
    int facultyId;
    String department;
    Faculty(String name, int age, int facultyId, String department) {
        super(name, age);
        this.facultyId = facultyId;
        this.department = department;
    }
}
class Professor extends Faculty {
    String specialization;
    int experience;
    Professor(String name, int age, int facultyId, String department,
              String specialization, int experience) {
        super(name, age, facultyId, department);
        this.specialization = specialization;
        this.experience = experience;
    }
    void display() {
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Faculty ID     : " + facultyId);
        System.out.println("Department     : " + department);
        System.out.println("Specialization : " + specialization);
        System.out.println("Experience     : " + experience + " years");
    }
}

