package com.example.frywj.navigationdrawerdemo;

import java.util.Random;

/**
 * Created by frywj on 11/21/2016.
 */

public class Nation {

    public int numRegions;
    public double armySkillLevel;
    public Region[] ownedRegionIDs;



    public void attack(int fromID, int toID) {
        Random r = new Random();
        //double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        double fromRoll = 1 + (100 - 1) * r.nextDouble();
        double toRoll = 1 + (100 - 1) * r.nextDouble();

        //need logic to check if fromID and toID are held by different Nations  (i.e. isValidAttack())

        if (fromRoll > toRoll) {
            //don't remember how to play risk
        }
    }
}
