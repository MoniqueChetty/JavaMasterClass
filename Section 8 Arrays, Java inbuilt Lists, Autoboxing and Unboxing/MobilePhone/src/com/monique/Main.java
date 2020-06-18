package com.monique;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("025 525 5555");
    //private static Contacts contactList = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        int menu = 0;
        printMenu();
        while (!quit) {
            System.out.print("Select Menu Option:(0 to display Menu) ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    System.out.println(" Shutting Down......");
                    quit = true;
                    break;

            }
        }
    }

    
    public static void startPhone(){
        System.out.println("Starting Phone.....");
    }

    private static void addContact(){
        System.out.print("New Contact Name: ");
        String name = scanner.nextLine();
        System.out.print("New Contact Number: ");
        String number = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,number);
        if (mobilePhone.addContactName(newContact)){
            System.out.println(" New Contact added : " + name + " : "+ number);
        }else
            System.out.println(" Name Already of file...");
    }

    public static void modifyContact(){
        System.out.print("Name to change: ");
        String change = scanner.nextLine();
        Contacts exists = mobilePhone.queryContact(change);
        if (exists==null){
            System.out.println("Contact does not exist...");
            return;
        }else{
            System.out.print("New Name:  ");
            String newName = scanner.nextLine();
            System.out.print("New Number:  ");
            String newNumber = scanner.nextLine();
            Contacts newContact = Contacts.createContact(newName,newNumber);
            if(mobilePhone.updateContact(exists,newContact)){
                System.out.println("Contact Updated " + newName + " : " + newNumber);
            }else
                System.out.println("Error updating record...");
        }
    }

    public static void removeContact(){
        System.out.print("Name to remove: ");
        String remove = scanner.nextLine();
        Contacts exists = mobilePhone.queryContact(remove);
        if (exists==null){
            System.out.println("Contact does not exist...");
            return;
        }else{
            if(mobilePhone.remove(exists)){
            System.out.println("Contact removed ");
            }else
                System.out.println("Error removing record...");
        }
    }

    public static void searchContact(){
        System.out.print("Name to Search: ");
        String find = scanner.nextLine();
        Contacts exists = mobilePhone.queryContact(find);
        if (exists==null){
            System.out.println("Contact does not exist...");
            return;
        }else{
            System.out.println(exists.getName()+ " : " + exists.getPhoneNumber());
        }

    }

}
