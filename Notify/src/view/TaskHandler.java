package view;

import guiController.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class TaskHandler {
	@FXML
	private TextField txtCommand;
	
	@FXML
	private TextArea txtDisplay;
	
	private MainApp mainApp;
	
	@FXML
	public void initialize() {
		
	}
	
	public void setMain(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	public void commandTextboxHandler(KeyEvent event) {
		if(event.getCode() == KeyCode.ENTER) {
			txtDisplay.appendText(txtCommand.getText() + "\n");
			txtCommand.setText("");
		}
	}
}
