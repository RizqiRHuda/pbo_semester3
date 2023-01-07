/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
 




/**
 *
 * @author Hp
 */
public class Transaksi {
    private int idTransaksi;
    private Admin admin;
    private Menu menu;
    private Customer customer;
    private String tanggalTransaksi;
    private int total;
    private ArrayList <TransaksiMenu> daftarMenu ;

    private int idTransaksiMenu;

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
     public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<TransaksiMenu> getDaftarMenu() {
        return daftarMenu;
    }

    public void setDaftarMenu(ArrayList<TransaksiMenu> daftarMenu) {
        this.daftarMenu = daftarMenu;
    }
    
      public int getIdTransaksiMenu() {
        return idTransaksiMenu;
    }

    public void setIdTransaksiMenu(int idTransaksiMenu) {
        this.idTransaksiMenu = idTransaksiMenu;
    }
    
    public Transaksi(){
        
    }
    
    public Transaksi(Admin admin,Menu menu,Customer customer,String tanggalTransaksi, int total, ArrayList <TransaksiMenu> daftarMenu ){
        this.admin = admin;
        this.menu = menu;
        this.customer = customer;
        this.tanggalTransaksi = tanggalTransaksi;
        this.total = total;
        this.daftarMenu = daftarMenu;
    }
    
    public static ArrayList<Transaksi> getAll() {
        ArrayList<Transaksi> listTransaksi = new ArrayList<>();

        String query = "SELECT transaksi.*, admin.*, menu.*, customer.namacustomer FROM transaksi LEFT JOIN admin ON transaksi.idadmin = admin.idadmin LEFT JOIN menu ON transaksi.idmenu = menu.idmenu "
                + "LEFT JOIN customer ON transaksi.idcustomer = customer.idcustomer";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Admin adm = new Admin();
                adm.setIdAdmin(rs.getInt("idadmin"));
                adm.setNamaadmin(rs.getString("namaadmin"));
                
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idmenu"));
                menu.setNamaMenu(rs.getString("nama"));
                menu.setHarga(rs.getInt("harga"));
                
                Customer cs = new Customer();
                cs.setIdCustomer(rs.getInt("idcustomer"));
                cs.setNamacustomer(rs.getString("namacustomer"));
                
                Transaksi tr = new Transaksi();
                tr.setIdTransaksi(rs.getInt("idtransaksi"));
                tr.setMenu(menu);
                tr.setAdmin(adm);
                tr.setCustomer(cs);
                tr.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tr.setTotal(rs.getInt("totaltransaksi"));

                listTransaksi.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listTransaksi;
    }
    
     public static Transaksi getById(int id) {
        Transaksi tran = null;

        String query = "SELECT transaksi.*, admin.*, menu.*, customer.namacustomer FROM transaksi LEFT JOIN admin ON transaksi.idadmin = admin.idadmin LEFT JOIN menu ON transaksi.idmenu = menu.idmenu "
                + "LEFT JOIN customer ON transaksi.idcustomer = customer.idcustomer  WHERE  idtransaksi = " + id;

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Admin adm = new Admin();
                adm.setIdAdmin(rs.getInt("idadmin"));
                adm.setNamaadmin(rs.getString("namaadmin"));
                
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idmenu"));
                menu.setNamaMenu(rs.getString("nama"));
                menu.setHarga(rs.getInt("harga"));
                
                Customer cs = new Customer();
                cs.setIdCustomer(rs.getInt("idcustomer"));
                cs.setNamacustomer(rs.getString("namacustomer"));
                
                tran = new Transaksi();
                tran.setIdTransaksi(rs.getInt("idtransaksi"));
                tran.setMenu(menu);
                tran.setAdmin(adm);
                tran.setCustomer(cs);
                tran.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tran.setTotal(rs.getInt("totaltransaksi"));
                
                tran.daftarMenu = TransaksiMenu.getByIdTransaksi(tran.getIdTransaksi());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tran;
    }
     
