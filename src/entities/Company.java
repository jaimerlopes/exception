package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployers;

    public Company(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    public Company(String name, double anualIncome, Integer numberOfEmployers) {
        super(name, anualIncome);
        this.numberOfEmployers = numberOfEmployers;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    @Override
    public double tax() {
        double taxValue = 0;
        if (getNumberOfEmployers() > 10) {

            taxValue = this.getAnualIncome() * 0.14;
        } else {

            taxValue = this.getAnualIncome() * 0.16;
        }
        return taxValue;

    }

}
