package application;

import java.util.Date;

public class Workout {
    private Date date;
    private int duration;
    private int calories;
    
    public Workout(Date date, int duration, int calories) {
        this.date = date;
        this.duration = duration;
        this.calories = calories;
    }
    
    // Getters and setters for date, duration, and calories
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getCalories() {
        return calories;
    }
    
    public void setCalories(int calories) {
        this.calories = calories;
    }
}
