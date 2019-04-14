package zhangle.example.com.sph.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import zhangle.example.com.sph.bean.ResultData;


public class MobileViewModel extends ViewModel {
    private MutableLiveData<ResultData> resultdata;

    public LiveData<ResultData> getMobiledata(){
        if (resultdata == null){
            resultdata = new MutableLiveData<>();
        }
        return resultdata;
    }

    public void setMobiledataname(String name){
        resultdata.setValue(new ResultData(name,"200",null));
    }
}
