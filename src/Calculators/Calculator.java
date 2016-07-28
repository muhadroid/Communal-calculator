package Calculators;

public abstract class Calculator {
    protected double cost;
    public abstract double calculate(int i);

    public void setCost(double cost) {
        this.cost = cost;
    }
}
