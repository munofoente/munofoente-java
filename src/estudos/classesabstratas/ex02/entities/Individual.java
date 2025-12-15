package estudos.classesabstratas.ex02.entities;

public class Individual extends TaxPayer{

    private Double healthCare;

    public Individual(){

    }

    public Individual(String name, Double income, Double healthCare) {
        super(name, income);
        this.healthCare = healthCare;
    }

    @Override
    public Double taxes() {
        double tax;
        if (getIncome() < 20000){
            tax = getIncome() * 0.15;
        } else {
            tax = getIncome() * 0.25;
        }

        if (healthCare !=0){
            tax = tax - (healthCare * 0.5);
            return tax;
        } else return tax;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
