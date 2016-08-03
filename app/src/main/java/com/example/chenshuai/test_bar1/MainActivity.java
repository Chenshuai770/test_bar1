package com.example.chenshuai.test_bar1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn1,btn2,btn_dark,btn_nodark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.btn_white);
        btn2= (Button) findViewById(R.id.btn_black);
        btn_dark= (Button) findViewById(R.id.btn_dark);
        btn_nodark= (Button) findViewById(R.id.btn_nodark);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn_dark.setOnClickListener(this);
        btn_nodark.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_white:
                StatusBarUtil.StatusBarLightMode(MainActivity.this, false);
                break;
            case R.id.btn_black:
                StatusBarUtil.StatusBarLightMode(MainActivity.this, true);

                break;
            case R.id.btn_dark:
                startActivity(new Intent(MainActivity.this,Dark.class) );


                break;
            case R.id.btn_nodark:
                startActivity(new Intent(MainActivity.this,NoDark.class) );


                break;

        }

    }
}
