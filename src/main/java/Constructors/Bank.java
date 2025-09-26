package Constructors;

public class Bank {
    String name;
    int age;
    double balance;
    String email;
    static String bankName = "ABC Bank"; // static variable shared by all instances of Customer class
    static int customerCount = 0; // static variable to keep track of number of customers

    // Constructor
    public Bank(String name, int CustomerAge, double balance) {
        this.name = name; // 'this' keyword is used to differentiate between instance variable and parameter
        age = CustomerAge; // 'this' keyword is optional here since parameter name is different from instance variable name
        this.balance = balance;
        customerCount++; // increment customer count whenever a new customer is created
    }

    // no-arg Constructor added manually to allow creation of Customer objects without parameters
    // This step is also called as "overloading" the constructor
    public Bank() {
        customerCount++; // increment customer count whenever a new customer is created
    }

    //let's overload the constructor again with different parameters
    public Bank(String name, int age) {
        this.name = name;
        this.age = age; //here we used this to show the difference between instance variable and parameter
        email = "not provided"; // default value for email don't have to pass it as parameter
        customerCount++; // increment customer count whenever a new customer is created
    }

}

