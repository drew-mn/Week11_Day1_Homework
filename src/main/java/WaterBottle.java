public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int takeDrink() {
        return this.volume -= 10;
    }

    public int emptyBottle() {
        return this.volume -= 100;
    }

    public int fillBottle() {
        return this.volume += 100;
    }


}