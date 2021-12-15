package dad.GeoFX.model;

import dad.GeoFX.ipapi.GeoInfo;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class InfoModel {
	
	private ObjectProperty<GeoInfo> mainInfo = new SimpleObjectProperty<>();

	public final ObjectProperty<GeoInfo> mainInfoProperty() {
		return this.mainInfo;
	}
	

	public final GeoInfo getMainInfo() {
		return this.mainInfoProperty().get();
	}
	

	public final void setMainInfo(final GeoInfo mainInfo) {
		this.mainInfoProperty().set(mainInfo);
	}
}
