package estudos.classesabstratas.ex01.application;

import estudos.classesabstratas.ex01.entities.Circle;
import estudos.classesabstratas.ex01.entities.Rectangle;
import estudos.classesabstratas.ex01.entities.Shape;
import estudos.classesabstratas.ex01.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK, BLUE or RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.println("Width:");
                double width = sc.nextDouble();
                System.out.println("Height:");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else if (ch == 'c'){
                System.out.println("Radius:");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas:");

        for (Shape shape : shapeList){
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
