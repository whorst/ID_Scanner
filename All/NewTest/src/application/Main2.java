package application;

import java.awt.Label;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main2 extends Application {
	
	Stage Window;
	Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Window = primaryStage;
		
		Label label1 = new Label("Welcome to the first scene");
		Button button1 = new Button("Go to scene 2");
		button1.setOnAction(e -> Window.setScene(scene2));
		
		//Layout 1 - Children are laid out in vertical column
		VBox layout1 = new VBox(20); // LAyout that stacks objects on top of eachother and spaces them out ny 20 pixels.
		layout1.getChildren().add(button1);
		scene1 = new Scene(layout1, 200, 200);
		
		//Button 2
		Button button2 = new Button("Go to scene 1");
		button2.setOnAction(e -> Window.setScene(scene1));
		
		//Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600,300);
		
		Window.setScene(scene2);		//This chunck of code show the scene on startup
		Window.setTitle("Title Here");
		Window.show();
		
		button2.setOnAction(e -> Window.setScene(scene1));
		
	}

}
