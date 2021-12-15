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
    
    //Model
    	
	private InfoModel mainInfo = new InfoModel();


	
	public TopController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TopView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

	}
	
    void primeraIP() throws IOException {
		IpifyService service = new IpifyService();
		String salida = service.getIp("json");
		System.out.println(salida);

		IpapiService ser = new IpapiService();

				
		mainInfo.setMainInfo(ser.getInfo(salida));
		
    }
	
		

	@FXML
    void onCheckAction(ActionEvent event) throws IOException {
		IpifyService service = new IpifyService();
		String salida = service.getIp("json");
		System.out.println(salida);

		IpapiService ser = new IpapiService();

				
		mainInfo.setMainInfo(ser.getInfo(salida));
		
		System.out.println(ser.getInfo(salida).getSecurity().getThreatLevel());
//		
    }
	
	public HBox getView() {
		return topView;
	}
	
	public InfoModel getInfoModel() {
		return mainInfo;
	}

}
