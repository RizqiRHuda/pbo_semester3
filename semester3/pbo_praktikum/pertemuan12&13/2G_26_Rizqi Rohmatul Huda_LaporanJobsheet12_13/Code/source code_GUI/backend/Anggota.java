/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Anggota {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;
    
    public Anggota(){
        
    }
    
    public Anggota(String nama, String alamat, String telepon){
       
       this.nama = nama;
       this.alamat = alamat;
       this.telepon = telepon;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public static Anggota getById(int id){
        Anggota agt = null;
        ResultSet rs= DBHelper.selectQuery("SELECT * FROM " + "WHERE idAnggota = " + id + "");
        
         try {
            while(rs.next()){
                agt = new Anggota();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return agt;
    }
    
    public static ArrayList<Anggota> getAll(){
        ArrayList<Anggota> listAnggota = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try{
            while(rs.next()){
               Anggota agt = new Anggota();
               agt = new Anggota();
               agt.setIdAnggota(rs.getInt("idAnggota"));
               agt.setNama(rs.getString("nama"));
               agt.setAlamat(rs.getString("alamat"));
               agt.setTelepon(rs.getString("telepon"));

                listAnggota.add(agt);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listAnggota;
    }
    
     public static ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> listAnggota = new ArrayList<>();

        String query = "SELECT * FROM anggota"
                        + " WHERE nama LIKE '%" + keyword + "%'"
                        + " OR alamat LIKE '%" + keyword + "%'"
                        + "OR telepon LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while(rs.next()){
                Anggota agt = new Anggota();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
                listAnggota.add(agt);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

        return listAnggota;
    }
    
      public void save(){
        if(this.idAnggota == 0){
            String query = "INSERT INTO anggota(nama, alamat, telepon) VALUES ("
                        + " '" + this.nama + "', "
                        + " '" + this.alamat + "', '"+ this.telepon + "') ";
            this.idAnggota = DBHelper.insertQueryGetId(query);

        }
        else{
           String query = "UPDATE anggota SET" 
                   + " nama = '" + this.nama + "', "
                   + " alamat = '" + this.alamat + "', "
                   + " telepon = '" + this.telepon + "' "
                   + " WHERE idAnggota = '" + this.idAnggota + "'";
            DBHelper.executeQuery(query);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '" + this.idAnggota  + "'" ;
        DBHelper.executeQuery(SQL);
    }
        
}
