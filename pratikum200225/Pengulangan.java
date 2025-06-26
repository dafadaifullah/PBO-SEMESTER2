/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum200225;
import java.util.Scanner;
/**
 *
 * @author DAFA
 */



public class Pengulangan {
    public static void main (String[] args) {
    
    int n,i;
    Scanner in = new Scanner(System.in);
    System.out.println("===Program Pengulangan");
    System.out.print("Masukkan Banyak Pengulangan : ");
    n = in.nextInt();
    System.out.println("---Pengulangan For---");
    for(i=1;i<=n;i++)
        System.out.print(i+"\t");
    
    System.out.println("\n---Pengulangan While---");
    i=1;
    while(i<=n){
        System.out.print(i+"\t");
        i++;
    }
    System.out.println("\n---Pengulangan Do-While---");
        i = 1;
        do {
            System.out.print(i + "\t");
            i++;
        } while(i <= n);
        }
    }