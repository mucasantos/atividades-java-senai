package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Cliente;
import model.LoginModel;

public class LoginController {
	public LoginModel login = new LoginModel();

	@FXML
	TextField passwordField;

	@FXML
	public void onClickCadastro() throws IOException {

		openScreen("/views/Signup.fxml");

	}

	@FXML
	public void loadNextScreen() throws IOException {

		//Cliente client = new Cliente("Samuel", "muca@email.com", "12345678");
		//login.signup(client);
		// Criar um usuario
		// Pegando a Sena anterior e fechando a tela
		Stage priorScreen = (Stage) this.passwordField.getScene().getWindow();
		priorScreen.close();

		openScreen("/views/View.fxml");
	}

	public void openScreen(String url) throws IOException {
		// Criar Stage
		Stage stage = new Stage();
		// Cria um Parent
		Parent parent = FXMLLoader.load(getClass().getResource(url));
		// Cena (Scene)
		Scene scene = new Scene(parent);
		// Set stage
		stage.setScene(scene);
		// Mostra
		stage.show();
	}

}
