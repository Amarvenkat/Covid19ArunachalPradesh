package com.amar.covid19arunachalpradesh.ApiInterface;

import com.amar.covid19arunachalpradesh.RetrofitClass.Covid19Zone;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiZone {

    @GET("zones.json")
    Call<Covid19Zone> getZone();
}
