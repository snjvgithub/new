package com.example.hackathon;

import android.util.Log;

public class data {
    String oxygen, temp, place;
    String ox="95";

    public data(String oxygen, String temp, String place) {
        this.oxygen = oxygen;
        this.temp = temp;
        this.place = place;

       int s=oxygen.compareTo(ox);
        Log.d("status","normal");


    }

    public data() {


    }





    public String getOxygen() {
        return oxygen;
    }

    public String getTemp() {
        return temp;
    }

    public String getPlace() {
        return place;
    }
}