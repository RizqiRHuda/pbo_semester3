/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

/**
 *
 * @author Hp
 */

import backend.*;

public class TestBackend {
    public static void main(String[] args) {
        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
        
       Anggota agt1 = new Anggota("Ari", "Pemalang", "081526221813");
       Anggota agt2 = new Anggota("Boni", "Rembang", "082872113212");
       Anggota agt3 = new Anggota("Cintya", "Solo", "085119821023");
       

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
     
        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        // test delete
        kat1.delete();

        // test select all
        for (Kategori k : Kategori.getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        // test search
        for (Kategori k : Kategori.search("referensi")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        
     

        // Test Insert
        agt1.save();
        agt2.save();
        agt3.save();

        // Test Update
        agt3.setAlamat("Semarang");
        agt3.save();

        // Test Delete
        agt3.delete();

        // Test Select All
        for (Anggota a : Anggota.getAll()) {
        System.out.println("Nama : " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        // Test Search
        for (Anggota a : Anggota.search("Rembang")) {
        System.out.println("Nama : " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}
