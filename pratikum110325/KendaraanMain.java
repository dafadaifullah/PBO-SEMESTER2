/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum110325;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;

public class KendaraanMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int tahun;
        int harga;
        int v;
        
        System.out.print("Masukkan jenis kendaraan = ");
        jenis=in.nextLine();
        System.out.print("Masukkan merk kendaraan = ");
        merk=in.nextLine();
        System.out.print("Tahun keluaran kendaraan = ");
        tahun=in.nextInt();
        in.nextLine(); //pembersihan line untuk string
        System.out.print("Warna kendaraan = ");
        warna=in.nextLine();
        System.out.print("Harga sewa kendaraan = ");
        harga=in.nextInt();
        System.out.print("Kecepatan kendaraan = ");
        v=in.nextInt();
        
        //objek baru -- class kendaraan
        kendaraan kend=new kendaraan(jenis, merk, tahun, warna);
        kend.Infokendaraan();
        kend.CekHarga(harga);
        kend.CekKendaraan(v);
        System.out.println();
    }
}
