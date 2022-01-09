package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import dad.GeoFX.ipapi.GeoInfo;
import dad.GeoFX.model.InfoModel;
import dad.GeoFX.model.MainModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class LocationTabController implements Initializable {

	@FXML
	private Label callingCodeLabel;

	@FXML
	private Button checkButton;

	@FXML
	private Label cityLabel;

	@FXML
	private Label currencyLabel;

	@FXML
	private TextField ipText;

	@FXML
	private Label languageLabel;

	@FXML
	private Label latitudLabel;

	@FXML
	private BorderPane locationView;

	@FXML
	private Label logintudLabel;

	@FXML
	private Label paisLabel;

	@FXML
	private ImageView paisView;

	@FXML
	private Label timeZoneLabel;

	@FXML
	private Label zipLabel;

	// Model

	private MainModel model = new MainModel();


	public LocationTabController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationTab.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		latitudLabel.textProperty().bind(model.latitudeProperty());
		logintudLabel.textProperty().bind(model.longitudProperty());
		callingCodeLabel.textProperty().bind(model.location_calling_codeProperty());
		zipLabel.textProperty().bind(model.zipProperty());
		paisLabel.textProperty().bind(model.ip_locationProperty());
		paisView.imageProperty().bind(model.iconProperty());
		cityLabel.textProperty().bind(model.cityProperty());
		languageLabel.textProperty().bind(model.lenguageProperty());
		timeZoneLabel.textProperty().bind(model.time_zone_codeProperty());
		currencyLabel.textProperty().bind(model.monedaProperty());

	}

	public void setInfo(GeoInfo info) {

		if (info != null) {
			model.latitudeProperty().set(info.getLatitude()+ "");
			model.longitudProperty().set(info.getLongitude()+ "");
			model.time_zone_codeProperty().set(info.getTimeZone().getCode());
			model.ip_locationProperty().set(info.getCountryName() + "(" +info.getCountryCode()+")");
			model.iconProperty().set(new Image(getClass().getResource("/flag-icons/96x64/" + info.getCountryCode() +  ".png").toExternalForm()));
			
			model.zipProperty().set(info.getZip());
			model.cityProperty().set(info.getCity() + " (" + info.getRegionName() + ")");
			model.lenguageProperty().set(info.getLocation().getLanguages().get(0).getName() + " ("
					+ info.getLocation().getLanguages().get(0).getCode() + ")");
			model.monedaProperty().set(info.getCurrency().getName() + " (" + info.getCurrency().getSymbol() + ")");
			model.location_calling_codeProperty().set("+" + info.getLocation().getCallingCode());
		}
	}

	public BorderPane getView() {
		return locationView;
	}
}
