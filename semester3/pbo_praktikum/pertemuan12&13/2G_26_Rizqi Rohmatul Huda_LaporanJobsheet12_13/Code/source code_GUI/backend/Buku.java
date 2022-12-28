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
public class Buku {
    
    private int idbuku;
    private Kategori kategori;
    private String judul;
    private String penerbit;
    private String penulis;
    
    public Buku(){
        
    }
    
    public Buku(Kategori kategori, String judul, String penerbit, String penulis){
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
     public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public static ArrayList<Buku> getAll() {
        ArrayList<Buku> listBuku = new ArrayList();
        
        String query = "SELECT buku.*, kategori.nama, kategori.keterangan"
                        + " FROM buku"
                        + " LEFT JOIN kategori ON buku.idkategori = kategori.idkategori";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.setKategori(kat);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listBuku;
    }
    
    public static Buku getById(int id){
        Buku buku = null;
        
        String query = "SELECT buku.*, kategori.nama, kategori.keterangan"
                        + " FROM buku"
                        + " LEFT JOIN kategori ON buku.idkategori = kategori.idkategori"
                        + " WHERE idbuku = " + id;
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.setKategori(kat);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        return buku;
    }
    
    public static ArrayList<Buku> search (String keyword){
        ArrayList<Buku> listBuku = new ArrayList();
        
        String query = "SELECT buku.*, kategori.nama, kategori.keterangan"
                        + " FROM buku"
                        + " LEFT JOIN kategori ON buku.idkategori = kategori.idkategori"
                        + " WHERE judul LIKE '%" + keyword + "%'"
                        + " OR penerbit LIKE '%" + keyword + "%'"
                        + " OR penulis LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.setKategori(kat);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listBuku;
    }
    
    public void save(){
        if(this.idbuku == 0){
            String query = "INSERT INTO buku(idkategori, judul, penerbit, penulis) VALUES("
                    + " " + this.kategori.getIdkategori() + ", "
                    + " '" + this.judul + "', "
                    + " '" + this.penerbit + "', "
                    + " '" + this.idbuku + "') ";
            
            this.idbuku = DBHelper.insertQueryGetId(query);
        }
        else{
            String query = "UPDATE buku SET"
                    + " idkategori = " + this.kategori.getIdkategori() + ", "
                    + " judul = '" + this.judul + "', "
                    + " penerbit = '" + this.penerbit + "', "
                    + " penulis = '" + this.penulis + "' "
                    + " WHERE idbuku = '" + this.idbuku + "'";
            
            DBHelper.executeQuery(query);
        }
    }
    
    public void delete(){
        String query = "DELETE FROM buku WHERE idbuku = " + this.idbuku;
        DBHelper.executeQuery(query);
    }
   
}
