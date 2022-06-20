package com.miu.lab5.prog1;

public class Prog1 {
    public static void main(String[] args) {
        // Calling to access the instance from multiple clients.
        MySingleton object1 = MySingleton.getInstance();
        MySingleton object2 = MySingleton.getInstance();
        MySingleton object3 = MySingleton.getInstance();
        System.out.println("Hashcode of obj1 is "+ object1.hashCode());
        System.out.println("Hashcode of obj2 is "+ object2.hashCode());
        System.out.println("Hashcode of obj2 is "+ object3.hashCode());
        //The output shows instance from multiple clients return the same reference. So we can ensure that the single instance is created.
        // Output
//        Hashcode of obj1 is 1480010240
//        Hashcode of obj2 is 1480010240
//        Hashcode of obj2 is 1480010240
    }
}
