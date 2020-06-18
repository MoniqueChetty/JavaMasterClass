package com.monique;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    //private String accountNumber;
    //private double balance;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }


    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
