package Calculators;

public class WaterCalculator extends Calculator {
    private double cost;
    @Override
    public double calculate(int i) {
        return (double) i*cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
