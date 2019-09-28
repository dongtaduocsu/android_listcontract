package com.example.listcontract;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TextView txtMsg;



    ListView data;
    ArrayList<information> items;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg=(TextView)findViewById(R.id.text1);
        data=(ListView)findViewById(R.id.list);

        items= new ArrayList<information>();
        items.add(new information("Albert Einstein","1234567891",R.drawable.a,R.drawable.aa));
        items.add(new information("Isaac Newton","0234567891",R.drawable.b,R.drawable.bb));
        items.add(new information("Galileo Galilei ","0234557892",R.drawable.c,R.drawable.aa));
        items.add(new information("Charles Robert Darwin","0934567892",R.drawable.d,R.drawable.cc));
        items.add(new information("Aristotle","0934567892",R.drawable.e,R.drawable.aa));
        items.add(new information("Thomas Edison","0934567792",R.drawable.f,R.drawable.bb));
        items.add(new information("Stephen Hawking","0934444892",R.drawable.f,R.drawable.aa));
        items.add(new information("Louis Pasteur","0834568992",R.drawable.h,R.drawable.cc));


         information_adapter adapter=new information_adapter(MainActivity.this,R.layout.line_information,items);
        data.setAdapter(adapter);
        data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String temp=items.get(i).name+"  Phonenumber:"+items.get(i).phonenumber;
                txtMsg.setText(temp);
            }

        });

            }









}
