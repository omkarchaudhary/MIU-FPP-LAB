package com.miu;

import java.util.*;

public class MyArrayList {
    int[] arr = new int[2];
    int size = 0;

    //add
    public void add(int item) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = item;
        size++;
    }

    //size
    public int size() {
        return size;
    }

    //find
    public boolean find(int item) {
        if(item < 0) return false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    //remove- if deleted return true else false
    public boolean remove(int index) {
        boolean isFound = find(arr[index]);
        if (!isFound) {
            return false;
        }else {
            int[] temp = new int[arr.length-1];
            for(int i  = 0; i< temp.length;i++){
                if(i != index){
                    temp[i] = arr[i];
                }
            }
            arr = temp;
            size--;
        }

        return true;
    }

    //resize
    public void resize() {
        int[] temp = new int[2 * arr.length];
        System.out.println("Resizing an array...");
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += arr[i] + ",";
        }
        return output;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.find(4));
        System.out.println(myArrayList.remove(2));
        System.out.println(myArrayList.toString());
    }
}
