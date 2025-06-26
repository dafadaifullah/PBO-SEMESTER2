/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum20052025;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;

public class NewMainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Elektronik
        Elektronik elektronik = new Elektronik();
        System.out.println("=== Input Data Elektronik ===");
        System.out.print("Merek: ");
        elektronik.setMerek(input.nextLine());
        System.out.print("Tahun Produksi: ");
        elektronik.setTahunProduksi(input.nextInt());
        System.out.print("Garansi (tahun): ");
        elektronik.setGaransi(input.nextInt());
        input.nextLine(); // bersihkan newline

        System.out.println("\n=== Data Elektronik ===");
        System.out.println("Merek: " + elektronik.getMerek());
        System.out.println("Tahun Produksi: " + elektronik.getTahunProduksi());
        System.out.println("Garansi: " + elektronik.getGaransi() + " tahun");

        // Laptop
        Laptop laptop = new Laptop();
        System.out.println("\n=== Input Data Laptop ===");
        System.out.print("Merek: ");
        laptop.setMerek(input.nextLine());
        System.out.print("Tahun Produksi: ");
        laptop.setTahunProduksi(input.nextInt());
        System.out.print("Garansi (tahun): ");
        laptop.setGaransi(input.nextInt());
        System.out.print("Ukuran Layar (inch): ");
        laptop.setUkuranLayar(input.nextInt());
        System.out.print("Kapasitas RAM (GB): ");
        laptop.setKapasitasRAM(input.nextInt());
        input.nextLine(); // newline

        System.out.println("\n=== Data Laptop ===");
        System.out.println("Merek: " + laptop.getMerek());
        System.out.println("Tahun Produksi: " + laptop.getTahunProduksi());
        System.out.println("Garansi: " + laptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inch");
        System.out.println("RAM: " + laptop.getKapasitasRAM() + " GB");

        // Gaming Laptop
        Gaming gaming = new Gaming();
        System.out.println("\n=== Input Data Laptop Gaming ===");
        System.out.print("Merek: ");
        gaming.setMerek(input.nextLine());
        System.out.print("Tahun Produksi: ");
        gaming.setTahunProduksi(input.nextInt());
        System.out.print("Garansi (tahun): ");
        gaming.setGaransi(input.nextInt());
        System.out.print("Ukuran Layar (inch): ");
        gaming.setUkuranLayar(input.nextInt());
        System.out.print("Kapasitas RAM (GB): ");
        gaming.setKapasitasRAM(input.nextInt());
        input.nextLine(); // newline
        System.out.print("Kartu Grafis: ");
        gaming.setKartuGrafis(input.nextLine());
        System.out.print("Refresh Rate (Hz): ");
        gaming.setRefreshRate(input.nextInt());
        input.nextLine();

        System.out.println("\n=== Data Laptop Gaming ===");
        System.out.println("Merek: " + gaming.getMerek());
        System.out.println("Tahun Produksi: " + gaming.getTahunProduksi());
        System.out.println("Garansi: " + gaming.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + gaming.getUkuranLayar() + " inch");
        System.out.println("RAM: " + gaming.getKapasitasRAM() + " GB");
        System.out.println("GPU: " + gaming.getKartuGrafis());
        System.out.println("Refresh Rate: " + gaming.getRefreshRate() + " Hz");

        // Smartphone
        Smartphone smartphone = new Smartphone();
        System.out.println("\n=== Input Data Smartphone ===");
        System.out.print("Merek: ");
        smartphone.setMerek(input.nextLine());
        System.out.print("Tahun Produksi: ");
        smartphone.setTahunProduksi(input.nextInt());
        System.out.print("Garansi (tahun): ");
        smartphone.setGaransi(input.nextInt());
        System.out.print("Kapasitas Baterai (mAh): ");
        smartphone.setKapasitasBaterai(input.nextInt());
        System.out.print("Jumlah Kamera: ");
        smartphone.setJumlahKamera(input.nextInt());
        input.nextLine();

        System.out.println("\n=== Data Smartphone ===");
        System.out.println("Merek: " + smartphone.getMerek());
        System.out.println("Tahun Produksi: " + smartphone.getTahunProduksi());
        System.out.println("Garansi: " + smartphone.getGaransi() + " tahun");
        System.out.println("Baterai: " + smartphone.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + smartphone.getJumlahKamera());

        // SmartWatch
        SmartWatch watch = new SmartWatch();
        System.out.println("\n=== Input Data SmartWatch ===");
        System.out.print("Merek: ");
        watch.setMerek(input.nextLine());
        System.out.print("Tahun Produksi: ");
        watch.setTahunProduksi(input.nextInt());
        System.out.print("Garansi (tahun): ");
        watch.setGaransi(input.nextInt());
        System.out.print("Kapasitas Baterai (mAh): ");
        watch.setKapasitasBaterai(input.nextInt());
        System.out.print("Jumlah Kamera: ");
        watch.setJumlahKamera(input.nextInt());
        System.out.print("Ukuran Layar (inch): ");
        watch.setUkuranLayar(input.nextInt());
        System.out.print("Tahan Air (true/false): ");
        watch.setTahanAir(input.nextBoolean());

        System.out.println("\n=== Data SmartWatch ===");
        System.out.println("Merek: " + watch.getMerek());
        System.out.println("Tahun Produksi: " + watch.getTahunProduksi());
        System.out.println("Garansi: " + watch.getGaransi() + " tahun");
        System.out.println("Baterai: " + watch.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + watch.getJumlahKamera());
        System.out.println("Ukuran Layar: " + watch.getUkuranLayar() + " inch");
        System.out.println("Tahan Air: " + (watch.isTahanAir() ? "Ya" : "Tidak"));

        input.close();
    }
}

