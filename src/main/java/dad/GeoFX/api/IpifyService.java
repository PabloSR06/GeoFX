package dad.GeoFX.api;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import dad.GeoFX.myip.Myip;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IpifyService {

	private static final String BASE_URL = "https://api.ipify.org";

	private IpifyInterface service;

	public IpifyService() {
		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder().connectionPool(pool).build();

		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
				.client(client).build();
		service = retrofit.create(IpifyInterface.class);

	}

	public String getIp(String format) throws IOException {
		Call<Myip> call = service.getIp(format);

		Response<Myip> response = call.execute();

		Myip ip = response.body();

		String salida = ip.getIp();

		return salida;

	};


	
}
