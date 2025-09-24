package Week5;

public class simpleCar {

    private int milesDriveForward;
    private int milesDriveReverse;
    private String honkingHorn;
    private String carStatus;

    simpleCar() {
        this.milesDriveForward = 0;
        this.milesDriveReverse = 0;
        this.honkingHorn = "The car honked the horn";
        this.carStatus = " The car is up and running";
    }

    simpleCar(int milesDriveForward, int milesDriveReverse, String honkingHorn, String carStatus) {
        this.milesDriveForward = milesDriveForward;
        this.milesDriveReverse = milesDriveReverse;
        this.honkingHorn = honkingHorn;
        this.carStatus = carStatus;
    }

    public int getMilesDriveForward() {
        return milesDriveForward;
    }

    public int getMilesDriveReverse() {
        return milesDriveReverse;
    }

    public String getHonkingHorn() {
        return honkingHorn;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setMilesDriveForward(int milesDriveForward) {
        this.milesDriveForward = milesDriveForward;
    }

    public void setMilesDriveReverse(int milesDriveReverse) {
        this.milesDriveReverse = milesDriveReverse;
    }

    public void setHonkingHorn(String honkingHorn) {
        this.honkingHorn = honkingHorn;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    @Override
    public String toString() {
        return "My car has driven " + milesDriveForward + " miles forward " + "and " + milesDriveReverse + " miles in reverse " + honkingHorn + carStatus;


    }
}
