package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int sum = 0;
        int pr = 1;

        a = scanner.nextInt();

        while (a != 999) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
            else { pr = pr * a;}
            a = scanner.nextInt();
        }

        System.out.println("Sum:" + sum);
        System.out.println("Pr:" + pr);

    }
}
