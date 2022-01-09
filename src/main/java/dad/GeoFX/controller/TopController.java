package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;

import dad.GeoFX.api.IpapiService;
import dad.GeoFX.api.IpifyService;
import dad.GeoFX.ipapi.GeoInfo;
import dad.GeoFX.main.GeoFXApp;
import dad.GeoFX.model.InfoModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
	
	
	//servicio
	
	private Task<GeoInfo> task;
	
	private IpapiService servicio = new IpapiService();
	
	



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

	}

	void primeraIP() throws IOException {
		IpifyService service = new IpifyService();
		ip.set(service.getIp());
	}
	

	public void cargarDatos() throws IOException {
		task = new Task<GeoInfo>() {

			@Override
			protected GeoInfo call() throws Exception {
					return servicio.getInfo(ip.get());
			}
		};

		task.setOnSucceeded(ev -> {
			
				
				try {
					if (task.get().getHostname() != null) {
					
						mainInfo.setMainInfo(task.get());		
					}
					else {
						Alert alerta = new Alert(AlertType.ERROR);
						alerta.initOwner(GeoFXApp.getPrimaryStage());			
						alerta.setTitle("ERROR");
						alerta.setHeaderText("Error con la IP");
						alerta.showAndWait();
					}
				} catch (InterruptedException | ExecutionException e) {
					Alert alerta = new Alert(AlertType.ERROR);
					alerta.initOwner(GeoFXApp.getPrimaryStage());
					alerta.setTitle("ERROR");
					alerta.setHeaderText("Error con la carga de datos");
					alerta.showAndWait();
				}}

		);

		
		new Thread(task).start();
	}
	
	@FXML
	void onCheckAction(ActionEvent event) throws IOException {
		cargarDatos();
	}

	public HBox getView() {
		return topView;
	}

	public InfoModel getInfoModel() {
		return mainInfo;
	}

}
