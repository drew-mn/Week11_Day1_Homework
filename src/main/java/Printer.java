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
