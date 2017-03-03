package application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btnStart=new Button();
			btnStart.setText("Spiel starten");
			Button btnSettings=new Button();
			btnSettings.setText("Einstellungen");
			Button btnEnd=new Button();
			btnEnd.setText("Spiel beenden");
			double buttonsize=250;
			StackPane root = new StackPane();
			btnStart.setMinWidth(buttonsize);
			btnSettings.setMinWidth(buttonsize);
			btnEnd.setMinWidth(buttonsize);
			btnStart.setTranslateY(-45);
			btnEnd.setTranslateY(+45);
			root.getChildren().add(btnStart);
			
			root.getChildren().add(btnSettings);
			root.getChildren().add(btnEnd);
			
			btnStart.setOnAction(new EventHandler<ActionEvent>() {
				 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Game started!");
	                StackPane root2=new StackPane();
	                Scene scene =new Scene(root2,1280,720);
	                primaryStage.setScene(scene);
	            }
	        });
			
			btnSettings.setOnAction(new EventHandler<ActionEvent>() {
				 
	            @Override
	            public void handle(ActionEvent event) {
	                try {
						stop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });
			
			

			
			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Tetris 2k17");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
