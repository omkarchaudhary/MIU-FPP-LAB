package com.miu.lab3.prog5;

public class StoreDirectory {
    Bookstore bookstore;
    Market market;
    Bookstore.CDStore cdStore;
    public StoreDirectory(String custId){
        bookstore = new Bookstore(custId);
        market = new Market();
        cdStore = new Bookstore.CDStore();
    }



    //books
    public int getNumberOfBooks() {
        return bookstore.getNumBooks();
    }

    public int getNumberOfBookstoreEmployees() {
        return bookstore.getNumEmployees();
    }

    public boolean addNewEmployee(String employeeId){
        return bookstore.addNewEmployee(employeeId);
    }

    public boolean bookIsInStock(String bookId){
        return bookstore.bookIsInStock(bookId);
    }
    public int getNumCDsInBookstore(){
        //implement
        return cdStore.getNumCDs();
    }

    public boolean addNewCD(int cdId){
        //re-implement
        return cdStore.addNewCD(cdId);
    }
    public boolean addNewBook(String bookId){
        //re-implement
        return bookstore.addNewBook(bookId);
    }


    //market
    public boolean marketCarriesFoodItem(String foodItem){
        //re-implement
        return market.carriesFoodItem(foodItem);
    }

}
