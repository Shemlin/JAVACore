package com.company;

public class Players {
    private String name;
    private int weight;
    private int height;

    public Players (String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
