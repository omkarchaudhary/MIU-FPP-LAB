package com.miu.lab3.prog3;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStringList {

    private static final int initialCapacity = 2;
    private int arrayCapacity = initialCapacity;
    private String[] strArray;
    private int size;

    MyStringList(){
        size =0;
        strArray = new String[initialCapacity];
    }
    public void add(String s){
        if(size>=arrayCapacity){
            resize();
        }
        strArray[size] = s; //{"Bob",'Steve',null.null}
        size++;//2

    }
    public String get(int i){
        return strArray[i];
    }
    public boolean find(String s){
        boolean isFind = false;
        for(int i = 0;i<size;i++){
            if(strArray[i].equals(s)){
                isFind = true;
                break;
            }
        }
        return isFind;
       //return Arrays.asList(strArray).contains(s);
    }
    public boolean remove(String s){
        boolean isFind = find(s);
        int arrLength = isFind? strArray.length-1: strArray.length;
        //if string find then only execute to remove
       if(isFind){
           String[] newArray = new String[arrLength];
           for(int i = 0, k = 0;i<size;i++){
               if(strArray[i].equals(s)){
                   continue;
               }
               newArray[k++] = strArray[i];
           }

           strArray = newArray;
           size--;
       }
        return isFind;

    }
    public  String  toString(){
        String[] str = new String[size];
        for(int i = 0; i<size;i++){
            str[i] = strArray[i];
        }
        return  Arrays.toString(str);
    }
    public int size(){
        return size;
    }
    private void resize(){
        arrayCapacity = 2 * arrayCapacity;
        String[] resizeArray = new String[arrayCapacity];
        System.arraycopy(strArray,0,resizeArray,0,size);
        strArray = resizeArray;
        System.out.println("Resizing...");

    }

}
