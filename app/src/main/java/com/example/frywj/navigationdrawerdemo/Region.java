package com.example.frywj.navigationdrawerdemo;

import java.util.Random;

/**
 * Created by frywj on 11/21/2016.
 */

public class Region {

    int numArmies;
    int numNeighbors;
    String[] myNeighbors;


    //constructor
    public Region (int numArmies, int numNeighbors) {
        numArmies = 10;
    }


    //getters and setters
    public void setNumArmies(int newArmies) {
        numArmies = numArmies + newArmies;
    }

    public int getNumArmies() {
        return numArmies;
    }

    public String[] getMyNeighbors () {
        for (int i=0; i<numNeighbors; i ++) {
            //add name of neighbor to array
        }
        return myNeighbors;
    }
}
