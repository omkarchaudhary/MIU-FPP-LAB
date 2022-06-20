package com.miu.lab7;


public class Excercise1 {
    int i = 2;
    static int z = 5;
    public static void main(String[] args) {
        int number = 10;
        int result = fibonacciWithRecursion(number);
        int result2 = fibonacciWithLoop(number);
        System.out.println("The "+number+"th fibonacciNumbers is "+ result);
        System.out.println("The "+number+"th fibonacciNumbers with loop is "+ result2);
        Excercise1 ex = new Ex();
        int n = ex.getValue();
        int  m = ex.i;
        System.out.println(n +" variable value "+ m);
    }
     int getValue(){
        return 1;
    }
    // not-static instance/method cannot be accessed inside the static method-
    // static variable cannot be declared inside the method.
    // static variable can be accessed by instance method.
    // because static references the class not a specific instance of the class so there is no instance variable to access
     static int fibonacciWithRecursion(int n){

         if(n == 0 || n ==1)
             return n;
         return fibonacciWithRecursion(n-1)+fibonacciWithRecursion(n-2);
     }

     static int fibwithArray(int n){
        int[] store = new int[n+1];
        store[0] = 0;
        store[1] = 0;
        for(int i =2;i<=n;i++){
            store[i] = store[i-1]+store[i-2];
        }
        return store[n];
     }
     static int fibonacciWithLoop(int n){
        //a = 0,b= 1,1,2,3,5,8
        int a =0,b =1;
        if(n ==1 || n == 0) return n;
        int result = a+b;
        for(int i =2;i<n;i++){
            a = b;
            b = result;
            result = a+b;
        }
        return  result;
     }
}
class Ex extends  Excercise1{
    int i = 4;
    int getValue(){
        return i;
    }
}

