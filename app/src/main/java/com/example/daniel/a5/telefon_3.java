package com.example.daniel.a5;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telefon_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefon_3);
        Context context = getApplicationContext();
        final Intent intent = new Intent(context,MainActivity.class);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
