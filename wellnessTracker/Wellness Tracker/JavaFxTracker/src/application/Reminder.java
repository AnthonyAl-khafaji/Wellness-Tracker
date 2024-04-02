package application;

import java.util.Date;

public class Reminder {
    private Date date;
    private String message;
    
    public Reminder(Date date, String message) {
        this.date = date;
        this.message = message;
    }
    
    // Getters and setters for date and message
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
