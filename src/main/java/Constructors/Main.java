package Constructors;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object using the Constructor

        Bank customer1 = new Bank("Alice", 20, 1000.0);
        Bank customer2 = new Bank("Bob", 22, 5000.0);

        System.out.println("customer1\nName: " + customer1.name
                + "\nAge: " + customer1.age
                + "\nBalance: " + customer1.balance);

        System.out.println("\ncustomer2\nName: " + customer2.name
                + "\nAge: " + customer2.age
                + "\nBalance: " + customer2.balance);

        // Constructor sets the object's initial attribute values.
        // Object is created from a class; constructor runs on creation.
        // If no constructor is written, Java adds a default one: Bank() { }
        // Default (no-argument) constructors let you write: Bank c = new Bank();
        // Writing any constructor removes the automatic default constructor.
        // Add your own no-arg constructor if you want both default and custom constructors.

        Bank customer3 = new Bank(); // no-arg constructor is added manually in Bank class
        System.out.println("\ncustomer3\nName: " + customer3.name
                + "\nAge: " + customer3.age
                + "\nBalance: " + customer3.balance);
        // customer3 attributes will have default values: null since values are not set in no-arg constructor
        // and objects are independent of each other

        Bank customer4 = new Bank("Charlie", 30); // overloaded constructor with different parameters
        System.out.println("\ncustomer4\nName: " + customer4.name
                + "\nAge: " + customer4.age
                + "\nBalance: " + customer4.balance
                + "\nEmail: " + customer4.email);
        // customer4 balance will have default value 0.0 since it is not set in this constructor
        // email will have value "not provided" as set in this constructor

        System.out.println(" \n ------------- Understanding Static ------------- \n");
        // Static members belong to the class, not instances. Shared across all objects.
        // Access static members using the class name: ClassName.staticMember
        // Instance members belong to individual objects. Each object has its own copy.
        // Access instance members using the object reference: objectReference.instanceMember

        //In our Bank class, bankName and customerCount are static variables
        // bankName is same for all customers, so we use static
        System.out.println("Customer1 Bank name is:" + customer1.bankName); // Accessing static variable using object reference (not recommended)
        System.out.println("Customer2 Bank name is:" + customer2.bankName); //All will print "ABC Bank"
        System.out.println("Customer3 Bank name is:" + customer3.bankName); // Also this is not recommended, since bankName is same for all customers
        System.out.println("Customer4 Bank name is:" + customer4.bankName); // we can simply use Bank.bankName, class name is preferred.

        // Now let's see another useful way a static variable can be used
        System.out.println("\nTotal number of customers: " + Bank.customerCount);
        // customerCount is incremented in each constructor, so it keeps track of total customers created
        // if we had not used static here, each object would have its own customerCount variable,
        // and it would always be 1 for each object since it is incremented in constructor
    }
}
