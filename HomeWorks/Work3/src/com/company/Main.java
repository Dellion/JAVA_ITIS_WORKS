package com.company;

public class Main {
    public static void main(String[] args) {
        int array[] = {4, 32, -13, 1, -71, 12};
        System.out.println("Минимальный элемент в массиве = " + min(array));
    }

    public static int min(int array[]) {
        int a = array[0];
        for(int i = 0; i < array.length; i++) {
            if(a > array[i]) {
                a = array[i];
            }
        }
        return a;
    }
}