package dad.GeoFX.api;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import dad.GeoFX.ipapi.GeoInfo;
import dad.api.BreedImage;
import dad.api.BreedsList;
import dad.api.DogsInterface;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IpapiService {

	private static final String BASE_URL = "https://ipapi.com/";

	private IpapiInterface service;

	public IpapiService() {
		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder().connectionPool(pool).build();

		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
				.client(client).build();
		service = retrofit.create(IpapiInterface.class);

	}

	public GeoInfo getInfo(String ip) throws IOException {
		Call<GeoInfo> call = service.getInfo(ip);

		Response<GeoInfo> response = call.execute(); 
		
		GeoInfo salida = response.body();

		return salida;
	};


	
}
