/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum220425;

/**
 *
 * @author DAFA
 */
public class Kerucut extends Lingkaran {
    private double tinggi;

    public Kerucut() {
        super();
    }

    public Kerucut(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return (1.0 / 3) * Math.PI * getR() * getR() * tinggi;
    }

    @Override
    public double getLuas() {
        double s = Math.sqrt(getR() * getR() + tinggi * tinggi);
        return Math.PI * getR() * (getR() + s);
    }

    @Override
    public String toString() {
        return "Kerucut dengan jari-jari = " + getR() +
               ", tinggi = " + tinggi +
               ", volume = " + getVolume() +
               ", luas permukaan = " + getLuas();
    }
}
