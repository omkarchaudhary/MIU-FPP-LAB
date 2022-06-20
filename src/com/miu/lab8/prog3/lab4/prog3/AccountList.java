package com.miu.lab8.prog3.lab4.prog3;

import java.util.Arrays;

public class AccountList {
    private static final int initialCapacity = 3;
    private int arrayCapacity = initialCapacity;
    private Account[] accounts;
    private int size;

    AccountList(){
        size =0;
        accounts = new Account[initialCapacity];
    }
    public void add(Account account){
        if(size>=arrayCapacity){
            resize();
        }
        accounts[size] = account;
        size++;

    }
    public Account get(int i){
        return accounts[i];
    }
    public boolean find(Account account){
        boolean isFind = false;
        for(int i = 0;i<size;i++){
            if(accounts[i].equals(account)){
                isFind = true;
                break;
            }
        }
        return isFind;
        //return Arrays.asList(strArray).contains(s);
    }
    public boolean remove(Account account){
        boolean isFind = find(account);
        int arrLength = isFind? accounts.length-1: accounts.length;
        //if string find then only execute to remove
        if(isFind){
            Account[] newArray = new Account[arrLength];
            for(int i = 0, k = 0;i<size;i++){
                if(accounts[i].equals(account)){
                    continue;
                }
                newArray[k++] = accounts[i];
            }

            accounts = newArray;
            size--;
        }
        return isFind;

    }
    public  String  toString(){
        Account[] str = new Account[size];
        for(int i = 0; i<size;i++){
            str[i] = accounts[i];
        }
        return  Arrays.toString(str);
    }
    public int size(){
        return size;
    }
    private void resize(){
        arrayCapacity = 2 * arrayCapacity;
        Account[] resizeArray = new Account[arrayCapacity];
        System.arraycopy(accounts,0,resizeArray,0,size);
        accounts = resizeArray;
        System.out.println("Resizing...");

    }

    public Account[] getAccount() {
        return accounts;
    }
}
