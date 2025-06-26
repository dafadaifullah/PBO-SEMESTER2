/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum110325;

/**
 *
 * @author DAFA
 */
    
public class Mahasiswa {
    String nama;
    String nim;
    float utengahs,uakhirs,tugas,quiz;
    float na = 0;
    char huruf;
    
    

    public Mahasiswa(String nm, String n, float t, float q, float uts, float uas) {
        this.nama = nm;
        this.nim = n;
        this.tugas = t;
        this.quiz = q;
        this.utengahs = uts;
        this.uakhirs = uas;
        this.na = (float) (0.25 * tugas + 0.15 * quiz + 0.30 * utengahs + 0.35 * uakhirs);
    }
    // method tanpa parametr
    public void TampilData(){
        System.out.println("--------------------------");
        System.out.println("--Rekap Nilai Mahasiswa--");
        System.out.println("");
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("NIM            : "+nim);
        System.out.println("Nilai Tugas    : "+tugas);
        System.out.println("Nilai Qiuz     : "+quiz);
        System.out.println("Nilai UTS      : "+utengahs);
        System.out.println("Nilai UAS      : "+uakhirs);
        
        this.na = (float) (0.25 * tugas + 0.15 * quiz + 0.30 * utengahs + 0.35 * uakhirs);
        NilaiAkhir(this.na);
        System.out.println("Nilai Akhir    : "+na);
        System.out.println("Akreditasi     : "+huruf);
    }
    public void NilaiAkhir(float na){
        if (na >80 && na <=100){
            huruf = 'A';
        }
        else if(na >65 && na <=80){
            huruf = 'B';
        }
        else if(na >=55 && na <=65){
            huruf = 'C';
        }
        else if(na >=40 && na <55 ){
            huruf = 'D';
        }
        else if(na <40){
            huruf = 'E';
        }
    }
    public void cekstatus(){
        if(na >= 70){
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if(na < 70){
        System.out.print("MAAF ANDA GAGAL DAN HARUS MENGULANG");
    }
    }
}

