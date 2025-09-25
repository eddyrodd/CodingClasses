package Week5;

public class simpleCar {
    private int milesForward;
    private int milesReverse;

    public simpleCar() {
        this.milesForward = 0;
        this.milesReverse = 0;
    }

    public simpleCar(int milesForward, int milesReverse) {
        this.milesForward = milesForward;
        this.milesReverse = milesReverse;
    }

    public int getMilesForward() {
        return milesForward;
    }

    public void setMilesForward(int milesForward) {
        this.milesForward = milesForward;
    }

    public int getMilesReverse() {
        return milesReverse;
    }

    public void setMilesReverse(int milesReverse) {
        this.milesReverse = milesReverse;
    }

    public String honkHorn() {
        return "Beep beep!";
    }

    public String getStatus() {
        return "Car drove " + milesForward + " miles forward and " + milesReverse + " miles in reverse.";
    }

    @Override
    public String toString() {
        return getStatus() + " " + honkHorn();
    }
}
