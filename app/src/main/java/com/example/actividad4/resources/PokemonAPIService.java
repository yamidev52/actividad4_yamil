package com.example.actividad4.resources;
import com.example.actividad4.resources.PokemonFetchResults;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonAPIService {
    @GET("pokemon/?limit=50")
    Call<PokemonFetchResults> getPokemons();
}
