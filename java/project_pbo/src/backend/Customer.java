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
public class Customer {

    private int idCustomer;
    private String namacustomer;
    private String noHp;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    private String alamat;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNamacustomer() {
        return namacustomer;
    }

    public void setNamacustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Customer() {

    }

    public Customer(String nama, String noHp) {
        this.namacustomer = nama;
        this.noHp = noHp;
    }

    public static Customer getById(int id) {
        Customer cst = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer" + "WHERE idcustomer = " + id + "");

        try {
            while (rs.next()) {
                cst = new Customer();
                cst.setIdCustomer(rs.getInt("idcustomer"));
                cst.setNamacustomer(rs.getString("namacustomer"));
                cst.setNoHp(rs.getString("telepon"));
                cst.setAlamat(rs.getString("alamat"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cst;
    }

    public static ArrayList<Customer> getAll() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer");

        try {
            while (rs.next()) {
                Customer cst = new Customer();
                cst = new Customer();
                cst.setIdCustomer(rs.getInt("idcustomer"));
                cst.setNamacustomer(rs.getString("namacustomer"));
                cst.setNoHp(rs.getString("telepon"));
                cst.setAlamat(rs.getString("alamat"));

                listCustomer.add(cst);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    public static ArrayList<Customer> search(String keyword) {
        ArrayList<Customer> listCustomer = new ArrayList<>();

         String query = "SELECT * FROM customer"
                        + " WHERE namacustomer LIKE '%" + keyword + "%'"
                        + " OR alamat LIKE '%" + keyword + "%'"
                        + "OR telepon LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Customer cst = new Customer();
                cst.setIdCustomer(rs.getInt("idcustomer"));
                cst.setNamacustomer(rs.getString("namacustomer"));
                cst.setNoHp(rs.getString("telepon"));
                cst.setAlamat(rs.getString("alamat"));

                listCustomer.add(cst);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCustomer;
    }

    public void save(){
        if(this.idCustomer == 0){
            String query = "INSERT INTO customer(namacustomer, alamat, telepon) VALUES ("
                        + " '" + this.namacustomer + "', "
                        + " '" + this.alamat + "', '"+ this.noHp + "') ";
            this.idCustomer = DBHelper.insertQueryGetId(query);

        }
        else{
           String query = "UPDATE customer SET" 
                   + " namacustomer = '" + this.namacustomer + "', "
                   + " telepon = '" + this.noHp + "', "
                   + " alamat = '" + this.alamat + "' "
                   + " WHERE idcustomer = '" + this.idCustomer + "'";
            DBHelper.executeQuery(query);
        }
    }
//    public void delete() {
//        String SQL = "DELETE FROM customer WHERE idcustomer = '" + this.idCustomer + "'";
//        DBHelper.executeQuery(SQL);
//    }
    
    public boolean delete() {

        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahTransaksi FROM transaksi"
                + " WHERE idcustomer = " + this.idCustomer + "");

        int jumlahTransaksi = 0;

        try {
            while (rs.next()) {
                jumlahTransaksi = rs.getInt("jumlahTransaksi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jumlahTransaksi == 0) {
            String query = "DELETE FROM customer WHERE idcustomer = " + this.idCustomer;
           DBHelper.executeQuery(query);
            return true;
        } else {
            return false;
        }

    }
    
    
    public String toString(){
        return namacustomer;
    }

 

}
