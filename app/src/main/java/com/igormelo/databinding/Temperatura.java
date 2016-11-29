package com.igormelo.databinding;

import android.databinding.BaseObservable;

/**
 * Created by root on 29/11/16.
 */

public class Temperatura extends BaseObservable {
    private String celsius;

    public Temperatura(String celsius) {
        this.celsius = celsius;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }
}
