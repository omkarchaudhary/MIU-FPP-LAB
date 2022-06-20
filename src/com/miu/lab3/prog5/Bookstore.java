package com.miu.lab3.prog5;

import static com.miu.lab3.prog5.Ids.*;

public class Bookstore {
    private final int NUM_BOOKS = 1000000;
    private final int NUM_EMPLOYEES = 7;
    private static String id;
    private int numBooks = NUM_BOOKS;
    private int numEmployees = NUM_EMPLOYEES;
    private CDStore cdstore = null;

    Bookstore(String id){
        this.id = id;
        cdstore = new CDStore();
    }
    int getNumBooks() {
        if(!isBadId(id)){
            return numBooks;
        }
        else {
            System.out.println("You do not have access to this information.");
            return -1;
        }
    }
    int getNumEmployees(){
        if(isManagerId(id)) {
            return numEmployees;
        }
        else {
            System.out.println("You do not have access to this information.");
            return -1;
        }
    }
    boolean addNewBook(String bookId) {
        if(isManagerId(id) || isGoodId(id)){
            ++numBooks;
            return true;
        }
        else {
            System.out.println("You are not allowed to use this function.");
            return false;
        }
    }

    boolean addNewEmployee(String employeeId){
        if(isManagerId(id)) {
            //do some processing...then
            ++numEmployees;
            return true;
        }
        else {
            System.out.println("You are not allowed to use this function.");
            return false;
        }
    }
    boolean bookIsInStock(String bookId) {
        return checkStock(bookId);

    }
    int getNumCds(){
        return cdstore.getNumCDs();
    }

    boolean addCd(int id){
        return cdstore.addNewCD(id);
    }

    private boolean checkStock(String bookid){
        //not fully implemented
        //return true;
        return checkStock(bookid);
    }
    static class CDStore {
        final static int NUM_CDS = 2000;
        static int numCDs = NUM_CDS;

        int getNumCDs(){
            if(isBadId(id)){
                System.out.println("You do not have access to this information");
                return -1;
            }
            return numCDs;
        }
        boolean addNewCD(int cdId){
            if(isManagerId(id)){
                //do some processing
                ++numCDs;
                return true;
            }
            else {
                System.out.println("You do not have permission to perform this function.");
                return false;

            }
        }
    }
}
