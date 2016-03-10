import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;





public class TextUpdate extends Application {

	public static void main(String[] args) {
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		Button b1 = new Button();
		VBox pane =  new VBox(10, tf1, tf2, b1);

		//tf2.textProperty().bindBidirectional(tf1.textProperty());
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

//		b1.setOnAction(new EventHandler <ActionEvent>(){
//
//			@Override
//			public void handle(ActionEvent arg0) {
//
//				tf2.textProperty().bindBidirectional(tf1.textProperty());
//
//			}
//			
//			
//			
//		});
	
		
		//b1.setOnAction(e ->tf2.setText(tf1.getText()));
		
		tf1.setOnKeyReleased(e -> tf2.setText(tf1.getText()));
		
		//tf1.setOnKeyTyped(e-> tf2.setText(tf1.getText()));
	}
	
	

}
