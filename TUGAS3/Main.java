package TUGAS3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DAFA
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("===== MENU =====");
            System.out.println("1. Hitung Lingkaran");
            System.out.println("2. Hitung Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double radius = input.nextDouble();
                    GeometricObject circle = new Circle(radius);
                    System.out.println(circle);
                    System.out.println("Luas: " + circle.getArea());
                    System.out.println("Keliling: " + circle.getPerimeter());
                    break;
                case 2:
                    System.out.print("Masukkan panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = input.nextDouble();
                    GeometricObject rectangle = new Rectangle(panjang, lebar);
                    System.out.println(rectangle);
                    System.out.println("Luas: " + rectangle.getArea());
                    System.out.println("Keliling: " + rectangle.getPerimeter());
                    break;
                case 3:
                    ulang = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        }

        input.close();
    }
}

