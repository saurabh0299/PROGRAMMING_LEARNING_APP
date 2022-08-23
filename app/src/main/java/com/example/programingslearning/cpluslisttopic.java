package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class cpluslisttopic extends AppCompatActivity {

    ListView lst;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpluslisttopic);




        lst=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("                          INDRODUCTION");
        arrayList.add("                          CLASS & OBJECT");
        arrayList.add("                          INHERITANCE");
        arrayList.add("                          OVERLOADING");
        arrayList.add("                          POLYMORPHISM");
        arrayList.add("                          DATA ENCAPSULATION");
        arrayList.add("                          MULTITHREADING");
        arrayList.add("                          PRACTICS PROJECTS");
        arrayList.add("                          INTERVIEW QUESTION");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lst.setAdapter(arrayAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusintroduction.class);
                    startActivity(intent);
                }


                if(position==1)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusclassobject.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusinheritance.class);
                    startActivity(intent);
                }

                if(position==3)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusoverloading.class);
                    startActivity(intent);
                }

                if(position==4)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cpluspolymorphism.class);
                    startActivity(intent);
                }

                if(position==5)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusencapsulation.class);
                    startActivity(intent);
                }

                if(position==6)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusmultithreading.class);
                    startActivity(intent);
                }

                if(position==7)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusquestion.class);
                    startActivity(intent);
                }

                if(position==8)
                {
                    Intent intent=new Intent(cpluslisttopic.this, cplusintervieq.class);
                    startActivity(intent);
                }




            }
        });








    }
}
