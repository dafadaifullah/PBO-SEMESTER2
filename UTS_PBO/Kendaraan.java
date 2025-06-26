/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author DAFA
 */
/** 
 *Dafa Daifullah
 2401081004
 TK 1-B
 */

public class Kendaraan {
    private int jmlRoda;
    private String warna;

    public Kendaraan() {
        
    }

    public Kendaraan(int jmlRoda, String warna) {
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Kendaraan dengan jumlah roda = " + jmlRoda + ", warna = " + warna;
    }
}
