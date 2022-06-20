package com.miu;


import java.util.HashMap;

public class HashClass {
    HashMap<Key,Record> map = new HashMap<>();
    Key defaultKey = new Key("secret");
    public HashClass(){
        map.put(defaultKey,new Record("001","data"));
    }

    public static void main(String[] args) {
        HashClass h = new HashClass();
        Key k = new Key("secret");
        System.out.println(k.equals(h.defaultKey));
        Record recFound = h.map.get(k);
        System.out.println(recFound);
    }
}

class Key{
    private  String key;
    public Key(String key){
        this.key = key;
    }

    @Override
    public  boolean equals(Object obj) {
        Exception ex = new Exception("Legal");
        if(obj == null ) return false;
        if(!(obj instanceof Key)) return  false;
        Key k = (Key)obj;
        return key.equals(k.key);

    }
}

class Record{
    private String recordId;
    private  String data;
     public Record(String id, String data){
         this.recordId= id;
         this.data = data;
     }

    public String getRecordId() {
        return recordId;
    }

    public String getData() {
        return data;
    }

    @Override
    public  String toString(){
         return  recordId+ " : "+data;
    }
}