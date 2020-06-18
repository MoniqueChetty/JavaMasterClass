package com.monique;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contacts>();;
    }

    public boolean addContactName(Contacts contact){
        if(contactExist(contact.getName())>=0){
            System.out.println("Contact Already exists");
            return false;
        }else{
            contactList.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int position = contactExist(oldContact);
        if(position<0){
            System.out.println("Contact does not exist");
            return false;
        }else if (contactExist(newContact.getName())!=-1){
            System.out.println("Contact with name " + newContact.getName()+ " already exists");
            return false;
        }
            this.contactList.set(position, newContact);
            //System.out.println("Contact has been changed: " + newContact.getName() + " "+ newContact.getPhoneNumber());
            return true;

    }
    public boolean  remove(Contacts contact){
        int position = contactExist(contact);
        if(position<0){
            System.out.println("Contact does not exist");
            return false;
        }else {
            this.contactList.remove(position);
            System.out.println("Name Removed: " + contact.getName());
            return true;
        }
    }

    private int contactExist (Contacts contact){
        return contactList.indexOf(contact);
    }
    private int contactExist (String contactName){
        for (int i = 0; i <this.contactList.size() ; i++) {
            Contacts contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contacts contact){
        if(contactExist(contact)>=0){
            return contact.getName();
        }else
            return null;
    }

    public Contacts queryContact(String name){
        int position = contactExist(name);
        if(position >=0){
            return this.contactList.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Number of Contacts: " + contactList.size());
        for (int i = 0; i < contactList.size() ; i++) {
            System.out.println((i+1)+ " " + this.contactList.get(i).getName() + "   :   "+ this.contactList.get(i).getPhoneNumber());
        }
    }
}
