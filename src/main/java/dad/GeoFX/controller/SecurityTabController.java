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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class SecurityTabController implements Initializable {

	@FXML
    private CheckBox crawlerCheck;

    @FXML
    private CheckBox proxyCheck;

    @FXML
    private BorderPane securityView;

    @FXML
    private Label threatLabel;

    @FXML
    private CheckBox torCheck;

	
	//Model
	
	private MainModel model = new MainModel();
		

	public SecurityTabController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityTab.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		torCheck.selectedProperty().bind(model.security_is_torProperty());
		proxyCheck.selectedProperty().bind(model.proxy_typeProperty());
		crawlerCheck.selectedProperty().bind(model.is_crawlerProperty());
		threatLabel.textProperty().bind(model.security_threat_levelProperty());
		
	
	}
	
	public void setInfo(GeoInfo info) {
		
		if (info != null) {
			model.security_threat_levelProperty().set(info.getSecurity().getThreatLevel());
			model.is_crawlerProperty().set(info.getSecurity().getIsCrawler());
			model.proxy_typeProperty().set(info.getSecurity().getIsProxy());
			model.security_is_torProperty().set(info.getSecurity().getIsTor());
		}
	}

	public BorderPane getView() {
		return securityView;
	}
}
