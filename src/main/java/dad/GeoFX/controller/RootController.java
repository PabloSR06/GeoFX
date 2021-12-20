package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.GeoFX.ipapi.GeoInfo;
import dad.GeoFX.model.InfoModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
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
	
	private ConnectionTabController connectionTabController = new ConnectionTabController();
	
	private SecurityTabController securityTabController = new SecurityTabController();
	
	private TopController topController = new TopController();
	
	private InfoModel mainInfo = new InfoModel();

	
	

	public RootController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainInfo.mainInfoProperty().bind(topController.getInfoModel().mainInfoProperty());
		mainInfo.mainInfoProperty().addListener((o, ov, nv) -> onIpChanged(o, ov, nv));
		locationTab.setContent(locationTabController.getView());
		connectionTab.setContent(connectionTabController.getView());
		securityTab.setContent(securityTabController.getView());
		
		rootView.setTop(topController.getView());


	}
	
	private void onIpChanged(ObservableValue<? extends GeoInfo> o, GeoInfo ov, GeoInfo nv) {

		locationTabController.setInfo(nv);
		connectionTabController.setInfo(nv);
		securityTabController.setInfo(nv);


	}
	
	public BorderPane getView() {
		return rootView;
	}
	

}
