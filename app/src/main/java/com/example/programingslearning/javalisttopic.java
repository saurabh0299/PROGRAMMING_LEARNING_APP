package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class javalisttopic extends AppCompatActivity {

    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javalisttopic);




        lst=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("                          INDRODUCTION");
        arrayList.add("                          CONSTRUCTOR");
        arrayList.add("                          PACKAGES/API");
        arrayList.add("                          ABSTRACTION");
        arrayList.add("                          HASH MAP");
        arrayList.add("                          WRAPPER CLASSES");
        arrayList.add("                          EXCEPTION");
        arrayList.add("                          PRACTICS PROJECTS");
        arrayList.add("                          INTERVIEW QUESTION");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lst.setAdapter(arrayAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(javalisttopic.this, javaintro.class);
                    startActivity(intent);
                }


                if(position==1)
                {
                    Intent intent=new Intent(javalisttopic.this, javaconstractors.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent=new Intent(javalisttopic.this, javapackges.class);
                    startActivity(intent);
                }

                if(position==3)
                {
                    Intent intent=new Intent(javalisttopic.this, javaabstraction.class);
                    startActivity(intent);
                }

                if(position==4)
                {
                    Intent intent=new Intent(javalisttopic.this, javahashmap.class);
                    startActivity(intent);
                }

                if(position==5)
                {
                    Intent intent=new Intent(javalisttopic.this, javawrapperclass.class);
                    startActivity(intent);
                }

                if(position==6)
                {
                    Intent intent=new Intent(javalisttopic.this, javaexception.class);
                    startActivity(intent);
                }

                if(position==7)
                {
                    Intent intent=new Intent(javalisttopic.this, javaprojects.class);
                    startActivity(intent);
                }

                if(position==8)
                {
                    Intent intent=new Intent(javalisttopic.this, javainterviewq.class);
                    startActivity(intent);
                }




            }
        });






    }
}
