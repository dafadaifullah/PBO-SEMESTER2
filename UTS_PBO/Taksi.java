/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 * @author DAFA
 */
/** 
 *Dafa Daifullah
 2401081004
 TK 1-B
 */
public class Taksi {
    private int tarifAwal;
    private int tarifperKm;

    public Taksi() {
        
    }

    public Taksi(int tarifAwal, int tarifperKm) {
        this.tarifAwal = tarifAwal;
        this.tarifperKm= tarifperKm;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int gettarifAwal() {
        return tarifAwal;
    }

    public void settarifperKm(int tarifperKm) {
        this.tarifperKm = tarifperKm;
    }

    public int gettarifperKm() {
        return tarifperKm;
    }

    @Override
    public String toString() {
        return "tarif Awal: = " + tarifAwal + ", Tarif per Km = " + tarifperKm;
    }
}
 

