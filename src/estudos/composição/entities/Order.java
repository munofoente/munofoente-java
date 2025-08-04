package estudos.composição.entities;

import estudos.composição.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Client client;
    private Date moment;
    private OrderStatus status;
    private final List<OrderItem> items = new ArrayList<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order(){

    }

    public Order(Client client, Date moment, OrderStatus status){
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double Total(){
        double sum = 0;
        for (OrderItem i : items){
            sum += i.SubTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
                sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
                sb.append("Order status: ").append(status).append("\n");
                sb.append("Client: ").append(client.toString()).append("\n");
                sb.append("Order items: \n");
                for (OrderItem item : items){
                    sb.append(item).append("\n");
                }
                sb.append("Total price: $").append(Total());
                return sb.toString();
    }

}
