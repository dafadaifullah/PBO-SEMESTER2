/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TUGAS1;

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
            System.out.println("\n=== MENU BANGUN DATAR ===");
            System.out.println("1. Buat Shape");
            System.out.println("2. Buat Circle");
            System.out.println("3. Buat Rectangle");
            System.out.println("4. Buat Square");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine(); // flush newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan warna: ");
                    String color1 = input.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filled1 = input.nextBoolean();
                    Shape shape = new Shape(color1, filled1);
                    System.out.println(shape);
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    double radius = input.nextDouble();
                    input.nextLine(); // flush newline
                    System.out.print("Masukkan warna: ");
                    String color2 = input.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filled2 = input.nextBoolean();
                    Circle circle = new Circle(radius, color2, filled2);
                    System.out.println(circle);
                    System.out.println("Luas: " + circle.getArea());
                    System.out.println("Keliling: " + circle.getPerimeter());
                    break;

                case 3:
                    System.out.print("Masukkan panjang: ");
                    double length = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double width = input.nextDouble();
                    input.nextLine(); // flush newline
                    System.out.print("Masukkan warna: ");
                    String color3 = input.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filled3 = input.nextBoolean();
                    Rectangle rectangle = new Rectangle(width, length, color3, filled3);
                    System.out.println(rectangle);
                    System.out.println("Luas: " + rectangle.getArea());
                    System.out.println("Keliling: " + rectangle.getPerimeter());
                    break;

                case 4:
                    System.out.print("Masukkan sisi: ");
                    double side = input.nextDouble();
                    input.nextLine(); // flush newline
                    System.out.print("Masukkan warna: ");
                    String color4 = input.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filled4 = input.nextBoolean();
                    Square square = new Square(side, color4, filled4);
                    System.out.println(square);
                    System.out.println("Luas: " + square.getArea());
                    System.out.println("Keliling: " + square.getPerimeter());
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 0);

        input.close();
    }
}

