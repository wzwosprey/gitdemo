package com.anhao.uf.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    //测试修改  提交到github
    private TextView tv_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_test = (TextView) findViewById(R.id.tv);
        tv_test.setText("qzqzqqzqjqzqqzq");
    }
}
