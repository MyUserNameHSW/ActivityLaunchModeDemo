package com.hsw.launchmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StandardActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.standard).setOnClickListener(this);
        findViewById(R.id.singleInstance).setOnClickListener(this);
        findViewById(R.id.singleTask).setOnClickListener(this);
        findViewById(R.id.singleTop).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.standard:
                Intent standardIntent = new Intent(this, StandardActivity.class);
                startActivity(standardIntent);
                break;
            case R.id.singleInstance:
                Intent singleInstanceIntent = new Intent(this, SingleInstanceActivity.class);
                startActivity(singleInstanceIntent);
                break;
            case R.id.singleTask:
                Intent singleTaskIntent = new Intent(this, SingleTaskActivity.class);
                startActivity(singleTaskIntent);
                break;
            case R.id.singleTop:
                Intent singleTopIntent = new Intent(this, SingleTopActivity.class);
                startActivity(singleTopIntent);
                break;
            default:break;
        }
    }
}
