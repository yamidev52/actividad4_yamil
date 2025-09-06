package com.example.actividad4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;

public class Pokemon1Activity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = new TextView(this);
        textView.setText("Cargando Pokémon...");
        textView.setTextSize(24);
        setContentView(textView);

        fetchPokemonName("https://pokeapi.co/api/v2/pokemon/25");
    }

    private void fetchPokemonName(String url) {
        RequestQueue queue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET, url, null,
                response -> {
                    try {
                        String name = response.getString("name");
                        textView.setText(name.toUpperCase());
                    } catch (JSONException e) {
                        textView.setText("Error leyendo JSON");
                    }
                },
                error -> textView.setText("Error al cargar Pokémon")
        );

        queue.add(jsonObjectRequest);
    }
}
