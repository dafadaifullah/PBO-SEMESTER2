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
public class Mobil extends Kendaraan {
    private String bahanBakar;
    private int kapasitasMesin;

    public Mobil() {
        super(); 
    }

    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda, warna); 
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public String toString() {
        return "Mobil dengan jumlah roda = " + getJmlRoda() +
               ", warna = " + getWarna() +
               ", bahan bakar = " + bahanBakar +
               ", kapasitas mesin = " + kapasitasMesin + " cc";
    }
}
