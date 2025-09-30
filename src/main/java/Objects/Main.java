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
        System.out.println("Student1's School Name: " + student1.schoolName + "\nStudent1's School Address: " + student1.schoolAddress);
        // Since Static attributes belong to the class, they are shared among all instances of the class,
        // Hence using the class name to access static attributes is preferred.
        // if you change a static attribute using one object, it affects all other objects of that class.
        // Non-static attributes are unique to each object. Changing a non-static attribute in one object does not affect other objects.
        System.out.println("\nBut Student1 Name, Age and GPA remained same\nName: " +
                student1.name + "\nAge: " +
                student1.age + "\nGPA: " +
                student1.gpa);

        //calling the study method for both students
        System.out.println();
        student1.study();
        student2.study();

        //Array of objects
        //Let's create one more student object to understand array of objects
        Student student3 = new Student();
        student3.name = "Charlie";
        student3.age = 21;
        student3.gpa = 3.9;

        // Create an array to hold Student objects
        Student[] students = {student1, student2, student3};

        // Static attributes are shared across all instances, so they remain the same
        System.out.println("\nArray of Students using classic for-loop:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Name: " + students[i].name + ", Age: " + students[i].age + ", GPA: " + students[i].gpa + ", School: " + Student.schoolName);
        }

        System.out.println("\nArray of Students using enhanced for-loop:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + s.age + ", GPA: " + s.gpa + ", School: " + Student.schoolName);
        }

        // Anonymous Objects
        System.out.println("\nAnonymous Object:");
        new Student().name = "David"; // Creating an anonymous object and setting its name
        System.out.println("Anonymous Student Name: " + new Student().name); // Creating another anonymous object and trying to access its name

        // Note: The above line will print null because we are creating a new anonymous object which has no name set.
        // Anonymous objects are useful when you need an object for a short period of time and do not need to reference it later.
        // They are often used in method calls or when you want to quickly create an object without storing it in a variable.

        new Student().schoolName(); // Creating an anonymous object and calling its method

        //Anonymous objects can only be used once. You cannot access the same anonymous object again.
        //Anonymous objects are used better by creating constructors to initialize attributes,
        // for which you can find the example in the Constructors package.

        System.out.println("\nAnonymous objects are nothing but objects with a name");
        System.out.println("Whenever we create an instance of a class as new className(), it is called an object");
        System.out.println("And assign this new className() to a variable of datatype className, it becomes a named object");
        System.out.println("Datatype className variableName = new className(); // named object");
        System.out.println("Datatype has to be a class name because " +
                "it defines the character of the variable that it's storing an object which is an instance of the class itself");
        System.out.println("This is how Java will know what that variable real character is");
        System.out.println("it's just plain english rooted with base logic of java principles");


    }
}
