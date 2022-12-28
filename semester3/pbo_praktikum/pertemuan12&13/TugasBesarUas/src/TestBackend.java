/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import backend.*;

public class TestBackend {
    public static void main(String[] args) {
        Customer cst1 = new Customer("Zein", "08123455678");
        Customer cst2 = new Customer("Zein1", "08123455678");
        
      

        // test insert
        cst1.save();
        cst2.save();
        
        // test update
       cst2.setNoHp("08123455678");
       cst2.save();

        // test delete
        cst1.delete();

        // test select all
//        for (Customer c : Customer.getAll()) {
//            System.out.println("Nama: " + c.getNama() + ", No Hp: " + c.getNoHp());
//        }
//
//        // test search
//        for (Customer c : Customer.search("Telkom")) {
//            System.out.println("Nama: " + c.getNama() + ",  No Hp: " + c.getNoHp());
//        }
        
   
    }
}

