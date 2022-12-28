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
public class Menu {
    private int idMenu;
    private String namaMenu;
    private int harga;
    private String tambahan;

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTambahan() {
        return tambahan;
    }

    public void setTambahan(String tambahan) {
        this.tambahan = tambahan;
    }
    
    public Menu(){
        
    }
    
    public Menu(String namaMenu, int harga, String tambahan){
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.tambahan = tambahan;
    }
    
    public static Menu getById(int id) {
        Menu mn = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM " + "WHERE idmenu = " + id + "");

        try {
            while (rs.next()) {
                mn = new Menu();
                mn.setIdMenu(rs.getInt("idmenu"));
                mn.setNamaMenu(rs.getString("nama"));
                mn.setHarga(rs.getInt("harga"));
                mn.setTambahan(rs.getString("tambahan"));
             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mn;
    }
    
    public static ArrayList<Menu> getAll() {
        ArrayList<Menu> listMenu = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM menu");

        try {
            while (rs.next()) {
                Menu mn = new Menu();
                mn = new Menu();
                mn.setIdMenu(rs.getInt("idmenu"));
                mn.setNamaMenu(rs.getString("nama"));
                mn.setHarga(rs.getInt("harga"));
                mn.setTambahan(rs.getString("tambahan"));

                listMenu.add(mn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMenu;
    }
    
    public static ArrayList<Menu> search(String keyword) {
        ArrayList<Menu> listMenu = new ArrayList<>();

         String query = "SELECT * FROM menu"
                        + " WHERE nama LIKE '%" + keyword + "%'"
                        + " OR harga LIKE '%" + keyword + "%'"
                        + "OR tambahan LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
               Menu mn = new Menu();
                mn.setIdMenu(rs.getInt("idmenu"));
                mn.setNamaMenu(rs.getString("nama"));
                mn.setHarga(rs.getInt("harga"));
                mn.setTambahan(rs.getString("tambahan"));

                listMenu.add(mn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listMenu;
    }
    
    public void save(){
        if(this.idMenu == 0){
            String query = "INSERT INTO menu(nama, harga, tambahan) VALUES ("
                        + " '" + this.namaMenu + "', "
                        + " '" + this.harga + "', '"+ this.tambahan + "') ";
            this.idMenu = DBHelper.insertQueryGetId(query);

        }
        else{
           String query = "UPDATE menu SET" 
                   + " nama = '" + this.namaMenu + "', "
                   + " harga = '" + this.harga + "', "
                   + " tambahan = '" + this.tambahan + "' "
                   + " WHERE idmenu = '" + this.idMenu + "'";
            DBHelper.executeQuery(query);
        }
    }
    
      public boolean delete() {
//        String SQL = "DELETE FROM customer WHERE idmenu = '" + this.idMenu + "'";
//        DBHelper.executeQuery(SQL);
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahTransaksi FROM transaksi"
                + " WHERE idmenu = " + this.idMenu + "");

        int jumlahTransaksi = 0;

        try {
            while (rs.next()) {
                jumlahTransaksi = rs.getInt("jumlahTransaksi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jumlahTransaksi == 0) {
            String query = "DELETE FROM menu WHERE idmenu = " + this.idMenu;
           DBHelper.executeQuery(query);
            return true;
        } else {
            return false;
        }

    }
      
    public String toString(){
        return namaMenu;
    }
    
}
