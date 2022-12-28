/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.*;

/**
 *
 * @author Hp
 */
public class TestBackend2 {

    public static void main(String[] args) {
        Kategori novel = new Kategori("Novel", "Koleksi buku novel");
        Kategori referensi = new Kategori("Referensi", "Buku referensi ilmiah");

        //test getById
        Kategori kat1 = Kategori.getById(25);

        if (kat1 != null) {
            System.out.println(kat1.getNama());
        }

        novel.save();
        referensi.save();

        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.save();
        buku2.save();
        buku3.save();

        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();

        //test getById
        Buku buku = Buku.getById(1);

        if (buku != null) {
            System.out.println("Kategori: " + buku.getKategori().getNama() + ", Judul: "
                    + buku.getJudul());
        }

        // test delete
        buku3.delete();

        // test select all
        for (Buku b : Buku.getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: "
                    + b.getJudul());
        }

        // test search
        for (Buku b : Buku.search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: "
                    + b.getJudul());
        }
    }
}
