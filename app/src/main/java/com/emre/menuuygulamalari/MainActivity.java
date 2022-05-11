package com.emre.menuuygulamalari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("emre");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.nevu2));


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getSupportActionBar().isShowing())
                    getSupportActionBar().hide();
                else
                    getSupportActionBar().show();
                //Toast.makeText(MainActivity.this,"deneme",Toast.LENGTH_LONG).show();
                Snackbar snackbar =Snackbar.make(findViewById(R.id.anasayfa),"action bar durumu değişti.",Snackbar.LENGTH_LONG);
                snackbar.setAction("geri al", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (getSupportActionBar().isShowing())
                            getSupportActionBar().hide();
                        else
                            getSupportActionBar().show();
                    }
                });
                snackbar.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainactivity_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.bir:
                Toast.makeText(MainActivity.this,"ilk menü",Toast.LENGTH_LONG).show();

                return true;
            case R.id.bucuk:
                Toast.makeText(MainActivity.this,"iç menü",Toast.LENGTH_LONG).show();

                return true;
            case R.id.uc:
                Toast.makeText(MainActivity.this,"üçüncü menü",Toast.LENGTH_LONG).show();

                return true;
            default:

                return super.onOptionsItemSelected(item);

        }


    }
}