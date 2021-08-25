package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTest;

	@FXML
	public void onBtTestAction() {
		Alerts.showAlerts("Error application", null, "Ocorreu um erro ao enviar a solicitacao ao banco de dados", AlertType.ERROR);
	}
}
