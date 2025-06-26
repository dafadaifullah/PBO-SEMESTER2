/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum180325;

/**
 *
 * @author DAFA
 */
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("kendraan 1 beban maksimal");
        Vehicle Kendaraan1 = new Vehicle (10000);
        System.out.print("menambahkan beban 1 (500 kg)");
        Kendaraan1.load = Kendaraan1.load + 500;
        System.out.print("menambahkan beban 1 (250 kg)");
        Kendaraan1.load = Kendaraan1.load + 250;
        System.out.print("menambahkan beban 1 (5000 kg)");
        Kendaraan1.load = Kendaraan1.load + 5000;
        System.out.print("menambahkan beban 1 (4000 kg)");
        Kendaraan1.load = Kendaraan1.load + 350;
        
        System.out.println("beban kendaraan saat ini ="+ Kendaraan1.getload()+"kg");
    }
    
}
