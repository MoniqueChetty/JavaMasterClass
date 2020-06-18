package com.monique;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Press : ");
        System.out.println("\t0-To print choice options.");
        System.out.println("\t1-To print List of Grocery Items.");
        System.out.println("\t2-To Add Item to list.");
        System.out.println("\t3-To Modify an item in list.");
        System.out.println("\t4-To Remove an item from the list.");
        System.out.println("\t5-To Search for an item in the list.");
        System.out.println("\t6-To Quite the application.");
    }
    public static void addItem(){
        System.out.print("Please enter grocery item ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Please enter current item Name");
        String itemName = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter replacement item name ");
        String replace = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, replace);
    }
    public static void removeItem(){
        System.out.print("Enter item name to be remove ");
        String remove = scanner.nextLine();
        //scanner.nextLine();
        groceryList.removeGroceryItem(remove);
    }
    public static void searchForItem(){
        System.out.print("Item to Search for ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in grocery list");
        }else{
            System.out.println("Search item not in List");
        }
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        // copy current ArrayList
        newArray.addAll(groceryList.getGroceryList());
        // copy current ArrayList option 2
        ArrayList<String> nextArray = new ArrayList <String>(groceryList.getGroceryList());
        // convert back to regular array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }



}
