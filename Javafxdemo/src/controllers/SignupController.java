package controllers;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import model.Cliente;
import model.LoginModel;

public class SignupController {
	public LoginModel user = new LoginModel();

	// Pegar os dados do nosso TextField

	@FXML
	TextField nameID;

	@FXML
	TextField emailID;

	@FXML
	TextField passwordID;

	@FXML
	public void onSaveClick() {
		// Instanciar um CLiente
		Cliente client = new Cliente(nameID.getText(), emailID.getText(), passwordID.getText());

		Alert alert = new Alert(AlertType.INFORMATION);
		// Salvar no DB
		try {
			if (!user.signup(client)) {
				alert.setContentText("Usuário Salvo com sucesso!!");
				alert.show();				
			} else {
				alert.setAlertType(AlertType.ERROR);
				alert.setContentText("Não consegui salvar o Usuário...!!");
				alert.show();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Stage priorScreen = (Stage) this.passwordID.getScene().getWindow();
		priorScreen.close();
	}
}
