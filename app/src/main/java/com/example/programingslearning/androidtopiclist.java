package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class androidtopiclist extends AppCompatActivity {

    ListView lst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidtopiclist);




        lst=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("                          ACTIVITYS");
        arrayList.add("                          FRAGMENTS");
        arrayList.add("                          UI LAYOUTS");
        arrayList.add("                          ANIMATION");
        arrayList.add("                          DATABSE");
        arrayList.add("                          GOOGLE MAPS API");
        arrayList.add("                          INTERVIEW QUESTION");
        arrayList.add("                          PRATICS PROJECTS");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lst.setAdapter(arrayAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidactivitys.class);
                    startActivity(intent);
                }


                if(position==1)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidfragments.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidlayout.class);
                    startActivity(intent);
                }

                if(position==3)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidanimation.class);
                    startActivity(intent);
                }

                if(position==4)
                {
                    Intent intent=new Intent(androidtopiclist.this, androiddatabase.class);
                    startActivity(intent);
                }

                if(position==5)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidgooglemap.class);
                    startActivity(intent);
                }

                if(position==6)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidinterviewQ.class);
                    startActivity(intent);
                }

                if(position==7)
                {
                    Intent intent=new Intent(androidtopiclist.this, androidprojects.class);
                    startActivity(intent);
                }




            }
        });








    }
}
