package com.booleanautocrats.road_naksha;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class adimFeedActivity extends AppCompatActivity {
    String nagarName;
    TextView nagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.admin_feed_container);
        Bundle extras;
        Intent intent=getIntent();
        extras = intent.getExtras();
        nagarName = extras.getString("nagarName");
        nagar=findViewById(R.id.nagarName);
        nagar.setText(nagarName);
    }
}
