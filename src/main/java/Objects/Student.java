package Objects;

public class Student {
    String name;
    int age;
    double gpa;
    static String schoolName;
    static String schoolAddress;

    void study() {
        System.out.println(name + " is studying" + " at " + schoolName + " and receives a GPA of " + gpa);
    }
}
