package com.example.duy.recycleviewexample;

import android.support.v7.widget.RecyclerView;

/**
 * Created by duy on 12/05/2017.
 */

public class Data {
    private String name;
    private String phone;

    public Data(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
