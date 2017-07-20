package uk.co.mali.citiesrestapi.networking;


import retrofit2.http.GET;
import rx.Observable;
import uk.co.mali.citiesrestapi.models.CityListResponse;

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}
