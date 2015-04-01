package com.example.claramautitzson.mamn01;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * Created by claramauritzson on 15-03-27.
 */
public class Klick extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamn01);
        View.OnClickListener listnr = new OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mamn01.class));
            }
        };
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(listnr);
    }
}
