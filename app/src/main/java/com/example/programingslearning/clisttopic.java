package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class clisttopic extends AppCompatActivity {

    ListView lst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clisttopic);





        lst=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("                          INTRODUCTION");
        arrayList.add("                          VARIABLES");
        arrayList.add("                          LOOPS");
        arrayList.add("                          DECISION MAKING");
        arrayList.add("                          FUNCTION");
        arrayList.add("                          ARRAY");
        arrayList.add("                          POINTER");
        arrayList.add("                          ERROR HANDLING");
        arrayList.add("                          RECURSION");
        arrayList.add("                          PRACTICS QUESTION");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lst.setAdapter(arrayAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(clisttopic.this, cintroduction.class);
                    startActivity(intent);
                }


                if(position==1)
                {
                    Intent intent=new Intent(clisttopic.this, cvariables.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent=new Intent(clisttopic.this, cloops.class);
                    startActivity(intent);
                }

                if(position==3)
                {
                    Intent intent=new Intent(clisttopic.this, cdecisionmaking.class);
                    startActivity(intent);
                }

                if(position==4)
                {
                    Intent intent=new Intent(clisttopic.this, cfunction.class);
                    startActivity(intent);
                }

                if(position==5)
                {
                    Intent intent=new Intent(clisttopic.this, carray.class);
                    startActivity(intent);
                }

                if(position==6)
                {
                    Intent intent=new Intent(clisttopic.this, cpointer.class);
                    startActivity(intent);
                }

                if(position==7)
                {
                    Intent intent=new Intent(clisttopic.this, cerrorhandling.class);
                    startActivity(intent);
                }

                if(position==8)
                {
                    Intent intent=new Intent(clisttopic.this, crecursion.class);
                    startActivity(intent);
                }

                if(position==9)
                {
                    Intent intent=new Intent(clisttopic.this, cpracticsquestion.class);
                    startActivity(intent);
                }












            }
        });







    }
}
