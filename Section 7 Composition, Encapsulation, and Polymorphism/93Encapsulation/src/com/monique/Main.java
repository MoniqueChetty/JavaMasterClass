package com.monique;


public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,true);
        System.out.println(" Initial page count: " + printer.getNumPagesPrinted());
        printer.fillToner(20);
        int pagesPrinted = printer.printPages(10);
        System.out.println(" Total Pages Printed: "+ printer.getNumPagesPrinted());
        //System.out.println("Toner Level: " + printer.getToner());
        printer.fillToner(100);
        printer.printPages(51);


    }
}
