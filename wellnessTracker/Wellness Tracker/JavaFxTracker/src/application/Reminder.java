package application;

import java.util.Date;

// defines the Reminder class 
public class Reminder {
    // declaring Private variables to store the date and message of the reminder
    private Date date;
    private String message;
    
    // Constructor to initialize the reminder with a specific date and message
    public Reminder(Date date, String message) {
        this.date = date;
        this.message = message;
    }
    
    // Getter method to retrieve the date of the reminder
    public Date getDate() {
        return date;
    }
    
    // Setter method to set the date of the reminder
    public void setDate(Date date) {
        this.date = date;
    }
    
    // Getter method to retrieve the message of the reminder
    public String getMessage() {
        return message;
    }
    
    // Setter method to set the message of the reminder
    public void setMessage(String message) {
        this.message = message;
    }
}
