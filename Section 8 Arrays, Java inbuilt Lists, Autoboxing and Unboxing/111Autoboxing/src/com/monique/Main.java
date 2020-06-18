package com.monique;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		Bank bank = new Bank("National SA Bank");
		bank.addBranch("Jhb");
		bank.addBranch("CT");
		bank.addBranch("KZN");
		bank.addBranch("MP");

		bank.addCustomer("Jhb", "Tom", 500.01);
		bank.addCustomer("CT", "Maison", 1000.01);
		bank.addCustomer("Jhb", "Jesse", 100.01);
		bank.addCustomer("Jhb", "Keeno", 500.01);
		bank.addCustomerTransactions("CT","Maison", 200.50);
		bank.addCustomerTransactions("CT","Maison", 200.50);
		bank.addCustomerTransactions("CT","Maison", -200.50);
		bank.addCustomerTransactions("CT","Maison", 200.50);
		bank.addCustomerTransactions("Jhb","Maison", -50.50);
		bank.addCustomerTransactions("Jhb","Keeno", 500.50);
		bank.addCustomerTransactions("Jhb","Keeno", 200.50);
		bank.addCustomerTransactions("Jhb","Keeno", -200.50);
		bank.addCustomerTransactions("Jhb","Keeno", 200.50);
		bank.addCustomerTransactions("Jhb","Keeno", -50.50);
		bank.addCustomerTransactions("Jhb","Jesse", 5000.50);
		bank.addCustomerTransactions("Jhb","Jesse", 200.50);
		bank.addCustomerTransactions("Jhb","Jesse", -200.50);
		bank.addCustomerTransactions("Jhb","Jesse", 200.50);
		bank.addCustomerTransactions("Jhb","Jesse", -50.50);

		bank.listCustomers("Jhb", true);

		//Test
//		if(!bank.addCustomer("Max", "Tim", 200.00)){
//			System.out.println("Error Max does not exist");
//		}

		bank.addCustomer("Jab", "Tom", 500.01);
    }

}
