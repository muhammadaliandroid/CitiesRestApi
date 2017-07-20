package uk.co.mali.citiesrestapi.deps;


import javax.inject.Singleton;

import dagger.Component;
import uk.co.mali.citiesrestapi.home.HomeActivity;
import uk.co.mali.citiesrestapi.networking.NetworkModule;


@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}
