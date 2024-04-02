package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class WellnessTracker extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        // Creating labels and text fields for user input
        Label exerciseNameLabel = new Label("Exercise Type (Weightlifting, Cardio, etc.):");
        TextField exerciseNameField = new TextField();

        Label workoutDurationLabel = new Label("Workout Duration (mins):");
        TextField workoutDurationField = new TextField();

        Label workoutCaloriesLabel = new Label("Calories Burned(kcal):");
        TextField workoutCaloriesField = new TextField();

        Label reminderMessageLabel = new Label("Workout Note:");
        TextField reminderMessageField = new TextField();

        Button submitButton = new Button("Submit");

        // Creating a layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                exerciseNameLabel, exerciseNameField,
                workoutDurationLabel, workoutDurationField,
                workoutCaloriesLabel, workoutCaloriesField,
                usernameLabel, usernameField,
                emailLabel, emailField,
                reminderMessageLabel, reminderMessageField,
                submitButton
        );

        // Setting action for the submit button
        submitButton.setOnAction(event -> {
            // Get user input
            String exerciseName = exerciseNameField.getText();
            int workoutDuration = Integer.parseInt(workoutDurationField.getText());
            int workoutCalories = Integer.parseInt(workoutCaloriesField.getText());
            String username = usernameField.getText();
            String email = emailField.getText();
            String reminderMessage = reminderMessageField.getText();

            // Display input data in the console
            System.out.println("Exercise Name: " + exerciseName);
            System.out.println("Workout Duration: " + workoutDuration + " mins");
            System.out.println("Workout Calories: " + workoutCalories + " kcal");
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Reminder Message: " + reminderMessage);
        });

        // Creating a scene
        Scene scene = new Scene(root, 400, 500);

        // Setting the scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wellness Tracker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
