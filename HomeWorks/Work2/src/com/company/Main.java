package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b = 0;

        a = scanner.nextInt();

        while (a != -999) {
            if (a % 10 == 6) {
                b = b + 1;
            }
            a = scanner.nextInt();
        }

        System.out.println("Kilichestvo chisel na 6:" + b);
    }
}
