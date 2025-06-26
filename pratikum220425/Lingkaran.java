/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum220425;

/**
 *
 * @author DAFA
 */
 public class Lingkaran {
    private double r;

    public Lingkaran() {
        this.r = 0;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getDiameter() {
        return 2 * r;
    }

    public double getKeliling() {
        return 2 * Math.PI * r;
    }

    public double getLuas() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Lingkaran dengan jari-jari = " + r +
               ", diameter = " + getDiameter() +
               ", keliling = " + getKeliling() +
               ", luas = " + getLuas();
    }
}
