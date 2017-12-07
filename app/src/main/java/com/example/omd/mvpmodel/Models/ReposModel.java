package com.example.omd.mvpmodel.Models;

import java.io.Serializable;

/**
 * Created by Delta on 06/12/2017.
 */

public class ReposModel implements Serializable{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
