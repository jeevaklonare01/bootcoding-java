package com.bootcoding.java.OPPs;

public class Cricket {
    String Bowler;
    String WicketKeeper;
    String Umpire;
    String Batsman;

    public void Overs(){
        System.out.println("Number of Overs are 20");
    }

    public void Batters(){
        System.out.println("Number of Batters on field is 2");
    }

    public void Fielders(){
        System.out.println("Number of Fielders on the field is 9");
    }
    public void Stadium(){
        System.out.println("Match is at Eden Gardens Kolkata");
    }
    public void print(){
        System.out.println("Bowler currently bowling is :"+Bowler);
        System.out.println("WicketKeeper on the field is :"+WicketKeeper);
        System.out.println("Umpire on the pitch is :"+Umpire);
        System.out.println("Batsman currently batting is :"+Batsman);
    }

    public static void main(String[] args) {
//        object
        Cricket cricket = new Cricket();

        cricket.Bowler = "Shohib Akthar";
        cricket.Batsman = "Sachin Tendulkar";
        cricket.WicketKeeper = "Kamran Akmal";
        cricket.Umpire = "Aleem Dar";

//        Members
        cricket.Overs();
        cricket.Batters();
        cricket.Fielders();
        cricket.Stadium();
        cricket.print();
    }
}