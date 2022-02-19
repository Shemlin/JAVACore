package com.company;

public class Team {
    private String name;
    private Players[] players;

    public Team(String name, Players[] players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public Players[] getPlayers() {
        return players;
    }
}
