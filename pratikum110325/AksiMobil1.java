/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum110325;

/**
 *
 * @author DAFA
 */
public class AksiMobil1 {

    public static void main(String[] args){
        //buat object baru
        mobil mobilku=new mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun=2004;
        mobilku.warna="Hitam";
        System.out.println("--------------");
        System.out.println("Data Mobil 1 : ");
        System.out.println("Merk Mobil = "+mobilku.merk);
        System.out.println("Plat Mobl = "+mobilku.plat);
        System.out.println("Warna Mobil = "+mobilku.warna);
        System.out.println("Tahun Keluaran = "+mobilku.tahun);
        System.out.println("Suara Mobil = "+mobilku.SuaraMobil());
        ///pemanggilan method
        mobilku.MobilAktif();//tanpa return(
        System.out.println(mobilku.SuaraMobil());
        
        mobil mobilku2=new mobil();
        mobilku2.merk="Avanza";
        mobilku2.plat="BA 4567 W";
        mobilku2.tahun=2006;
        mobilku2.warna="Silver";
        System.out.println("--------------");
        System.out.println("Data Mobil 2 = ");
        System.out.println("Merk Mobil = "+mobilku2.merk);
        System.out.println("Plat Mobil = "+mobilku2.plat);
        System.out.println("Warna Mobil = "+mobilku.warna);
        System.out.println("Tahun keluaran Mobil = "+mobilku2.tahun);
        ///pemanggilan method
        mobilku.MobilAktif();//tanpa return(
        System.out.println(mobilku.SuaraMobil());
        }
}
