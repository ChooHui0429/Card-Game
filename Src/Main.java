package src;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class Main extends Application{

    // Declaration of Stage and all scene in UI
    Stage window;
    Scene i;
     public static void main(String[] args){
         launch(args);// Main method to launch whole UI
    }

    @Override
    public void start(Stage primaryStage){

        // Declaration of main stage in UI
        window = primaryStage;

    }
 
}