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
public class Admin {

    private int idAdmin;
    private String namaadmin;
    private String noHp;
    private Transaksi transaksi;

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public int getIdAdmin() {
        return this.idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaadmin() {
        return this.namaadmin;
    }

    public void setNamaadmin(String namaadmin) {
        this.namaadmin = namaadmin;
    }

    public String getNoHp() {
        return this.noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Admin() {

    }

    public Admin(String nama, String noHp, Transaksi transaksi) {
        this.namaadmin = nama;
        this.noHp = noHp;
        this.transaksi = transaksi;
    }

    public static Admin getById(int id) {
        Admin adm = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM admin" + "WHERE idadmin = " + id + "");

        try {
            while (rs.next()) {
                adm = new Admin();
                adm.setIdAdmin(rs.getInt("idadmin"));
                adm.setNamaadmin(rs.getString("namaadmin"));
                adm.setNoHp(rs.getString("telepon"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return adm;
    }

    public static ArrayList<Admin> getAll() {
        ArrayList<Admin> listAdmin = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM admin");

        try {
            while (rs.next()) {
                Admin adm = new Admin();
                adm = new Admin();
                adm.setIdAdmin(rs.getInt("idadmin"));
                adm.setNamaadmin(rs.getString("namaadmin"));
                adm.setNoHp(rs.getString("telepon"));

                listAdmin.add(adm);

            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return listAdmin;
    }
    
     public static ArrayList<Admin> search(String keyword){
        ArrayList<Admin> listAdmin = new ArrayList<>();

        String query = "SELECT * FROM admin"
                        + " WHERE namaadmin LIKE '%" + keyword + "%'"
                        + " OR telepon LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while(rs.next()){
                Admin adm  = new Admin();
                adm.setIdAdmin((rs.getInt("idadmin")));
                adm.setNamaadmin(rs.getString("namaadmin"));
                adm.setNoHp(rs.getString("telepon"));
                
                listAdmin.add(adm);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

        return listAdmin;
    }

    public void save() {
         if(this.idAdmin == 0){
            String query = "INSERT INTO admin(namaadmin, telepon) VALUES ("
                        + " '" + this.namaadmin + "', "
                        + " '" + this.noHp + "') ";
                      
            this.idAdmin = DBHelper.insertQueryGetId(query);

        }
        else{
           String query = "UPDATE admin SET" 
                   + " namaadmin = '" + this.namaadmin + "', "
                   + " telepon = '" + this.noHp + "' "
                   + " WHERE idadmin = '" + this.idAdmin + "'";
            DBHelper.executeQuery(query);
        }
    }

//    public void delete() {
//        String SQL = "DELETE FROM admin WHERE idadmin = '" + this.idAdmin + "'";
//        DBHelper.executeQuery(SQL);
//    }
    public boolean delete() {

        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahTransaksi FROM transaksi"
                + " WHERE idadmin = " + this.idAdmin + "");

        int jumlahTransaksi = 0;

        try {
            while (rs.next()) {
                jumlahTransaksi = rs.getInt("jumlahTransaksi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jumlahTransaksi == 0) {
            String query = "DELETE FROM admin WHERE idadmin = " + this.idAdmin;
           DBHelper.executeQuery(query);
            return true;
        } else {
            return false;
        }

    }
    
    public String toString(){
        return namaadmin;
    }
    
    
}
