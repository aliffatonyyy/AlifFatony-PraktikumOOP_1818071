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
public class HotWheels {
    private String idBuyer;
    private String nama;
    private String jenisKelamin;
    private String alamat;
    private double uangDiterima;
    private double totalHarga;
    private double diskon;

    // Konstruktor
    public HotWheels(String idBuyer, String nama, String jenisKelamin, String alamat) {
        this.idBuyer = idBuyer;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    // Setter dan Getter untuk idBuyer
    public void setIdBuyer(String idBuyer) {
        this.idBuyer = idBuyer;
    }

    public String getIdBuyer() {
        return idBuyer;
    }

    // Setter dan Getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk jenisKelamin
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Setter dan Getter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter dan Getter untuk uangDiterima
    public void setUangDiterima(double uangDiterima) {
        this.uangDiterima = uangDiterima;
    }

    public double getUangDiterima() {
        return uangDiterima;
    }

    // Setter dan Getter untuk totalHarga
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    // Setter dan Getter untuk diskon
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getDiskon() {
        return diskon;
    }

    // Metode untuk menghitung kembalian
    public double hitungKembalian() {
        double totalBayar = totalHarga - (totalHarga * (diskon / 100));
        return uangDiterima - totalBayar;
    }
}

