
package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private AnchorPane mypane;

	@Override
	public void start(Stage stage) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("AlgoBasico.fxml"));
		mypane = (AnchorPane) loader.load();

		/**
		 * titula y coloca la escena en el stage
		 */
		stage.setTitle("Jorge BasicJavaFx?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}

	/**
	 * arranca la aplicación
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		launch(args);
	}

}