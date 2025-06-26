/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas250325;
/**Dafa Daifullah - 2401081004  */

import java.util.Scanner;

/**
 *
 * @author DAFA
 */
public class PersegiPanjangTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Jumlah objek saat ini: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();

        pp1.setPanjang(15);
        pp1.setLebar(7);
        
        System.out.println("Objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: " + pp1.getPanjang());
        System.out.println("Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
        
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(7, 4);
        
        System.out.println("Objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: " + pp2.getPanjang());
        System.out.println("Lebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
    }
    
}
