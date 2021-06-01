package com.example.healthcareforcs;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    Frag1 fragment1;
    Frag2 fragment2;
    Frag3 fragment3;
    Frag4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Frag1();
        fragment2 = new Frag2();
        fragment3 = new Frag3();
        fragment4 = new Frag4();

        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fmt = fm.beginTransaction();
        Bundle intent = getIntent().getExtras();
        final String TEXT = intent.getString("TEXT");
        final String TEXT2 = intent.getString("TEXT2");
        final String TEXT3 = intent.getString("TEXT3");
        final String TEXT4 = intent.getString("TEXT4");
        final String TEXT5 = intent.getString("it_check");
        Bundle bundle = new Bundle();
        bundle.putString("NAME",TEXT);
        bundle.putString("AGE",TEXT2);
        bundle.putString("TALL",TEXT3);
        bundle.putString("WEIGHT",TEXT4);
        bundle.putString("NG",TEXT5);
        fragment1.setArguments(bundle);

        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tab0:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();
                        return true;

                    case R.id.tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
                        return true;

                    case R.id.tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit();
                        return true;
                    case R.id.tab3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment4).commit();
                        return true;
                }
                return false;
            }
        });


    }


}