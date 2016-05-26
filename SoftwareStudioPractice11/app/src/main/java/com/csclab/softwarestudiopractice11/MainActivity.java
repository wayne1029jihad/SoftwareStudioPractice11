package com.csclab.softwarestudiopractice11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;

    Intent intent =new Intent();

    Bundle bundle =new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** To Do:
         * (1) Find the UI element on xml file
         * **/
        edt = (EditText) findViewById(R.id.editText);
        send = (Button) findViewById(R.id.button);
        send.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                sendName();
            }
        });

    }

    public void sendName(){

        /** To Do:
         * (1) Use intent and Bundle to pass string
         * (2) Change activity to Activity2
         * **/

        intent.setClass(this, Activity2.class);
        bundle.putString("name",edt.getText().toString());
        intent.putExtras(bundle); // Pass bundle to intent
        startActivity(intent); //Switch Activity

    }



}
