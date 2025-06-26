/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum090325;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;

public class polabintanginputuser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == n - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        } 
        input.close();
    }
}