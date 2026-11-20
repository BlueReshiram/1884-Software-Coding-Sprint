package first.robot;

//Create the class here
public class Bottle {
    private double maxCapacity;
    private double activeCapacity;

    public Bottle(double capacityMl){
        this.maxCapacity = capacityMl;
        this.activeCapacity = capacityMl;
    }

    public double updateAmount(double amountUsed){
        double threshold = 0.25 * this.maxCapacity;
        double amountRemaining = this.activeCapacity - amountUsed;

        if (amountRemaining < threshold){
            this.activeCapacity = this.maxCapacity;
        }
        else{
            this.activeCapacity = amountRemaining;
        }

        return this.activeCapacity;
    }
}