package com.emre.menuuygulamalari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    int s=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        //WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        Button hide = findViewById(R.id.sbhide);
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    hideSystemBars();

            }
        });
    }

    private void hideSystemBars() {
        WindowInsetsControllerCompat windowInsetsController =ViewCompat.getWindowInsetsController(getWindow().getDecorView());

        // Configure the behavior of the hidden system bars
        windowInsetsController.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_TOUCH);
        // Hide both the status bar and the navigation bar
        if (s==1)
            windowInsetsController.hide(WindowInsetsCompat.Type.systemBars());
        else
            windowInsetsController.show(WindowInsetsCompat.Type.systemBars());
        s=1-s;
    }



}