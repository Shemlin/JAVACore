package com.company;

public class Course1 {
    static String result1;
    private static int permissibleWeightInSand;

    public Course1 (int permissibleWeightInSand){
        this.permissibleWeightInSand = permissibleWeightInSand;
    }

    public static String doIt(Team Team) {
        result1 = "Команда: " + Team.getName() + " " + '\n';
        for (Players Players : Team.getPlayers()) {
            result1 += "Игрок: " + Players.getName() + " " + '\n';
            int value = Players.getWeight();
            permissibleWeightInSand(value);
        }
        return result1;
    }
    private static void permissibleWeightInSand(int value) {
        if (value < permissibleWeightInSand) result1 += "игрок прошел второе препятствие " + '\n';
        else result1 += "игрок не прошел второе препятствие и утонул в песках" + '\n';
    }
}
