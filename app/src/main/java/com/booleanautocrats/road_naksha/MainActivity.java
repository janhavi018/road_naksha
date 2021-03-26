package com.booleanautocrats.road_naksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ImageView menuIcon;
    ImageView adminLogin;
    Button nagarA;
    Button nagarB;
    Button nagarC;
    Button nagarD;
    Button nagarE;
    Button nagarF;
    Button nagarG;
    Button nagarH;
    String nagarName;
    private int flag=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        menuIcon=findViewById(R.id.menuIcon);
        adminLogin=findViewById(R.id.adminLoginItem);
        nagarA=findViewById(R.id.nagarA);
        nagarB=findViewById(R.id.nagarB);
        nagarC=findViewById(R.id.nagarC);
        nagarD=findViewById(R.id.nagarD);
        nagarE=findViewById(R.id.nagarE);
        nagarF=findViewById(R.id.nagarF);
        nagarG=findViewById(R.id.nagarG);
        nagarH=findViewById(R.id.nagarH);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=1;
                if(flag==1) {
                    adminLogin.setVisibility(View.VISIBLE);
                    adminLogin.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            Intent in = new Intent(MainActivity.this, AdminLoginActivity.class);
                            startActivity(in);
                            finish();


                        }
                    });

                }

            }


        });
        flag=0;

        nagarA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarA.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarB.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarC.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarD.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarE.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarF.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarG.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
        nagarH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagarName=nagarH.getText().toString();
                Intent in=new Intent(MainActivity.this,feedActivity.class);
                in.putExtra("nagarName",nagarName);
                startActivity(in);
            }
        });
    }
}