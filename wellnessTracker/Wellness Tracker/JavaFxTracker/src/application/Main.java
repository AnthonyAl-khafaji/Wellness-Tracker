//this code sets up JavaFX application with a main window containing a BorderPane layout and specific dimensions
package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

// Main class serves as the entry point for the JavaFX application
public class Main extends Application {
    // Override the start method to initialize the primary stage
    @Override
    public void start(Stage primaryStage) {
        try {
            // Create a BorderPane as the root layout
            BorderPane root = new BorderPane();
            
            // Create a Scene with the root layout and specific dimensions
            Scene scene = new Scene(root, 400, 400);
            
            // Add an external stylesheet to the scene
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            
            // Set the scene to the primary stage and display it
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
    
    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
