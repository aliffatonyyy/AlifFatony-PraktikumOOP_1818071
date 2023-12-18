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
public class Perhitungan implements PenjualanHotWheels {

    private String idBuyer;
    private String nama;
    private String jenisKelamin;
    private String alamat;
    private double uangDiterima;
    private double totalHarga;
    private double diskon;

    // Konstruktor
    public Perhitungan(String idBuyer, String nama, String jenisKelamin, String alamat) {
        this.idBuyer = idBuyer;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    // Implementasi metode dari antarmuka PenjualanHotWheels
    @Override
    public double hitungTotalPembayaran() {
        return totalHarga - (totalHarga * (diskon / 100));
    }

    @Override
    public double hitungKembalian() {
        return uangDiterima - hitungTotalPembayaran();
    }
}

