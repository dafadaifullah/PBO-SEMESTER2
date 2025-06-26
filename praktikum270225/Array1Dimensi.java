/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270225;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;
public class Array1Dimensi {
    public static void main (String[] args){
        
       int A[],n,i;
       Scanner in = new Scanner (System.in);
       System.out.print("Masukkan banyak Data : ");
       n = in.nextInt();
       A = new int[n]; //
       //dimensi array
       for(i=0;i<n;i++)
       {
           System.out.print("A["+i+") = ");
           A[i] = in.nextInt();
       }
       int jumlah=0;
       //hitung jumlah dan rata-rata
       for(i=0;i<n;i++)
           jumlah=jumlah+A[i];
       float rata = (float)jumlah/n;
       //menentukan nilai terbesar dan terkecil
       int max = A[0];
       int min = A[0];   
       for(i=1;i<n;i++) {
            if(A[i]>max) {
                max=A[i];
            }
            if(A[i]<min) {
                min=A[i]; 
            }
        }
       System.out.println("Nilai Terbesar = " +max);
       System.out.println("Nilai Terkecil = " +min);
       
       int imax = 0;
       int imin = 0;
       for(i=1;i<n;i++) {
            if(A[i]>max) {
                max=A[i];
            }
            if(A[i]<min) {
                min=A[i]; 
            }
        }
       System.out.println("Nilai Terbesar = " + max);
       System.out.println("Nilai Terkecil = " + min);
       System.out.println("==Isi Array==");
       for(i=0;i<n;i++)
           System.out.print(A[i]+"\t");
       System.out.println("\nJumlah = "+jumlah);
       System.out.println("Rata-rata = "+rata);
       
    }
}

