package guiController;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout; 
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Notify");
		
		initRootLayout();
		
		showTask();
		
		
	}
	
	/**
	 * Initializes the root layout
	 * @param args
	 */

	public void initRootLayout() {
		try{
			
			//Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			//Show the scene containing the rootLayout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Shows the Task view inside the root layout
	 */
	
	public void showTask(){
		try{
			//Load task
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/view/Task.fxml"));
			AnchorPane task = (AnchorPane) loader.load();
			
			//set task view to centre of the root layout
			rootLayout.setCenter(task);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns main stage
	 * @return
	 */
	public Stage getPrimaryStage(){
		return primaryStage;
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}
