package entities;

public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        return (this.getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.50);

    }

}
