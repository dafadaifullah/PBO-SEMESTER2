/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABSIKOMP03
 */
import java.util.Scanner;

public class TiketBus {
    public static void main(String[] arqs){
        int menu,jum_tiket = 0;
        long harga,total_awal;
        float diskon = 0,total_bayar;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|       KELAS      | HARGA/TIKET     |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("|    1.EKONOMI     | RP.350.000,00   |");
        System.out.println("|    2.EKSEKUTIF   | RP.500.000,00   |");
        System.out.println("|    3.SUPER       | RP.1.000.000,00 |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("PILIH TIKET (ANGKA): ");
        menu=in.nextInt();
        System.out.println("MASUKKAN JUMLAH TIKET");
        jum_tiket=in.nextInt();
        switch(menu){
            case 1 :{
                harga=350000;
            }break;
            case 2 :{
                harga=500000;
            }break;
             case 3 :{
                harga=1000000;
            }break;
             default:
             {
                 harga= 0;
                 System.out.println("Kelas tidak tersedia");
             }break;
        }
        total_awal=harga*jum_tiket;
        if (jum_tiket>4)
        {
             System.out.println("DISKON!!");
             diskon=(float) (0.1*total_awal);
        }
        else
        {
            diskon=0;
        }
        
        total_bayar=total_awal-diskon;
        System.out.println("BIAYA AWAL : "+total_awal);
        System.out.println("DISKON : "+diskon);
        System.out.println("BAYAR : "+total_bayar);
    }
}
