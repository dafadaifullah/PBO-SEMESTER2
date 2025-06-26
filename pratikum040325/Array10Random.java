/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum040325;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;
import java.util.Random;

public class Array10Random {
    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukkan banyak data: ");
        n = in.nextInt(); 

        int A[] = new int[n]; 

        System.out.println("== Data Anda:");
        for (i = 0; i < n; i++) {
            A[i] = rand.nextInt(100) + 1; 
            System.out.print(A[i] + "\t");
        }

        System.out.println(); 
        
        System.out.println("==array bernilai genap=="); 
        for(i=0;1<n;i++)
        {
            if(A[i]%2==0){
            }
        }
    }
}
    
