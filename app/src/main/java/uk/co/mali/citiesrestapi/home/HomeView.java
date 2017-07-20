package uk.co.mali.citiesrestapi.home;


import uk.co.mali.citiesrestapi.models.CityListResponse;

public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getityListSuccess(CityListResponse cityListResponse);

}
