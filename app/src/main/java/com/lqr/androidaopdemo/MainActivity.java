package com.lqr.androidaopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @IsLogin()
    public void test(View view) {

        Log.d("XiaMuYao", "test: 我是登录之后的操作");
    }

}
