package test;


import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class helloFX extends Application
{
	public void start(Stage primaryStage)
	{
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		VBox pane = new VBox();
		
		pane.getChildren().add(tf1);
		pane.getChildren().add(tf2);
		
		// test binding
		tf2.textProperty().bind(tf1.textProperty());
		//tf2.textProperty().bindBidirectional(tf1.textProperty());

		// test event handling
		//tf1.setOnAction(e-> tf2.setText(tf1.getText()));
		//tf1.setOnKeyPressed(e-> tf2.setText(tf1.getText()));
		//tf1.setOnKeyReleased(e -> tf2.setText(tf1.getText()));
		//tf2.setOnKeyReleased(e -> tf1.setText(tf2.getText()));

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}