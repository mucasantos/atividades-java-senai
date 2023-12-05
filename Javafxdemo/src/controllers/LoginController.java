package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.LoginModel;

public class LoginController {
	public LoginModel login = new LoginModel();
	
	@FXML
	TextField passwordField;

	@FXML
	public void loadNextScreen() throws IOException {
		
		//Pegando a Sena anterior e fechando a tela
		Stage priorScreen = (Stage)this.passwordField.getScene().getWindow();
		priorScreen.close();
		
		// Criar Stage
		Stage stage = new Stage();
		// Cria um Parent
		Parent parent = FXMLLoader.load(getClass().getResource("/views/View.fxml"));
		// Cena (Scene)
		Scene scene = new Scene(parent);
		// Set stage
		stage.setScene(scene);
		// Mostra
		stage.show();
	}

}
