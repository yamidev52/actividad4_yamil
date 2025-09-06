package com.example.actividad4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
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

        // Vincular vistas
        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);

        // Toolbar
        setSupportActionBar(toolbar);

        // Drawer toggle con iconos de abrir/cerrar
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.drawable.menu_open_background,R.drawable.menu_close_background);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Listener del menú
        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_pokemon1) {
                startActivity(new Intent(MainActivity.this, Pokemon1Activity.class));
            } else if (id == R.id.nav_pokemon2) {
                startActivity(new Intent(MainActivity.this, Pokemon2Activity.class));
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }
}





