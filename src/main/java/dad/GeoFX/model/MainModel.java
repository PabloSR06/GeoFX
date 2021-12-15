package dad.GeoFX.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class MainModel {
	
	//Location
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
	
	//Connection
	private StringProperty ip_address = new SimpleStringProperty();
	private StringProperty connection_isp = new SimpleStringProperty(); 
	private StringProperty type = new SimpleStringProperty(); 
	private StringProperty connection_asn = new SimpleStringProperty();
	private StringProperty hostname = new SimpleStringProperty();
	
	//Security
	private BooleanProperty security_is_tor = new SimpleBooleanProperty();
	private BooleanProperty proxy_type = new SimpleBooleanProperty();
	private BooleanProperty is_crawler = new SimpleBooleanProperty();
	private StringProperty security_threat_level = new SimpleStringProperty();

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


	public final StringProperty ip_addressProperty() {
		return this.ip_address;
	}
	


	public final String getIp_address() {
		return this.ip_addressProperty().get();
	}
	


	public final void setIp_address(final String ip_address) {
		this.ip_addressProperty().set(ip_address);
	}
	


	public final StringProperty connection_ispProperty() {
		return this.connection_isp;
	}
	


	public final String getConnection_isp() {
		return this.connection_ispProperty().get();
	}
	


	public final void setConnection_isp(final String connection_isp) {
		this.connection_ispProperty().set(connection_isp);
	}
	


	public final StringProperty typeProperty() {
		return this.type;
	}
	


	public final String getType() {
		return this.typeProperty().get();
	}
	


	public final void setType(final String type) {
		this.typeProperty().set(type);
	}
	


	public final StringProperty connection_asnProperty() {
		return this.connection_asn;
	}
	


	public final String getConnection_asn() {
		return this.connection_asnProperty().get();
	}
	


	public final void setConnection_asn(final String connection_asn) {
		this.connection_asnProperty().set(connection_asn);
	}
	


	public final StringProperty hostnameProperty() {
		return this.hostname;
	}
	


	public final String getHostname() {
		return this.hostnameProperty().get();
	}
	


	public final void setHostname(final String hostname) {
		this.hostnameProperty().set(hostname);
	}


	public final BooleanProperty security_is_torProperty() {
		return this.security_is_tor;
	}
	


	public final boolean isSecurity_is_tor() {
		return this.security_is_torProperty().get();
	}
	


	public final void setSecurity_is_tor(final boolean security_is_tor) {
		this.security_is_torProperty().set(security_is_tor);
	}
	


	public final StringProperty security_threat_levelProperty() {
		return this.security_threat_level;
	}
	


	public final String getSecurity_threat_level() {
		return this.security_threat_levelProperty().get();
	}
	


	public final void setSecurity_threat_level(final String security_threat_level) {
		this.security_threat_levelProperty().set(security_threat_level);
	}


	public final BooleanProperty proxy_typeProperty() {
		return this.proxy_type;
	}
	


	public final boolean isProxy_type() {
		return this.proxy_typeProperty().get();
	}
	


	public final void setProxy_type(final boolean proxy_type) {
		this.proxy_typeProperty().set(proxy_type);
	}
	


	public final BooleanProperty is_crawlerProperty() {
		return this.is_crawler;
	}
	


	public final boolean isIs_crawler() {
		return this.is_crawlerProperty().get();
	}
	


	public final void setIs_crawler(final boolean is_crawler) {
		this.is_crawlerProperty().set(is_crawler);
	}
	
	
	
	

	
}
