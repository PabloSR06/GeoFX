package dad.GeoFX.main;

import dad.GeoFX.controller.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoFXApp extends Application {
	
	private RootController rootController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		rootController = new RootController();
		
		Scene scene = new Scene(rootController.getView());
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
