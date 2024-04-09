package application;

// Exercise class represents an exercise entity
public class Exercise {
    // Private member variable to store the name of the exercise
    private String name;
    
    // Constructor to initialize the exercise name
    public Exercise(String name) {
        this.name = name;
    }
    
    // Getter method to retrieve the name of the exercise
    public String getName() {
        return name;
    }
    
    // Setter method to set the name of the exercise
    public void setName(String name) {
        this.name = name;
    }
}
