package com.amar.covid19arunachalpradesh.ApiInterface;

import com.amar.covid19arunachalpradesh.RetrofitClass.TelanganaStateWise;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiDistrictData {

    @GET("state_district_wise.json")
    Call<TelanganaStateWise> getDistrictData();

}
