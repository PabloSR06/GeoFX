package dad.GeoFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TopController implements Initializable {
	
	@FXML
    private Button checkButton;

    @FXML
    private TextField ipText;

    @FXML
    private HBox topView;

	
	public TopController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TopView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
    void onCheckAction(ActionEvent event) {

    }
}
