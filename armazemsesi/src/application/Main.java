package application;
	
import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	private double xOffSet = 0;
	private double yOffSet = 0;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// busco o GIF
			ImageView imageView = new ImageView(new Image("/view/trevoso.gif"));
			
			// criando StackPane ou Fundo
			StackPane gifRoot = new StackPane();
			// equivalente ao appendChild
			gifRoot.getChildren().add(imageView);
			
			Image icon = new Image("/view/trovao.png");
			Scene gifScene = new Scene(gifRoot, 600, 400);
			
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Armazem Trovoso");
			primaryStage.setScene(gifScene);
			primaryStage.show();
			
			// criando um delay
			PauseTransition delay = new PauseTransition(Duration.seconds(3));
			delay.setOnFinished(event -> {
				try {
					showMainScene(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			delay.play();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private void showMainScene(Stage primary) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		// ajustar o tamanho da tela como falso
		primary.setResizable(false);
		// quando mouse pressionado
		root.setOnMousePressed(event -> {
			xOffSet = event.getSceneX();
			yOffSet = event.getSceneY();
		});
		// quando mouse solto
		root.setOnMouseDragged(event -> {
			primary.setX(event.getScreenX() - xOffSet);
			primary.setY(event.getScreenY() - yOffSet);
		});
		// passamos o parent ( fxml ) para nossa cena
		Scene mainScene = new Scene(root);
		mainScene.setFill(Color.TRANSPARENT);
		// configurando a cena principal
		primary.setScene(mainScene);
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
