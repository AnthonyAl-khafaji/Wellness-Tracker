package application;

import java.util.Date;

// Workout class represents a workout entity
public class Workout {
    // Private member variables to store the date, duration, and calories burned during the workout
    private Date date;
    private int duration;
    private int calories;
    
    // Constructor to initialize the workout with a specific date, duration, and calories burned
    public Workout(Date date, int duration, int calories) {
        this.date = date;
        this.duration = duration;
        this.calories = calories;
    }
    
    // Getter method to retrieve the date of the workout
    public Date getDate() {
        return date;
    }
    
    // Setter method to set the date of the workout
    public void setDate(Date date) {
        this.date = date;
    }
    
    // Getter method to retrieve the duration of the workout
    public int getDuration() {
        return duration;
    }
    
    // Setter method to set the duration of the workout
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    // Getter method to retrieve the calories burned during the workout
    public int getCalories() {
        return calories;
    }
    
    // Setter method to set the calories burned during the workout
    public void setCalories(int calories) {
        this.calories = calories;
    }
}
