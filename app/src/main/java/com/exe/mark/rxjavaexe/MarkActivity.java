package com.exe.mark.rxjavaexe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MarkActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark);
        findViewById(R.id.btn_exe01).setOnClickListener(this);
        findViewById(R.id.btn_exe02).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_exe01:
                break;
            case R.id.btn_exe02:
                break;
        }
    }
}
