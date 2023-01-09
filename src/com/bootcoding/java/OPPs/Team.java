package com.bootcoding.java.OPPs;

public class Team {

    private String team;
    private String tossResult;
    private String matchResult;


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTossResult() {
        return tossResult;
    }

    public void setTossResult(String tossResult) {
        this.tossResult = tossResult;
    }

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    public void showTeam(){
        System.out.println(team);
        System.out.println(tossResult);
        System.out.println(matchResult);
    }
    public Team(){

    }
}