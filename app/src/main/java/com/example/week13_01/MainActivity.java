package com.example.week13_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
boolean swtc=false;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

    int id= item.getItemId();

    switch(id){

        case  R.id.about: Toast.makeText(this,"about",Toast.LENGTH_LONG).show();
            break;

        case R.id.help: Toast.makeText(this,"help",Toast.LENGTH_LONG).show();
            break;

    }

        return super.onOptionsItemSelected(item);
    }
Switch switchWidget;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf= getMenuInflater();
        inf.inflate(R.menu.mymenu,menu);


        MenuItem menuItem = menu.findItem(R.id.app_bar_switch);
        switchWidget = (Switch) menuItem.getActionView();
        switchWidget.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Switch is ON
                    Toast.makeText(MainActivity.this,"ONN",Toast.LENGTH_LONG).show();
                } else {
                    // Switch is OFF
                    Toast.makeText(MainActivity.this,"OFF",Toast.LENGTH_LONG).show();
                }
            }
        });


        return super.onCreateOptionsMenu(menu);
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