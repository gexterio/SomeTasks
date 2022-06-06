package com.gexterio.SomeTasks.Stepic.Snail;

import java.util.Scanner;

//        Snail
//        Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down.
//        In which day the snail will reach the top of the pole?
//        Input data format
//        On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
public class Main {
    static int a;
    static int b;
    static int h;
    static int stepCount;

    public static void main(String[] args) {
        inputIntegers();
        creeping();
        System.out.println(stepCount);
    }

    private static void creeping() {
        int actualHeight = 0;
        do {
            actualHeight += a;
            if (actualHeight >= h) {
                stepCount++;
                return;
            }
            actualHeight -= b;
            stepCount++;
        }
        while (true);
    }

    private static void inputIntegers() {
        Scanner input = new Scanner(System.in);

        boolean positive = false;
        System.out.println("Enter height of pole, feets up, feets down");
        do {
            h = input.nextInt();
            a = input.nextInt();
            b = input.nextInt();
            if ((a < 100) && (b > 0) && (h > 0) && (h < 100) && (h > b) && (a > b)) {
                positive = true;
            }
        } while (!positive);
        System.out.println(h + " " + a + " " + b);
    }
}
