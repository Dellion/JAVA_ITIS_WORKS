package com.company;

public class Main {
    public static void main(String[] args){

        char[] arr1 = {'h', 'e', 'l', 'h', 'e', 'l'};
        char[] arr2 = {'h', 'e', 'l'};

        System.out.println("Answer: " + getSubStringIndex(arr1, arr2));
    }

    public static int getSubStringIndex(char[] str1, char[] str2){
        if (str1 != null && str2 != null && str1.length >= str2.length){
            for(int i = 0; i < str1.length; i++){
                if (str1[i] == str2[0]){
                    boolean isSubString = true;

                    for(int j = 1; j < str2.length; j++){
                        if ((i + j) < str1.length && str1[i + j] == str2[j])
                            continue;
                        isSubString = false;
                    }

                    if (isSubString)
                        return i;
                }
            }
        }

        return -1;
    }
}

