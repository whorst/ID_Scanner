package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application { //For a simple button 

	Button button;			//Creates your button object
	
	public static void main(String[] args) {
		launch(args);					//method inside application class that setups your program as a javaFX application
										//Window border = stage. Everything in there in the scene
	}

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			primaryStage.setTitle("This is the title"); //Gives your stage a title
			button = new Button("Click me");	//Gives your button a title
			
			
			button.setOnAction(e -> System.out.println("Hey now brown cow")); //Switching to java 8 allows for this syntax. This is called a lambda
			
			StackPane layout = new StackPane();			//What is a StackPane?
			layout.getChildren().add(button);			//Adds the button to the middle of the layout
			Scene scene = new Scene(layout,400,400);	//Sets size of your current window
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);	//Tells you to use the code above with the size parameters
			primaryStage.show();
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	
}