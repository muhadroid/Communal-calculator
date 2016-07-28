package Calculators;

public class WaterCalculator extends Calculator {
    @Override
    public double calculate(int i) {
        return (double) i*cost;
    }

}
