package org.example;

import java.util.Scanner;

import static java.lang.Math.atan2;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();

        scan.close();

        double result = atan2(b, a);
        if (result < 0) result += 2 * Math.PI;

        String s;
        if (a == 0 && b == 0) {
            s = "0.000000";
        } else {
            s = String.format("%.6f", result);
        }
        System.out.println(s);

    }
}