    public static Transaksi getByTransaksiId() {
        Transaksi tran = null;

        String query = "SELECT transaksimenu.idtransaksimenu, transaksimenu.idmenu, transaksi.idtransaksi, menu.idmenu, menu.nama"
                + " FROM transaksimenu LEFT JOIN menu ON transaksimenu.idmenu=menu.idmenu "
                + "LEFT JOIN transaksi ON transaksimenu.idtransaksi = transaksi.idtransaksi;";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Admin adm = new Admin();
                adm.setIdAdmin(rs.getInt("idadmin"));
                adm.setNamaadmin(rs.getString("namaadmin"));

                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idmenu"));
                menu.setNamaMenu(rs.getString("nama"));
                menu.setHarga(rs.getInt("harga"));

                Customer cs = new Customer();
                cs.setIdCustomer(rs.getInt("idcustomer"));
                cs.setNamacustomer(rs.getString("namacustomer"));

                tran = new Transaksi();
                tran.setIdTransaksi(rs.getInt("idtransaksi"));
                tran.setMenu(menu);
                tran.setAdmin(adm);
                tran.setCustomer(cs);
                tran.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tran.setTotal(rs.getInt("totaltransaksi"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tran;

    }
     
  
    public static ArrayList<Transaksi> search(String keyword){
        ArrayList<Transaksi> listTransaksi =new ArrayList<>();
        
        String query = "SELECT transaksi.*, admin.*, menu.*, customer.* FROM transaksi LEFT JOIN admin ON transaksi.idadmin = admin.idadmin LEFT JOIN menu ON transaksi.idmenu = menu.idmenu "
                + "LEFT JOIN customer ON transaksi.idcustomer = customer.idcustomer WHERE customer.namacustomer LIKE '%"+ keyword +"%' OR " + "tanggaltransaksi LIKE '%"+ keyword +"%' OR "+" admin.namaadmin LIKE '%"+ keyword +"%'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        try {
            while (rs.next()) {
                Admin adm = new Admin();
                adm.setIdAdmin(rs.getInt("idadmin"));
                adm.setNamaadmin(rs.getString("namaadmin"));
                
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idmenu"));
                menu.setNamaMenu(rs.getString("nama"));
                menu.setHarga(rs.getInt("harga"));
                
                Customer cs = new Customer();
                cs.setIdCustomer(rs.getInt("idcustomer"));
                cs.setNamacustomer(rs.getString("namacustomer"));
                
                Transaksi tr = new Transaksi();
                tr.setIdTransaksi(rs.getInt("idtransaksi"));
                tr.setMenu(menu);
                tr.setAdmin(adm);
                tr.setCustomer(cs);
                tr.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tr.setTotal(rs.getInt("totaltransaksi"));
                
                listTransaksi.add(tr);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listTransaksi;
    }
     
    
     
    public void save() {
        if (this.idTransaksi == 0) {
            String query = "INSERT INTO transaksi (tanggaltransaksi, totaltransaksi, idadmin, idmenu, idcustomer) VALUES ('"
                    + this.tanggalTransaksi   + "', '" + this.total +"', '"+ this.admin.getIdAdmin() + "', '" +  this.menu.getIdMenu() + "', '"
                    + this.customer.getIdCustomer()+ "')";

            this.idTransaksi = DBHelper.insertQueryGetId(query);
        } else {
            String query = "UPDATE transaksi SET idadmin = " + this.admin.getIdAdmin() + ", idmenu = '"
                    + this.menu.getIdMenu() + "', idcustomer = '"
                    + this.customer.getIdCustomer() + "', tanggalTransaksi = '" + this.tanggalTransaksi + "', totaltransaksi = '"
                    + this.total + "' WHERE idTransaksi = " + this.idTransaksi;

            DBHelper.executeQuery(query);
        }
        
      
    }
    
    public void delete() {
        String query = "DELETE FROM transaksi WHERE idtransaksi = " + this.idTransaksi;

        DBHelper.executeQuery(query);
    }
    
    
    
}
