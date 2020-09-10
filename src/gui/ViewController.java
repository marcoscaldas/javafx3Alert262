package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTeste;
	
	@FXML
	public void onBtTestAction () {
		Alerts.showAlert("Alert title", null, "Hello", AlertType.INFORMATION); // no lugar de nulo pode colocar o alert header cabe�alho
	}
	

}
