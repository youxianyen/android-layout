package com.example.smy.touxiang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.smy.touxiang.R.id.action0;
import static com.example.smy.touxiang.R.id.editText1;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    private EditText EditText1;

    private EditText et;

    private String str1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        //btn.setOnClickListener(this);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                intent.setClass(MainActivity.this, Main2Activity.class);

                String str1="";
                EditText editText1 =(EditText)findViewById(R.id.editText1);
                str1=editText1.getText().toString();

                //用Bundle携带数据
                Bundle bundle=new Bundle();

                //传递name参数
                bundle.putString("name", String.valueOf(str1));
                intent.putExtras(bundle);

                startActivity(intent);
            }

        });

/*
        EditText1 = (EditText) findViewById(editText1);
        str1 = EditText1.getText().toString();

        EditText1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this, Main2Activity.class);
                intent.setClass(MainActivity.this, Main2Activity.class);

                String str1="";
                EditText editText1 =(EditText)findViewById(R.id.editText1);
                str1=editText1.getText().toString();


                //用Bundle携带数据
                Bundle bundle=new Bundle();

                //传递name参数为tinyphp
                bundle.putString("name", String.valueOf(str1));
                intent.putExtras(bundle);

                startActivity(intent);
            }

        });*/

    }




}
