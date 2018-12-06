package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	private AnchorPane mypane, mypane2;

	@Override
	public void start(Stage stage) throws IOException {

		// primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanita.fxml"));

		mypane = (AnchorPane) loader.load();

		FXMLLoader loader2 = new FXMLLoader(getClass().getResource("practicaVentana.fxml"));
		mypane2 = (AnchorPane) loader2.load();

		// añade la escena al stage y la titula
		stage.setTitle("Practica 2 Jorge");
		stage.setScene(new Scene(mypane));
		stage.show();

		controlador controller = loader.getController();
		controller.setStageAndMyPane(stage, mypane2);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
