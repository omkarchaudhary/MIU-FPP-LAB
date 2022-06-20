package com.miu.lab2;

import java.lang.reflect.Constructor;

public class Prog1 {
    public static void main(String[] args) {
        //Address instance
        Address add1A = new Address("10 Adams", "Chicago", "IA", "52556");
        Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
        Address add2A = new Address("322 Harrison", "Minnesota", "IA", "52556");
        Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");
        //Customer Instance
        Customer customer1 = new Customer("John", "Stefer", "123-456-1245");
        Customer customer2 = new Customer("Henry", "Jobs", "123-456-1245");
        customer1.setBillingAddress(add1A);
        customer1.setShippingAddress(add1B);
        customer2.setBillingAddress(add2A);
        customer2.setShippingAddress(add2B);
        //Array of Customer Instance;
        Customer[] customers = new Customer[2];
        customers[0] = customer1;
        customers[1] = customer2;

        //Searching customer whose address in chicago;
        for (int i = 0; i < customers.length; i++) {
            String billingCity = customers[i].getBillingAddress().getCity();
            if (billingCity.equals(Customer.CITY)){
                System.out.println(customers[i].toString());
            }
        }
    }
}

class Customer {
    static final String CITY = "Chicago";
    String firstName;
    String lastName;
    String socSecurityNum;
    Address billingAddress;
    Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return firstName + ", " + lastName + ", ssn: " + socSecurityNum;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String str, String cit, String st, String z) {
        street = str;
        city = cit;
        state = st;
        zip = z;
    }

    /**
     * Provides a string representation of an address.
     */
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

//    public static void main(String[] args) {
//        Address a = new Address("111 Washington Ave",
//                "Fairfield", "IA", "52556");
//        //Prints address to the console
//        System.out.println(a.toString());
//    }
}
