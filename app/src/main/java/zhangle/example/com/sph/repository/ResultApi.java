package zhangle.example.com.sph.repository;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import zhangle.example.com.sph.bean.ResultData;

public interface ResultApi {
    @GET("/datastore_search?resource_id=a807b7ab-6cad-4aa6-87d0-e283a7353a0f&limit=5")
    Call<ResultData> queryData();

}
