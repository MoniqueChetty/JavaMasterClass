package com.monique;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }



    public boolean addBranch (String branchName) {
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            return branch.newCustomer(customerName, initialAmount);
        }
        System.out.println("Branch does not exist : " + branchName + " > " + customerName + " > " + initialAmount+" was not added.");
        return false;
    }

    public boolean addCustomerTransactions(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            return branch.addCustomerTransaction(customerName, initialAmount);
        }
        System.out.println("Customer does not exist " + customerName + " was not added.");
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i <this.branches.size() ; i++) {
            Branch exists = this.branches.get(i);
            if (exists.getBranchName().equals(branchName)){
                return exists;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch !=null){
            System.out.println("Customers for : " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i <branchCustomers.size() ; i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + "[" + (i+1) + "]");
                if (showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double>transactions = branchCustomer.getTransactions();
                    double total =0;
                    for (int j = 0; j <transactions.size() ; j++) {
                        System.out.println("    [" + (j+1) + "] Amount: " + transactions.get(j));
                        total += transactions.get(j);
                    }
                    System.out.println("Total: " + total);
                }

            }
            return true;
        }
        System.out.println("Branch does not exist");
        return false;

    }

}


