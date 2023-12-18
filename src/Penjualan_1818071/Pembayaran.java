/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan_1818071;

/**
 *
 * @author Kunkka
 */
public class Pembayaran extends HotWheels {
    private double diskon;

    public void setTotalHarga(double diskon) {
        this.diskon = diskon;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public double kembalian(double jumlahUang) {
        if (jumlahUang >= totalHarga) {
            return jumlahUang - totalHarga;
        } else {
            System.out.println("Jumlah uang tidak mencukupi.");
            return 0; // Jika uang kurang, kembalian dianggap 0
        }
    }

    public double totalPembayaran() {
        return totalHarga;
    }
}

