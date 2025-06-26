/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TUGAS2;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU UPCAST & DOWNCAST ===");
            System.out.println("1. Circle sebagai Shape");
            System.out.println("2. Rectangle sebagai Shape");
            System.out.println("3. Square sebagai Shape dan Rectangle");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine(); // Flush newline

            switch (choice) {
                case 1:
                    Shape s1 = new Circle(5.5, "RED", false);
                    System.out.println("Object: " + s1);
                    System.out.println("Area: " + s1.getArea());
                    System.out.println("Perimeter: " + s1.getPerimeter());
                    System.out.println("Color: " + s1.getColor());
                    System.out.println("Filled: " + s1.isFilled());

                    // Downcast to Circle
                    Circle c1 = (Circle) s1;
                    System.out.println("Radius (after downcast): " + c1.getRadius());
                    break;

                case 2:
                    Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
                    System.out.println("Object: " + s3);
                    System.out.println("Area: " + s3.getArea());
                    System.out.println("Perimeter: " + s3.getPerimeter());
                    System.out.println("Color: " + s3.getColor());

                    // Downcast to Rectangle
                    Rectangle r1 = (Rectangle) s3;
                    System.out.println("Length (after downcast): " + r1.getLength());
                    break;

                case 3:
                    Shape s4 = new Square(6.6, "BLUE", true);
                    System.out.println("Object: " + s4);
                    System.out.println("Area: " + ((Square) s4).getArea());
                    System.out.println("Color: " + ((Square) s4).getColor());

                    // Downcast to Rectangle
                    Rectangle r2 = (Rectangle) s4;
                    System.out.println("As Rectangle: " + r2);
                    System.out.println("Area: " + r2.getArea());

                    // Downcast to Square
                    Square sq1 = (Square) r2;
                    System.out.println("As Square: " + sq1);
                    System.out.println("Side: " + sq1.getSide());
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (choice != 0);

        input.close();
    }
}
