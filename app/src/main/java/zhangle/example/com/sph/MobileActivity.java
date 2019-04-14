package zhangle.example.com.sph;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import zhangle.example.com.sph.bean.ResultData;
import zhangle.example.com.sph.viewmodel.MobileViewModel;

public class MobileActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private TextView tvId;
    private TextView tvName;
    private MobileViewModel mobileViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_item);
        initView();
        initData();
    }

    private void initView() {
        tvId = (TextView) findViewById(R.id.tv_id);
        tvName = (TextView) findViewById(R.id.tv_name);
    }

    private void initData() {
        mobileViewModel = ViewModelProviders.of(this).get(MobileViewModel.class);
        mobileViewModel.getMobiledata().observe(this, new Observer<ResultData>() {
            @Override
            public void onChanged(@Nullable ResultData mdata) {
                updateView(mdata);
            }
        });

    }

    private void updateView(ResultData result) {
        Log.d(TAG, result.toString());
        tvId.setText(result.getHelpdata());
        tvName.setText(result.getSuccesscode());
    }

}
