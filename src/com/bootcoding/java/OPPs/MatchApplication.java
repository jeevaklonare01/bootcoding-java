package com.bootcoding.java.OPPs;

public class MatchApplication {
    public static void main(String[] args) {
        Match match = new Match();
        match.setStadium("Edden Gardens");
        match.getStadium();
        match.setTypeOfMatch("One Day International");
        match.getTypeOfMatch();
        match.setNoOfOvers(20);
        match.getNoOfOvers();
        match.setUmpire("Umpire 1");
        match.getUmpire();
        match.setDate(" Date of the match : 01,02,2010");
        match.getDate();


        Team team1 = new Team();
        Team team2 = new Team();
        team1.setTeam("India");
        System.out.println(team1.getTeam());
        team2.setTeam("Australia");
        team2.getTeam();
        team2.setTossResult("Australia won the toss and chose to Bowl First");
        team2.getTossResult();
        team1.setMatchResult("India won by 30 runs");
        team1.getMatchResult();

        match.showMatch();
        team1.showTeam();
        team2.showTeam();
    }
}
