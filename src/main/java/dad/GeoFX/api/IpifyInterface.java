package dad.GeoFX.api;

import dad.GeoFX.myip.Myip;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IpifyInterface {

	@GET("/")
	public Call<Myip> getIp(@Query("format") String format);

}
