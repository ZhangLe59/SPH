package zhangle.example.com.sph.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import zhangle.example.com.sph.bean.ResultData;

public class ResultRepository {
    private static final ResultRepository instance = new ResultRepository();
    private ResultRepository(){}
    private static ResultRepository getInstance(){
        return instance;
    }
    private ResultApi resultApi = RetrofitFactory.getInstance().create(ResultApi.class);
    public LiveData<ResultData> getResult(String resultname) {
        final MutableLiveData<ResultData> result = new MutableLiveData<>();
        resultApi.queryData()
                .enqueue(new Callback<ResultData>() {
                    @Override
                    public void onResponse(Call<ResultData> call, Response<ResultData> response) {
                        result.setValue(response.body());
                    }

                    @Override
                    public void onFailure(Call<ResultData> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
        return result;
    }
}
