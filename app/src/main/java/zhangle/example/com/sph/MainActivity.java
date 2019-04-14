package zhangle.example.com.sph;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import zhangle.example.com.sph.bean.MobileData;
import zhangle.example.com.sph.bean.ResultData;
import zhangle.example.com.sph.viewmodel.MobileViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_application: {
                startActivity(new Intent(this, MobileActivity.class));
                break;
            }
            case R.id.btn_implementation: {
                startActivity(new Intent(this, MobileActivity.class));
                break;
            }
        }
    }
}

