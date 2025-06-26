/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas180425;
/**Dafa Daifullah - 2401081004  */
/**
 *
 * @author DAFA
 */
public class TestPersegiPanjang {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public TestPersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
        jumlahObjek++;
    }
    
    public TestPersegiPanjang(int panjangBaru, int lebarBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        jumlahObjek++;
    }
    
    public void setPanjang(int panjangBaru){
        this.panjang = panjangBaru;
    }
    
    public int getPanjang() {
        return panjang;
    }
    
    public void setLebar(int lebarBaru){
        this.lebar = lebarBaru;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public static int getJumlahObjek() {
        return jumlahObjek;
    }

    public int getLuas() {
        return panjang * lebar;
    }
    
    public int getKeliling() {
        return 2 *(panjang + lebar);
    }
}
    
