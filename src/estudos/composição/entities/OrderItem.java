package estudos.composição.entities;

public class OrderItem {

    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItem(){

    }

    public OrderItem(Product product, Integer quantity, Double price){
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double SubTotal(){
        return price * quantity;
    }

    public String toString(){
        return product.getName() + ", $" + price + ", Quantity: " + quantity + ", Subtotal: $" + SubTotal();
    }
}
