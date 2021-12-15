package dad.GeoFX.api;

import dad.GeoFX.ipapi.GeoInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IpapiInterface {

	@GET("ip_api.php/")
	public Call<GeoInfo> getInfo(@Query("ip") String ip);

}
