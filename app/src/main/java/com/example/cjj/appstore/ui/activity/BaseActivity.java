package com.example.cjj.appstore.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.cjj.appstore.R;

/**
 * Created by admin on 2016/8/10.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
