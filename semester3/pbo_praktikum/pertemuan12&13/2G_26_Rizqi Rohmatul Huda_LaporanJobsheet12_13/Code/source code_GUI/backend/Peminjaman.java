/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Hp
 */
public class Peminjaman {

    private int idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }
    private int idAnggota, idBuku;

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman() {

    }

    public Peminjaman(int idPeminjaman, int idAnggota, int idBuku,/* Anggota anggota, Buku buku*/ String tanggalPinjam, String tanggalKembali) {
//        this.anggota = anggota;
//        this.buku = buku;
        this.idPeminjaman = idPeminjaman;
        this.idAnggota = idAnggota;
        this.idBuku = idBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public static ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();

        String query = "SELECT * FROM peminjaman";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idPeminjaman"));
                peminjaman.setIdAnggota(rs.getInt("idAnggota"));
                peminjaman.setIdBuku(rs.getInt("idBuku"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalPinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalKembali"));

                listPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPeminjaman;
    }

    public static Peminjaman getById(int id) {
        Peminjaman peminjaman = null;

        String query = "SELECT * FROM peminjaman WHERE idpeminjaman = " + id;

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idPeminjaman"));
                peminjaman.setIdAnggota(rs.getInt("idAnggota"));
                peminjaman.setIdBuku(rs.getInt("idBuku"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalPinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalKembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return peminjaman;
    }

    public static ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();

        String query = "SELECT * FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota LEFT JOIN buku b ON b.idbuku = p.idbuku WHERE a.nama LIKE '%"
                + keyword + "%' OR b.judul LIKE '%" + keyword + "%' OR tanggalpinjam LIKE '%" + keyword
                + "%' OR tanggalkembali LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idPeminjaman"));
                peminjaman.setIdAnggota(rs.getInt("idAnggota"));
                peminjaman.setIdBuku(rs.getInt("idBuku"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalPinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalKembali"));

                listPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPeminjaman;
    }

    public void save() {
        if (this.idPeminjaman == 0) {
            String query = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES ("
                    + this.idAnggota + ", '" + this.idBuku + "', '" + this.tanggalPinjam + "', '"
                    + this.tanggalKembali + "')";

            this.idPeminjaman = DBHelper.insertQueryGetId(query);
        } else {
            String query = "UPDATE peminjaman SET idanggota = " + this.idAnggota + ", idbuku = "
                    + this.idBuku + ", tanggalpinjam = '" + this.tanggalPinjam + "', tanggalkembali = '"
                    + this.tanggalKembali + "' WHERE idpeminjaman = " + this.idPeminjaman;

            DBHelper.executeQuery(query);
        }
    }

    public void delete() {
        String query = "DELETE FROM peminjaman WHERE idpeminjaman = " + this.idPeminjaman;

        DBHelper.executeQuery(query);
    }

}
