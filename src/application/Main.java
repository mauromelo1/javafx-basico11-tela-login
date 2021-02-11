package application;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			String arquivoCSS = getClass().getResource("/gui/Login.css").toExternalForm();
			URL arquivoFXML = getClass().getResource("/gui/Login.fxml");
			GridPane raiz = FXMLLoader.load(arquivoFXML);
			
			Scene cena = new Scene(raiz);
			cena.getStylesheets().add(arquivoCSS);
			
			primaryStage.setResizable(false);
			primaryStage.setTitle("Tela de Login");
			primaryStage.setScene(cena);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}