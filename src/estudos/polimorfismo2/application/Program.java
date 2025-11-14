package estudos.polimorfismo2.application;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estudos.polimorfismo2.entities.Product;
import estudos.polimorfismo2.entities.ImportedProduct;
import estudos.polimorfismo2.entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int prodNum = sc.nextInt();
        Product product;
        List<String> priceTag = new ArrayList<>();

        for (int i = 1; i <= prodNum; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c, u, i)? ");
            char productType = sc.next().charAt(0);

            switch (productType){
                case 'c':
                    sc.nextLine();
                    System.out.print("Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Price: ");
                    double cprice = sc.nextDouble();
                    sc.nextLine();
                    product = new Product(cname, cprice);
                    priceTag.add(product.priceTag(cname, cprice));
                    break;
                case'u':
                    System.out.print("Name: ");
                    sc.nextLine();
                    String uname = sc.nextLine();
                    System.out.print("Price: ");
                    double uprice = sc.nextDouble();
                    System.out.print("Manufactured date(DD/MM/YYYY): ");
                    String manufacturedDate = sc.next();
                    sc.nextLine();
                    LocalDate date = LocalDate.parse(manufacturedDate, dtf);
                    product = new UsedProduct(uname, uprice, date);
                    priceTag.add(product.priceTag(uname, uprice));
                    break;
                case 'i':
                    System.out.print("Name: ");
                    sc.nextLine();
                    String iname = sc.nextLine();
                    System.out.print("Price: ");
                    double iprice = sc.nextDouble();
                    System.out.print("Customs fee: ");
                    double fee = sc.nextDouble();
                    product = new ImportedProduct(iname, iprice, fee);
                    priceTag.add(product.priceTag(iname, iprice));
                    sc.nextLine();
                    break;
            }
        }

        System.out.println("PRICE TAG: ");
        for (String s : priceTag) {
            System.out.println(s);
        }


        sc.close();
    }
}
