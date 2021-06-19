package com.amar.covid19arunachalpradesh.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class TelanganaStateWise {


   @SerializedName("Arunachal Pradesh")
   private Telangana telangana;

   public TelanganaStateWise(Telangana telangana) {
       this.telangana = telangana;
   }

   public Telangana getTelangana() {
       return telangana;
   }

   public void setTelangana(Telangana telangana) {
       this.telangana = telangana;
   }
}
