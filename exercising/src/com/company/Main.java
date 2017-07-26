package com.company;

import java.util.Scanner;

public class Main {
//kvadrat ot zvezdichki
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.printf("%s\n",repeatStr("*",n));
        for (int i = 0; i < n-2; i++) {

            System.out.printf("*%s*\n", repeatStr(" ", n-2));
        }
        System.out.printf("%s\n",repeatStr("*",n));
    }
    static String repeatStr(String str, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
