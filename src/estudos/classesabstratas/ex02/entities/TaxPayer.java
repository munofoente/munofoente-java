package estudos.classesabstratas.ex02.entities;

public abstract class TaxPayer {

    private String name;
    private Double income;

    public TaxPayer(){

    }

    public TaxPayer(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public abstract Double taxes();

    @Override
    public String toString() {
        return getName() + ": $ " + String.format("%.2f", taxes()) ;
    }
}
