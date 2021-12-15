package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;

public class RootController implements Initializable {

	@FXML
	private Tab connectionTab;

	@FXML
	private Tab locationTab;

	@FXML
	private BorderPane rootView;

	@FXML
	private Tab securityTab;
	
	//Controller
	
	private LocationTabController locationTabController = new LocationTabController(); 

	public RootController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		locationTab.setContent(locationTabController.getView());

	}
	
	public BorderPane getView() {
		return rootView;
	}

}
