package com.example.actividad4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //configuramos los usos del drawerlayout, toolbar y navigationview
        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);

        //configuramos el toolbar
        setSupportActionBar(toolbar);


        //configuramos el drawerlayout con los iconos
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, 
                R.drawable.menu_open_background,R.drawable.menu_close_background);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////                switch (item.getItemId()){
////                    case R.id.nav_home:
////                        break;
////                    case R.id.nav_settings:
////                        break;
////
////                }
////                drawerLayout.closeDrawer(GravityCompat.START);
////                return true;
//            }
//        });

    }
}