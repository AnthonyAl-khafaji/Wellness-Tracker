package application;

// User class represents a user entity
public class User {
    // Private member variables to store the username and email of the user
    private String username;
    private String email;

    // Constructor to initialize the user with a username and email
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getter method to retrieve the username of the user
    public String getUsername() {
        return username;
    }

    // Setter method to set the username of the user
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method to retrieve the email of the user
    public String getEmail() {
        return email;
    }

    // Setter method to set the email of the user
    public void setEmail(String email) {
        this.email = email;
    }
}
