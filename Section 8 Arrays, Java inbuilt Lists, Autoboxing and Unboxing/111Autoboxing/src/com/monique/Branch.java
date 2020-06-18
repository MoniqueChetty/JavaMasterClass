package com.monique;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialAmount));
                    return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer!=null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        System.out.println("Customer does not exist" + customerName + " was not added.");
        return false;
    }
    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++) {
            Customer exists = this.customers.get(i);
            if (exists.getCustomerName().equals(customerName)) {
                return exists;
            }
        }
        return null;
    }


}
