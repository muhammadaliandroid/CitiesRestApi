package uk.co.mali.citiesrestapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

import uk.co.mali.citiesrestapi.deps.DaggerDeps;
import uk.co.mali.citiesrestapi.deps.Deps;
import uk.co.mali.citiesrestapi.networking.NetworkModule;

public class BaseApp extends AppCompatActivity {
    Deps deps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public Deps getDeps() {
        return deps;
    }
}
