package com.company;

public class Main {

    public static void main(String[] args) {
        Players[] Players = new Players[4];
        Players[0] = new Players("Игрок1", 50, 175);
        Players[1] = new Players("Игрок2", 55, 180);
        Players[2] = new Players("Игрок3", 60, 185);
        Players[3] = new Players("Игрок4", 70, 195);
        Team Team = new Team("Воробьи", Players);

        Course course = new Course(190);
        String result = Course.doIt(Team);
        System.out.println(result);
        Course1 course1 = new Course1(60);
        String result1 = Course1.doIt(Team);
        System.out.println(result1);

        // очень хотел написать метод, который выводил бы финальную информацию о тех счастливчиках которые выжили в гонке на выживание, но как не бился не смог,
        // где это нужно было писать в Классе Course1 или в Main классе?
    }
}
