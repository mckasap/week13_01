package com.example.week13_01;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View v){
        int id=v.getId();
        Button b= (Button) v;
        String str= b.getText().toString();
        v.getResources().getResourceEntryName(v.getId());
        Toast.makeText(this, str,Toast.LENGTH_LONG).show();

        int ident= getResources().getIdentifier(str,"raw","com.example.week13_01");

       
        MediaPlayer mp = MediaPlayer.create(this,ident);
        mp.start();

    }
}