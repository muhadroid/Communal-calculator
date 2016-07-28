package Calculators;

public class ElectrisityCalculator extends Calculator {
    @Override
    public double calculate(int i) {
        if (i<100) return (double)i*0.57;
        else if (i>100&&i<600) return (double)i*0.99;
        else return (double)i*1.56;
    }
}
