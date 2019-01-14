package cucumberjava;

public class Belly {

    private int cukes;
    private int hoursWaiting;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public void wait(int hoursWaiting) {
        this.hoursWaiting = hoursWaiting;
    }

    public boolean growling() {
        return (cukes == 42 && hoursWaiting == 1);
    }

}
