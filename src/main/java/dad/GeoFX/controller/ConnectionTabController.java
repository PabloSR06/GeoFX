package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.GeoFX.api.IpapiService;
import dad.GeoFX.api.IpifyService;
import dad.GeoFX.ipapi.GeoInfo;
import dad.GeoFX.model.InfoModel;
import dad.GeoFX.model.MainModel;
import javafx.application.Application;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class ConnectionTabController implements Initializable {

	@FXML
    private Label asnLabel;

    @FXML
    private BorderPane connectionView;

    @FXML
    private Label hostLabel;

    @FXML
    private Label ipLabel;

    @FXML
    private Label ispLabel;

    @FXML
    private Label typeLabel;
	
	//Model
	
	private MainModel model = new MainModel();
		

	public ConnectionTabController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionTab.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		ipLabel.textProperty().bindBidirectional(model.ip_addressProperty());
		ispLabel.textProperty().bindBidirectional(model.connection_ispProperty());
		typeLabel.textProperty().bindBidirectional(model.typeProperty());
		asnLabel.textProperty().bindBidirectional(model.connection_asnProperty());
		hostLabel.textProperty().bindBidirectional(model.hostnameProperty());
	
	}
	
	public void setInfo(GeoInfo info) {
		
		if (info != null) {
			model.ip_addressProperty().set(info.getIp());
			model.connection_ispProperty().set(info.getConnection().getIsp());
			model.typeProperty().set(info.getType());
			model.connection_asnProperty().set(info.getConnection().getAsn().toString());
			model.hostnameProperty().set(info.getHostname());
		}
	}

	public BorderPane getView() {
		return connectionView;
	}
}
