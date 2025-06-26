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
public class diskonkotaksusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih merek susu:");
        System.out.println("1. Merek X - Rp.40.000 per kotak");
        System.out.println("2. Merek Y - Rp.50.000 per kotak");
        System.out.println("3. Merek Z - Rp.60.000 per kotak");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();
      
        System.out.print("Masukkan jumlah kotak yang dibeli: ");
        int jumlah = input.nextInt();
        
        int hargaPerKotak = 0;
        double totalHarga = 0, diskon = 0, totalBayar = 0;
        
        switch (pilihan) {
            case 1:
                hargaPerKotak = 40000;
                totalHarga = jumlah * hargaPerKotak;
                if (jumlah >= 3) {
                    diskon = totalHarga * 0.10;
                }
                break;
            case 2:
                hargaPerKotak = 50000;
                totalHarga = jumlah * hargaPerKotak;
                if (jumlah > 3) {
                    diskon = totalHarga * 0.12;
                }
                break;
            case 3:
                hargaPerKotak = 60000;
                if (jumlah > 1) {
                    totalHarga = hargaPerKotak + (jumlah - 1) * hargaPerKotak * 0.85;
                    diskon = (jumlah - 1) * hargaPerKotak * 0.15;
                } else {
                    totalHarga = hargaPerKotak;
                }
                break;
            default:
                System.out.println("Pilihan kamu tidak sesuai!");
                input.close();
                return;
        }
        
        totalBayar = totalHarga - diskon;
        
        System.out.println("Total Harga: Rp." + totalHarga);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Total Bayar: Rp." + totalBayar);
        
        input.close();
    }
}