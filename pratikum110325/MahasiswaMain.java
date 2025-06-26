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
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nama;
        String nim;
        float tugas,quiz,utengahs,uakhirs;
        float na = 0;
        char huruf;
        char ulang;
        
        do{
            
        System.out.println("--Rekap Nilai Mahasiswa--");
        System.out.println("");
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama=in.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        nim=in.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        tugas=in.nextFloat();
        System.out.print("Masukkan Nilai Quiz : ");
        quiz=in.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        utengahs=in.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        uakhirs=in.nextFloat();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, tugas,quiz, utengahs, uakhirs);
        mhs.NilaiAkhir(na);
        mhs.TampilData();
        mhs.cekstatus();
        
        System.out.print("\nApakah ingin input data mahasiswa lain (y/n)? ");
        in.nextLine(); //membersihkan line 
        ulang = in.nextLine().charAt(0);
        
        System.out.println();
        
        }while(ulang == 'y' || ulang == 'Y');
        in.close();
    }
    
}

    

