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
public class CLI_HotWheels {
    
     public static void main(String[] args) {
        // Membuat objek dengan nama "buyer" dari class HotWheels
        HotWheels buyer = new HotWheels();

        // Menggunakan method dari class HotWheels
        buyer.dataID_buyer("B001");
        buyer.dataNama("Alif Fatoni");
        buyer.dataJenisKelamin("Laki-laki");
        buyer.dataAlamat("Jl. Kepanjen");

        // Menampilkan informasi pembeli
        System.out.println("Informasi Pembeli Hot Wheels");
        System.out.println("------------------------------------");
        System.out.println("ID Buyer : " + buyer.cetakID_buyer());
        System.out.println("Nama : " + buyer.cetaknama());
        System.out.println("Jenis Kelamin : " + buyer.cetakJenisKelamin());
        System.out.println("Alamat : " + buyer.cetakAlamat());
    }
    
}
