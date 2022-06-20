package com.miu.lab2;

public class Prog8 {
    public static void main(String[] args) {
        int result;
        int[] arrayOfInteger = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        result = min(arrayOfInteger);
        System.out.println("The minimum of an Array is "+ result);
    }

    public static int min(int[] arryOfInts){
        int min = 0;
        for(int i = 0;i < arryOfInts.length; i++){
            if(arryOfInts[i] < min) {
                min = arryOfInts[i];
            }
        }
        return min;
    }
}
