package com.miu.lab2;

import java.util.Arrays;

public class Prog6 {
    public static void main(String[] args) {
        String[] str = new String[]{"horse", "dog", "cat", "horse","dog"};
        String[] result = removeDups(str);
        System.out.println(Arrays.toString(result));

    }
    static String[] removeDups(String[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        String[] temp = new String[n];
        int j  = 0;
        for(int i =0; i<n-1;i++){
            if(arr[i]!= arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        String[] result = new String[j];
        for(int i =0 ;i <j;i++){
            result[i] = temp[i];
        }
        return  result;
    }
}
