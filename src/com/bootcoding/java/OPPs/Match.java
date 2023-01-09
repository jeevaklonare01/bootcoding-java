package com.bootcoding.java.OPPs;

import java.util.Date;
public class Match {
    private String Stadium;
     private String Umpire;
     private String Date;
    private String typeOfMatch;
    private int noOfOvers;

    public int getNoOfOvers() {
        return noOfOvers;
    }

    public void setNoOfOvers(int noOfOvers) {
        this.noOfOvers = noOfOvers;
    }

    public String getTypeOfMatch() {
        return typeOfMatch;
    }

    public void setTypeOfMatch(String typeOfMatch) {
        this.typeOfMatch = typeOfMatch;
    }

    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String stadium) {
        Stadium = stadium;
    }

    public String getUmpire() {
        return Umpire;
    }

    public void setUmpire(String umpire) {
        Umpire = umpire;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void showMatch(){
        System.out.println(getStadium());
        System.out.println(getUmpire());
        System.out.println(Date);
        System.out.println(typeOfMatch);
        System.out.println(noOfOvers);
    }


    public Match(){

    }
}
