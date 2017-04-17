package com.example.daniel.a5;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView list ;
        list = (ListView) findViewById(R.id.listView1);

        final String telefony[] = {"HTC One M9", "Sony Xperia Z5", "Samsung Galaxy S6 EDGE +", "iPhone 6S Plus"};

        ArrayList<String> tel = new ArrayList<String>();
        tel.addAll( Arrays.asList(telefony) );

        ArrayAdapter<String> adapter ;
        adapter = new ArrayAdapter<String>(this, R.layout.activity_list, telefony);

        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                    if(pos == 0){
                        Intent myintent = new Intent(view.getContext(),telefon_1.class);
                        startActivityForResult(myintent,0);
                }else  if(pos == 1){
                        Intent myintent = new Intent(view.getContext(),telefon_2.class);
                        startActivityForResult(myintent,1);
                }else  if(pos == 2) {
                        Intent myintent = new Intent(view.getContext(), telefon_3.class);
                        startActivityForResult(myintent, 2);
                }else  if(pos == 3){
                        Intent myintent = new Intent(view.getContext(),telefon_4.class);
                        startActivityForResult(myintent,3);
                    }
            }
        });

    }
}