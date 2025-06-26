/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas250325;
/**Dafa Daifullah - 2401081004 */
/**
 *
 * @author DAFA
 */
public class BankNasabahTabunganTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nasabah nasabah1 = new Nasabah("Daifullah", "Dafa");
        Tabungan tabungan1 = new Tabungan(8000);
        nasabah1.setTabungan(
                tabungan1);

        Nasabah nasabah2 = new Nasabah("Dafa", "Daifullah");
        Tabungan tabungan2 = new Tabungan(3000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Informasi nasabah dan saldonya");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung seorang nasabah");
        tabungan1.simpanUang(4000);
        System.out.println("Setelah Dafa menabung di bank 4000: " + tabungan1.getSaldo());

        tabungan2.simpanUang(7000);
        System.out.println("Setelah Daifullah menabung di bank 7000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");

        tabungan1.ambilUang(5000);
        System.out.println("Setelah Dafa mengambil uang di bank 5000: " + tabungan1.getSaldo());

        tabungan2.ambilUang(6000);
        System.out.println("Setelah Daifullah mengambil uang di bank 6000: " + tabungan2.getSaldo());

        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah Dafa transfer sejumlah 1000 ke Daifullah:");
        System.out.println("Saldo Dafa: " + tabungan1.getSaldo());
        System.out.println("Saldo Daifullah: " + tabungan2.getSaldo());
        
    }
    
}
