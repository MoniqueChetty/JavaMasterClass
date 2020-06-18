package com.monique;

public class Printer {
    private int toner;
    private int numPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int toner, boolean duplexPrinter) {
        if (toner >=1 && toner <=100){
            this.toner = toner;
        }else{
            this.toner = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.numPagesPrinted = 0;
    }

    public int fillToner(int tonerAmount){
        if (tonerAmount >0 && tonerAmount <=100){
            if (this.toner + tonerAmount > 100){
                System.out.println("Current Toner: " + toner + " Added "+ tonerAmount +" "+((toner + tonerAmount)-100)+ "% too much toner added");
                return - 1;
            }
            this.toner += tonerAmount;
            return toner;
        }else{
            return -1;
        }

    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter ) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex");
        }
        numPagesPrinted += pagesToPrint;
        System.out.println(" Number of pages printed: " + numPagesPrinted);
        return numPagesPrinted;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }

    public int getToner() {
        System.out.println(" Toner level : " + toner);
        return toner;
    }
}
