/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dafa
 */
import java.util.Scanner;

public class Input_Variabel {
    public static void main(String[] arqs){
        String nama;
        int umur;
        char jk;
        float rapor;
        boolean asal;
        Scanner input = new Scanner(System.in);
        System.out.println("==Program Input variabel==");
        System.out.print("Nama anda =");
        nama = input.nextLine();
        System.out.print("umur anda =");
        umur = input.nextInt();
        System.out.print("Gender l/p =");
        jk = input.next().charAt(0);
        System.out.print("ratja2 nilai rapor =");
        rapor = input.nextFloat();
        System.out.print("Asal Padang (true/false)? =");
        asal = input.nextBoolean();
        System.out.println("\n==input data anda==");
        System.out.println("Nama Anda"+nama);
        System.out.println("umur anda"+umur+"tahun");
        System.out.println("Gender Anda ="+jk);
        System.out.println("rata nilai"+rapor);
        if(asal)
            System.out.println("Anda Berasa dar Padang");
        else
            System.out.println("Anda bukan berasal dari padang");
    }
}
