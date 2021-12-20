package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.GeoFX.api.IpapiService;
import dad.GeoFX.api.IpifyService;
import dad.GeoFX.ipapi.GeoInfo;
import dad.GeoFX.model.InfoModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class TopController implements Initializable {

	@FXML
	private Button checkButton;

	@FXML
	private TextField ipText;

	@FXML
	private HBox topView;

	// Model

	private InfoModel mainInfo = new InfoModel();

	private StringProperty ip = new SimpleStringProperty();

	public TopController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TopView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ipText.textProperty().bindBidirectional(ip);

		try {
			primeraIP();
		} catch (IOException e) {
			e.printStackTrace();
		}
		checkButton.arm();

	}

	void primeraIP() throws IOException {
		IpifyService service = new IpifyService();

		ip.set(service.getIp("json"));
	}

	@FXML
	void onCheckAction(ActionEvent event) throws IOException {

		IpapiService ser = new IpapiService();

		mainInfo.setMainInfo(ser.getInfo(ip.get()));
		System.out.println("ss");
		
	}

	public HBox getView() {
		return topView;
	}

	public InfoModel getInfoModel() {
		return mainInfo;
	}

}
