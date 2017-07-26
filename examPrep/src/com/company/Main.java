package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialSpeed = Integer.parseInt(scanner.nextLine());
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());
        double time1hours = time1/60.0;
        double time2hours = time2/60.0;
        double secondSpeed = initialSpeed * 1.1;
        double time3hours = time3/60.0;
        double thirdSpeed = secondSpeed * 0.95;
        double initialDistanse = initialSpeed*time1hours;
        double distanceAfterIncrease = secondSpeed * time2hours;
        double distanceAfterDecrease = thirdSpeed * time3hours;
        double result = initialDistanse + distanceAfterDecrease+ distanceAfterIncrease;
        System.out.printf("%.2f", result);
    }
}
/*
90
60
        70
        80*/
