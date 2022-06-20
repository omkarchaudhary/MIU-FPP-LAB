package com.miu.lab5.prog1;

class MySingleton {
    private static  MySingleton singleInstance = null;
    public String s;
    private MySingleton(){
        s ="Singleton class";
    }
    public static MySingleton getInstance(){
        if(singleInstance == null)
            singleInstance = new MySingleton();
        return singleInstance;
    }
}
