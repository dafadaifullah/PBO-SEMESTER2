/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum220425;

/**
 *
 * @author DAFA
 */


public class Slinder extends Lingkaran {
    private double tinggi;

    public Slinder() {
        super();
    }

    public Slinder(double r, double t) {
        super(r);
        this.tinggi = t;
    }

    public void setTinggi(double tinggi) {
        if (tinggi < 0) {
            throw new IllegalArgumentException("Tinggi tidak boleh negatif");
        }
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return Math.PI * getR() * getR() * tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * Math.PI * getR() * (getR() + tinggi);
    }

    @Override
    public String toString() {
        return "Silinder dengan jari-jari = " + getR() +
               ", tinggi = " + tinggi +
               ", volume = " + getVolume() +
               ", luas permukaan = " + getLuas();
    }
}
