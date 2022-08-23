package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class mainscreen extends AppCompatActivity {

    //programing option c cplus java etc

    Button c,cplus,java,android;
    Text text1;





    TextView name, mail;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);




        //gradiant animation

        RelativeLayout relativeLayout = findViewById(R.id.animationbackground2);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

        //end










            logout = findViewById(R.id.logout);
            name = findViewById(R.id.name);
            mail = findViewById(R.id.mail);


            GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
            if(signInAccount != null){
                name.setText(signInAccount.getDisplayName());
                mail.setText(signInAccount.getEmail());
            }


            logout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FirebaseAuth.getInstance().signOut();
                    Intent intent = new Intent(getApplicationContext(),googlelogin.class);
                    startActivity(intent);
                }
            });

            //programing option c c++ java and android


        c=(Button)findViewById(R.id.clanguage);
        cplus=(Button)findViewById(R.id.cpluslanguage);
        java=(Button)findViewById(R.id.java);
        android=(Button)findViewById(R.id.android);


        //ctopic list

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainscreen.this,clisttopic.class);
                startActivity(intent);
            }
        });




        //android list

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainscreen.this,androidtopiclist.class);
                startActivity(intent);
            }
        });



        //c++list

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainscreen.this,cpluslisttopic.class);
                startActivity(intent);
            }
        });

        //java
        //list

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainscreen.this,javalisttopic.class);
                startActivity(intent);
            }
        });



    }
    }




