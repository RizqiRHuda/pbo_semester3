package pemrogramanberbasisobjek.pertemuan11.project;

import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mikroskop mikroskop = new Mikroskop(null, 0, 0, null, null, null, 0, null);
        Softlens softlens = new Softlens(0, null, null, null, 0, null);
        
        mikroskop.lensa = "Objektif dan Okuler";
        mikroskop.s = 1.2;
        mikroskop.f = 2.0;
        mikroskop.nama = "Mikroskop";
        mikroskop.warna = "Putih";
        mikroskop.merk = "Science";
        mikroskop.harga = 1000000;
        mikroskop.fungsi = "Meneliti Virus";

        System.out.println(mikroskop.cetakInfo());
        System.out.println("Hitung perbesaran mikroskop : ");
        System.out.print("1. Mata berakomodasi maximum\n2. Mata tidak berakomodasi\nOpsi : [1 / 2] : ");
        int cs = sc.nextInt();
        System.out.println("Opsi : " + cs);
        mikroskop.hitungPerbesaran(cs, 20.5);

        mikroskop.service();
    
        System.out.print("\nBagian kerusakan : \n0. Lensa Okuler\n1.Lensa Objektif\n2.Kondensor\n");
        System.out.print("Input\t: ");
        int a = sc.nextInt();
        mikroskop.repair(a);
        System.out.println();
        
        System.out.println("\n==================================================================================\n");
        softlens.diameter = 0.98;
        softlens.nama = "Softlens Acuvue";
        softlens.warna = "Grey-brown";
        softlens.merk = "Acuvue";
        softlens.harga = 350000;
        softlens.fungsi = "Membantu memperjelas penglihatan dan membuat fungsi mata meningkat";

        System.out.println(softlens.cetakInfo());

        Motor motor = new Motor(null, 0, null, null, 0);
    
        motor.jenis = "Yamaha - Rx-King";
        motor.cc = 135;
        motor.no_seri = "AG 2119 SN";
        motor.warna = "Biru";
        motor.vMax = 200;
        motor.kecepatan = 30;
        motor.gear = 3;
        System.out.println(motor.getInfo());
        System.out.print("\nBagian kerusakan : \n0. Piston\n1. Gear\n2. Cylinder Head\n");
        System.out.print("Input\t: ");
        a = sc.nextInt();
        motor.service();
        motor.repair(a);
        System.out.println();
        motor.tambahKecepatan(3);
        motor.kurangiKecepatan(5);
        
        sc.close();
    }
}
