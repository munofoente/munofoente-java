package estudos.composição.application;

import estudos.composição.entities.Client;
import estudos.composição.entities.Order;
import estudos.composição.entities.OrderItem;
import estudos.composição.entities.Product;
import estudos.composição.enums.OrderStatus;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date(DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());

        Client client = new Client(name, email, date);

        System.out.println();

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String str = sc.next();
        OrderStatus status = OrderStatus.valueOf(str);
        Date moment = new Date();

        System.out.println();

        System.out.print("How many items in this order?: ");
        int orderItems = sc.nextInt();
        Order order = new Order(client, moment, status);
        for (int i = 1; i <= orderItems; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String prod_name = sc.next();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            OrderItem item = new OrderItem(new Product(prod_name, price),quantity, price);
            order.addItem(item);
        }

        System.out.println();

        System.out.println("Order Summary: " + order);

        sc.close();
    }
}
