package com.company;

public class Main {
    public static void main(String[] args) {
        int array[] = {3, 11, -100, 21, -30, 64};
        System.out.println("Максимальный элемент в массиве = " + max(array));
    }

    public static int max(int array[]) {
        int a = array[0];
        for(int i = 0; i < array.length; i++) {
            if(a < array[i]) {
                a = array[i];
            }
        }
        return a;
    }
}