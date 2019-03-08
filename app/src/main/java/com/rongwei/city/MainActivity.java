package com.rongwei.city;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.rongwei.city.utils.SharedPreferencesUtils;

/**
 * Created by dell on 2016/7/20.
 */
public class MainActivity extends Activity {
    private Button button;
    private TextView textView;
    //返回码
    private final int RESULT_CODE=100;
    //请求码
    private final int REQUEST_CODE=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView(){
        button= findViewById(R.id.button);
        textView= findViewById(R.id.textView);
    }


    private void setListener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, CityActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_CODE&&resultCode==RESULT_CODE){
            String cityName=SharedPreferencesUtils.getCityName(MainActivity.this);
            textView.setText("您当前操作选择的城市为："+cityName);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}
