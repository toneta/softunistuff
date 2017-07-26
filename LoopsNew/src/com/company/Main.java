package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        int j;
        int currentNumber;
        for(j = 0; j < n; ++j) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            leftSum += currentNumber;
        }

        for(j = 0; j < n; ++j) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            rightSum += currentNumber;
        }

        if(leftSum == rightSum) {
            System.out.println("Yes, sum = " + rightSum);
        } else {
            System.out.println("No, diff = " + Math.abs(rightSum - leftSum));
        }

    }
}
