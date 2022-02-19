package com.company;

public class Course {
    static String result;
    private static int obstacleCourseHeight;

    public Course (int obstacleCourseHeight){
        this.obstacleCourseHeight = obstacleCourseHeight;
    }

    public static String doIt(Team Team) {
        result = "Команда: " + Team.getName() + " " + '\n';
        for (Players Players : Team.getPlayers()) {
            result += "Игрок: " + Players.getName() + " " + '\n';
            int value = Players.getHeight();
            obstacleCourseHeight(value);
        }
        return result;
    }
    private static void obstacleCourseHeight(int value) {
        if (value < obstacleCourseHeight) result += "игрок прошел первое препятствие " + '\n';
        else result += "игрок не прошел первое препятствие и его разрубило" + '\n';
    }
}
