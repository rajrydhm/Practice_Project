package Objects;

public class Main {
    public static void main(String[] args) {
      // Create an object of the Student class
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.gpa = 3.8;
        System.out.println("Student1\nName: " + student1.name + "\nAge: " + student1.age + "\nGPA: " + student1.gpa);

        // Static attributes do not need objects to be accessed. They belong to the class itself.
        Student.schoolName = "Greenwood High";
        Student.schoolAddress = "123 Main St, Springfield";
        System.out.println("School Name: " + Student.schoolName + "\nSchool Address: " + Student.schoolAddress);

        //Now let's create student2 object
        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;
        student2.gpa = 3.5;
        Student.schoolName = "Sunrise Academy"; // Changing static attribute
        Student.schoolAddress = "456 Elm St, Springfield"; // Changing static attribute
        System.out.println("\nStudent2\nName: " + student2.name + "\nAge: " + student2.age + "\nGPA: " + student2.gpa);
        System.out.println("School Name: " + Student.schoolName + "\nSchool Address: " + Student.schoolAddress);

        // Note that changing the static attributes via student2 affects student1 as well
        System.out.println("\nAfter changing static attributes via student2:");
        System.out.println("Student1's School Name: " + Student.schoolName + "\nStudent1's School Address: " + Student.schoolAddress);
        // Since Static attributes belong to the class, they are shared among all instances of the class.
        // if you change a static attribute using one object, it affects all other objects of that class.
        // Non-static attributes are unique to each object. Changing a non-static attribute in one object does not affect other objects.
        System.out.println("\nBut Student1 Name, Age and GPA remained same\nName: " +
                student1.name + "\nAge: " +
                student1.age + "\nGPA: " +
                student1.gpa);
    }
}
