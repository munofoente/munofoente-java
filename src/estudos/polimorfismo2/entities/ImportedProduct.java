package estudos.polimorfismo2.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(double price, double customsFee){
        return price + customsFee;
    }

    @Override
    public String priceTag(String name, double price){
        return super.priceTag(name, totalPrice(price,customsFee)) + "(Customs fee: $ " + customsFee + " )";
    }
}
