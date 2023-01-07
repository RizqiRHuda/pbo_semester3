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
public class TransaksiMenu {

    private Menu menu;
    private int jumlah;
    private int idTransaksiMenu;
    private Transaksi transaksi;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getIdTransaksiMenu() {
        return idTransaksiMenu;
    }

    public void setIdTransaksiMenu(int idTransaksiMenu) {
        this.idTransaksiMenu = idTransaksiMenu;
    }

    public TransaksiMenu() {

    }

    public TransaksiMenu(Menu menu, int jumlah, int idTransaksiMenu) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.idTransaksiMenu = idTransaksiMenu;
    }
    
   public static ArrayList<TransaksiMenu> getAll() {
        ArrayList<TransaksiMenu> daftarMenu = new ArrayList<>();

       
        String query = "SELECT transaksimenu.*, menu.nama, menu.harga FROM transaksimenu LEFT JOIN menu ON transaksimenu.idmenu=menu.idmenu ";
                
 ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {

                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idmenu"));
                menu.setNamaMenu(rs.getString("nama"));
                menu.setHarga(rs.getInt("harga"));

                TransaksiMenu tm = new TransaksiMenu();
                tm.setMenu(menu);
                tm.setJumlah(rs.getInt("jumlah"));
                tm.setIdTransaksiMenu(rs.getInt("idTransaksiMenu"));

                daftarMenu.add(tm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return daftarMenu;
    }

    public static ArrayList<TransaksiMenu> getByIdTransaksi(int idTransaksi) {
        ArrayList<TransaksiMenu> daftarMenu = new ArrayList<>();

        String query = "SELECT transaksimenu.*, menu.nama, menu.harga FROM transaksimenu LEFT JOIN menu ON transaksimenu.idmenu=menu.idmenu "
                + "  WHERE idtransaksi =  " + idTransaksi;

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {

                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idmenu"));
                menu.setNamaMenu(rs.getString("nama"));
                menu.setHarga(rs.getInt("harga"));

                TransaksiMenu tm = new TransaksiMenu();
                tm.setMenu(menu);
                tm.setJumlah(rs.getInt("jumlah"));
                tm.setIdTransaksiMenu(rs.getInt("idTransaksiMenu"));

                daftarMenu.add(tm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return daftarMenu;
    }

    public void save() {
        if (this.idTransaksiMenu == 0) {

            String query = "INSERT INTO transaksimenu(idtransaksimenu, idtransaksi, idmenu, jumlah) VALUES ('"
                    + this.idTransaksiMenu + "', '" + this.transaksi.getIdTransaksi() + "', '" + this.menu.getIdMenu() 
                    + "', '" + this.jumlah + "')";

        this.idTransaksiMenu = DBHelper.insertQueryGetId(query);
        
        } 
        else {
         String query = "UPDATE transaksi SET" 
                   + " idtransaksimenu = '" + this.idTransaksiMenu + "', "
                   + " idtransaksi = '" + this.transaksi.getIdTransaksi() + "', "
                   + " idmenu = '" + this.menu.getIdMenu() + "', "
                   + " jumlah = '" + this.jumlah + "' "
                   + " WHERE idtransaksimenu = '" + this.idTransaksiMenu + "'";

            DBHelper.executeQuery(query);
        }
    }
        
        
    public void delete() {
        String query = "DELETE FROM transaksimenu WHERE idtransaksimenu = " + this.idTransaksiMenu;

        DBHelper.executeQuery(query);
    }
}
