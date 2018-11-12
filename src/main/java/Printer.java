public class Printer {
    private int paperLeft;
    private int tonerVolume;



    public Printer(int initialPaper, int initialToner){
        this.paperLeft = initialPaper;
        this.tonerVolume = initialToner;
    }

    public int hasPaper(){
        return this.paperLeft;
    }

    public int hasToner(){
        return this.tonerVolume;
    }

    public void print(int pages, int copies){
        if (this.paperLeft >= (pages * copies) && this.tonerVolume >= (pages * copies)){
            this.tonerVolume -= (pages * copies);
            this.paperLeft -= (pages * copies);
        }
    }

    public void refill(int newPaper){
        this.paperLeft += newPaper;
    }


}




//public class Printer {
//
//    private int paperSheetsLeft;
//    private int pages;
//    private int copies;
//
//    public Printer(int paperSheetsLeft, int pages, int copies) {
//        this.paperSheetsLeft = paperSheetsLeft;
//        this.pages = pages;
//        this.copies = copies;
//    }
//
//
//
//    public boolean canPrint() {
//        return this.paperSheetsLeft >= paperSheetsLeft - (pages * copies);
//    }
//
//    public boolean cannotPrint() {
//        return this.paperSheetsLeft <= paperSheetsLeft - (pages * copies);
//    }
//
//    public int fillPrinter() {
//        return this.paperSheetsLeft += 20;
//    }
//}



//Printer
//        Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.