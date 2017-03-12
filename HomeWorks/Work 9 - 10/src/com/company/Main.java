package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] a = {123, 12, 23, 54, 5};


        System.out.println(Arrays.toString(reverseArr(a)));
        doSomething(12, 12, null, '2');

        int[][] dArr = new int[3][2];
        dArr[0][0] = 1;
        dArr[0][1] = 2;
        dArr[1][0] = 12;
        dArr[1][1] = 32;
        dArr[2][0] = 123;
        dArr[2][1] = 0;

        dArr = (reverse2dArr(dArr));

        for (int[] arr : dArr) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[] reverseArr(int[] methodArr){
        int lastIndex = methodArr.length - 1; // последний element

        int[] b = new int[methodArr.length];

        for(int i = 0; i < methodArr.length; i++){
            int currentIndex = lastIndex - i;  //текущий индекс

            b[i] = methodArr[currentIndex];
        }

        return b;
    }

    public static int[][] reverse2dArr(int[][] arr2d){
        int[][] b = new int[arr2d.length][];

        for (int i = 0; i < arr2d.length; i++) {
            b[i] = reverseArr(arr2d[i]);
        }

        return b;
    }

    public static void doSomething(int a, int v, int[]c, char r){

    }
}
