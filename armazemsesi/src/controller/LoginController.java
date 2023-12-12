package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@FXML					
	void clickLogin() {
		try {
			if(username.getText().equals("admin") && password.getText().equals("admin")) {
				Stage stageAtual = (Stage) username.getScene().getWindow();
				mudarCena("../view/Dashboard.fxml", stageAtual);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private static double xOffSet = 0;
	private static double yOffSet = 0;
	
	private void mudarCena(String fxml, Stage stageAtual) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(fxml));
		Parent root = loader.load();
		
		root.setOnMousePressed(event -> {
			xOffSet = event.getSceneX();
			yOffSet = event.getSceneY();
		});
		
		root.setOnMouseDragged(event -> {
			stageAtual.setX(event.getSceneX() - xOffSet);
			stageAtual.setY(event.getSceneY() - yOffSet);
		});
	
		Scene scene = new Scene(root);
		stageAtual.setScene(scene);
		stageAtual.show();
	}
	
}
