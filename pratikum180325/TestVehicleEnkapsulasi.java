/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum180325;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;

public class TestVehicleEnkapsulasi {
    public static void main (String[] args){
        System.out.println("Kendaraan 1 Beban maksimal 10k kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi (10000);
        
        System.out.println("Menambahkan beban 1 (500kg)" +kendaraan1.addload (500));
        System.out.println("Menambahkan beban 1 (250kg)" +kendaraan1.addload (250));
        System.out.println("Menambahkan beban 1 (5000kg)" +kendaraan1.addload (5000));
        System.out.println("Menambahkan beban 1 (4000kg)" +kendaraan1.addload (4000));
        System.out.println("Menambahkan beban 1 (350kg)" +kendaraan1.addload (350));
        
        System.out.println("Beban kendaraan  saat ini = "+kendaraan1.getLoad()+ "kg");
        
        //konstruktor kosong
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. beban maksimal belum ada");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        
        System.out.println("masukkan beban maksimal kendaraan : ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        //isi beban pada kendaraan
       System.out.println("masukkan berat beban yg akan diletakkan di kendaraan 2: ");
       double beban = in.nextDouble();
       while (kendaraan2.addload(beban)){//default true
           System.out.println("Beban ditambahkan "+beban+ " kg");
           System.out.println("Beban saat ini melebihi beban maksimal");
           beban = in.nextDouble();
       }
       if(!kendaraan2.addload(beban)){//not true ===> false
           System.out.println("Beban kendaraan saat ini "+kendaraan2.getLoad());
           System.out.println("Beban akan berlebih. penambahan beban akan ");
       }
       else
           System.out.println("Beban kendaraan saat ini "+kendaraan2.getLoad());
    }
}