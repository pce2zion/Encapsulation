package org.example;

public class Printer {
    private Integer tonerLevel;
    private  Integer noOfPages = 0;
    private boolean isDuplex ;



    public Printer(Integer tonerLevel, Integer noOfPages, boolean isDuplex) {

        if(tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.noOfPages = noOfPages;
        this.isDuplex = isDuplex;
    }

    public String fillTonerUp(int numToFill){
        if(numToFill > 0 && numToFill < 100){
            if(this.tonerLevel + numToFill < 100){
                this.tonerLevel += numToFill;
                return "filled toner up to " + tonerLevel;
            }else{
                return "toner is filled up";
            }
        }else{
            return "warning, check cartridge";
        }

    }

    public String printPage(int noToPrint){
        if(isDuplex ){
           this.noOfPages = (noToPrint + this.noOfPages) +( noToPrint % 2);
            return "printing in duplex... printed " + this.noOfPages;


        }else{
           return "Printing without duplex....printed " + this.noOfPages;
        }



//               if(isDuplex){
//                 this.noOfPages = (noToPrint / 2) + (noToPrint % 2);
//                   return "printed " + noOfPages + " no of pages";
//               }else{
//                   this.noOfPages = noToPrint;
//                   return "printed " + noOfPages + " no of pages";
//               }

    }
}
