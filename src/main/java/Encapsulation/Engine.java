package Encapsulation;

public class Engine {
    private String type = "V6";// Private attribute, cannot be accessed directly outside this class
    public int horsepower = 300; // Public static attribute, can be accessed without an instance of the class

    // Getter method for type
    public String getType() {
        return type;
    }

    // Setter method for type
    public void setType(String type) {
        this.type = type;
    }
}
