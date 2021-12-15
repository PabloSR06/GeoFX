package dad.GeoFX.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class LocationModel {
	
	private StringProperty latitude = new SimpleStringProperty(); 
	private StringProperty longitud = new SimpleStringProperty(); 
	
	private StringProperty ip_location = new SimpleStringProperty(); 
	private ObjectProperty<Image> icon = new SimpleObjectProperty<>();

	
	private StringProperty city = new SimpleStringProperty(); 

	private StringProperty zip = new SimpleStringProperty(); 
	
	private StringProperty lenguage = new SimpleStringProperty();
	
	private StringProperty time_zone_code = new SimpleStringProperty(); 
	
	private StringProperty location_calling_code = new SimpleStringProperty(); 
	
	private StringProperty moneda = new SimpleStringProperty();

	public final StringProperty latitudeProperty() {
		return this.latitude;
	}
	

	public final String getLatitude() {
		return this.latitudeProperty().get();
	}
	

	public final void setLatitude(final String latitude) {
		this.latitudeProperty().set(latitude);
	}
	

	public final StringProperty longitudProperty() {
		return this.longitud;
	}
	

	public final String getLongitud() {
		return this.longitudProperty().get();
	}
	

	public final void setLongitud(final String longitud) {
		this.longitudProperty().set(longitud);
	}
	

	public final StringProperty ip_locationProperty() {
		return this.ip_location;
	}
	

	public final String getIp_location() {
		return this.ip_locationProperty().get();
	}
	

	public final void setIp_location(final String ip_location) {
		this.ip_locationProperty().set(ip_location);
	}
	

	public final ObjectProperty<Image> iconProperty() {
		return this.icon;
	}
	

	public final Image getIcon() {
		return this.iconProperty().get();
	}
	

	public final void setIcon(final Image icon) {
		this.iconProperty().set(icon);
	}
	

	public final StringProperty location_calling_codeProperty() {
		return this.location_calling_code;
	}
	

	public final String getLocation_calling_code() {
		return this.location_calling_codeProperty().get();
	}
	

	public final void setLocation_calling_code(final String location_calling_code) {
		this.location_calling_codeProperty().set(location_calling_code);
	}
	

	public final StringProperty cityProperty() {
		return this.city;
	}
	

	public final String getCity() {
		return this.cityProperty().get();
	}
	

	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	

	public final StringProperty zipProperty() {
		return this.zip;
	}
	

	public final String getZip() {
		return this.zipProperty().get();
	}
	

	public final void setZip(final String zip) {
		this.zipProperty().set(zip);
	}
	

	public final StringProperty time_zone_codeProperty() {
		return this.time_zone_code;
	}
	

	public final String getTime_zone_code() {
		return this.time_zone_codeProperty().get();
	}
	

	public final void setTime_zone_code(final String time_zone_code) {
		this.time_zone_codeProperty().set(time_zone_code);
	}
	

	public final StringProperty lenguageProperty() {
		return this.lenguage;
	}
	

	public final String getLenguage() {
		return this.lenguageProperty().get();
	}
	

	public final void setLenguage(final String lenguage) {
		this.lenguageProperty().set(lenguage);
	}
	

	public final StringProperty monedaProperty() {
		return this.moneda;
	}
	

	public final String getMoneda() {
		return this.monedaProperty().get();
	}
	

	public final void setMoneda(final String moneda) {
		this.monedaProperty().set(moneda);
	}
	

	
}
