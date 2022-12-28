package pbo_semester3;

public class HewanDarat {
    public static void main(String[] args) {
        
    String nama1,nama2,nama3,nama4,nama5,nama6,nama7,nama8,nama9,nama10,nama11,nama12,nama13,nama14,nama15;
    String jenis1,jenis2,jenis3,jenis4,jenis5,jenis6,jenis7,jenis8,jenis9,jenis10,jenis11,jenis12,jenis13,jenis14,jenis15;
    String warna1,warna2,warna3,warna4,warna5,warna6,warna7,warna8,warna9,warna10,warna11,warna12,warna13,warna14,warna15;
    int massa1,massa2,massa3,massa4,massa5,massa6,massa7,massa8,massa9,massa10,massa11,massa12,massa13,massa14,massa15;
    int kecepatan1,kecepatan2,kecepatan3,kecepatan4,kecepatan5,kecepatan6,kecepatan7,kecepatan8,kecepatan9,kecepatan10,kecepatan11,
    kecepatan12,kecepatan13,kecepatan14,kecepatan15;
    
    nama1 = "Kucing";
    jenis1 = "British-short";
    warna1 = "Grey";
    massa1 = 4;
    kecepatan1 = 30;

    nama2 = "Sapi";
    jenis2 = "Wagyu";
    warna2 = "Grey";
    massa2 = 200;
    kecepatan2 = 40;

    nama3 = "Kambing";
    jenis3 = "perah";
    warna3 = "Coklat";
    massa3 = 90;
    kecepatan3 = 35;

    nama4 = "Kelinci";
    jenis4 = "Himalaya";
    warna4 = "Putih";
    massa4 = 3;
    kecepatan4 = 60;

    nama5 = "Rusa";
    jenis5 = "Africans";
    warna5 = "Brown";
    massa5 = 70;
    kecepatan5 = 80;

    nama6 = "Kerbau";
    jenis6 = "Toraja";
    warna6 = "Hitam";
    massa6 = 200;
    kecepatan6 = 45;

    nama7 = "Serigala";
    jenis7 = "Alpha";
    warna7 = "White-Grey";
    massa7 = 60;
    kecepatan7 = 65;

    nama8 = "Singa";
    jenis8 = "Aficans";
    warna8 = "Orange";
    massa8 = 250;
    kecepatan8 = 70;

    nama9 = "Elang";
    jenis9 = "Aves";
    warna9 = "Orange-Grey";
    massa9 = 8;
    kecepatan9 = 90;

    nama10 = "Harimau";
    jenis10 = "Sumatera";
    warna10 = "Orange-White";
    massa10 = 150;
    kecepatan10 = 75;

    nama11 = "Cheetah";
    jenis11 = "Africans";
    warna11 = "Spot-Orange-Black";
    massa11 = 70;
    kecepatan11 = 100;

    nama12 = "Ayam";
    jenis12 = "Aves";
    warna12 = "Orange-White";
    massa12 = 3;
    kecepatan12 = 35;

    nama13 = "Bebek";
    jenis13 = "Aves";
    warna13 = "Coklat";
    massa13 = 3;
    kecepatan13 = 35;

    nama14 = "Unta";
    jenis14 = "Arabic";
    warna14 = "Coklat";
    massa14 = 200;
    kecepatan14 = 55;

    nama15 = "Gajah";
    jenis15 = "Sumatera";
    warna15 = "Black";
    massa15 = 1000;
    kecepatan15 = 45;  

   
    dataHewan(nama1, jenis1, warna1, massa1, kecepatan1);
    kecepatan1 = tambahKecepatan(kecepatan1, 10);
    System.out.println("Kecepatan (increment) : " + kecepatan1);
    kecepatan1 = kurangiKecepatan(kecepatan1, 5);
    System.out.println("Kecepatan akhir : " + kecepatan1);
   
    dataHewan(nama2, jenis2, warna2, massa2, kecepatan2);
    kecepatan2 = tambahKecepatan(kecepatan2, 8);
    System.out.println("Kecepatan (increment) : " + kecepatan2);
    kecepatan2 = kurangiKecepatan(kecepatan2, 9);
    System.out.println("Kecepatan akhir : " + kecepatan2);

    dataHewan(nama3, jenis3, warna3, massa3, kecepatan3);
    kecepatan3 = tambahKecepatan(kecepatan3, 11);
    System.out.println("Kecepatan (increment) : " + kecepatan3);
    kecepatan3 = kurangiKecepatan(kecepatan3, 3);
    System.out.println("Kecepatan akhir : " + kecepatan3);

    dataHewan(nama4, jenis4, warna4, massa4, kecepatan4);
    kecepatan4 = tambahKecepatan(kecepatan4, 9);
    System.out.println("Kecepatan (increment) : " + kecepatan4);
    kecepatan4 = kurangiKecepatan(kecepatan4, 7);
    System.out.println("Kecepatan akhir : " + kecepatan4);

    dataHewan(nama5, jenis5, warna5, massa5, kecepatan5);
    kecepatan5 = tambahKecepatan(kecepatan5, 5);
    System.out.println("Kecepatan (increment) : " + kecepatan5);
    kecepatan5 = kurangiKecepatan(kecepatan5, 6);
    System.out.println("Kecepatan akhir : " + kecepatan5);

    dataHewan(nama6, jenis6, warna6, massa6, kecepatan6);
    kecepatan6 = tambahKecepatan(kecepatan6, 10);
    System.out.println("Kecepatan (increment) : " + kecepatan6);
    kecepatan6 = kurangiKecepatan(kecepatan6, 3);
    System.out.println("Kecepatan akhir : " + kecepatan6);

    dataHewan(nama7, jenis7, warna7, massa7, kecepatan7);
    kecepatan7 = tambahKecepatan(kecepatan7, 20);
    System.out.println("Kecepatan (increment) : " + kecepatan7);
    kecepatan7 = kurangiKecepatan(kecepatan7, 5);
    System.out.println("Kecepatan akhir : " + kecepatan7);

    dataHewan(nama8, jenis8, warna8, massa8, kecepatan8);
    kecepatan8 = tambahKecepatan(kecepatan8, 12);
    System.out.println("Kecepatan (increment) : " + kecepatan8);
    kecepatan8 = kurangiKecepatan(kecepatan8, 8);
    System.out.println("Kecepatan akhir : " + kecepatan8);

    dataHewan(nama9, jenis9, warna9, massa9, kecepatan9);
    kecepatan9 = tambahKecepatan(kecepatan9, 10);
    System.out.println("Kecepatan (increment) : " + kecepatan9);
    kecepatan9 = kurangiKecepatan(kecepatan9, 4);
    System.out.println("Kecepatan akhir : " + kecepatan9);

    dataHewan(nama10, jenis10,warna10, massa10,kecepatan10);
    kecepatan10 = tambahKecepatan(kecepatan10, 13);
    System.out.println("Kecepatan (increment) : " + kecepatan10);
    kecepatan10 = kurangiKecepatan(kecepatan10, 6);
    System.out.println("Kecepatan akhir : " + kecepatan10);

    dataHewan(nama11, jenis11, warna11, massa11, kecepatan11);
    kecepatan11 = tambahKecepatan(kecepatan11, 10);
    System.out.println("Kecepatan (increment) : " + kecepatan11);
    kecepatan11 = kurangiKecepatan(kecepatan11, 5);
    System.out.println("Kecepatan akhir : " + kecepatan11);

    dataHewan(nama12, jenis12, warna12, massa12, kecepatan12);
    kecepatan12 = tambahKecepatan(kecepatan12, 10);
    System.out.println("Kecepatan (increment) : " + kecepatan12);
    kecepatan12 = kurangiKecepatan(kecepatan12, 3);
    System.out.println("Kecepatan akhir : " + kecepatan12);

    dataHewan(nama13, jenis13, warna13, massa13, kecepatan13);
    kecepatan13 = tambahKecepatan(kecepatan13, 18);
    System.out.println("Kecepatan (increment) : " + kecepatan13);
    kecepatan13 = kurangiKecepatan(kecepatan13, 5);
    System.out.println("Kecepatan akhir : " + kecepatan13);

    dataHewan(nama14, jenis14, warna14, massa14, kecepatan14);
    kecepatan14 = tambahKecepatan(kecepatan14, 20);
    System.out.println("Kecepatan (increment) : " + kecepatan14);
    kecepatan14 = kurangiKecepatan(kecepatan1, 8);
    System.out.println("Kecepatan akhir : " + kecepatan1);

    dataHewan(nama15, jenis15, warna15, massa15, kecepatan15);
    kecepatan15 = tambahKecepatan(kecepatan15, 8);
    System.out.println("Kecepatan (increment) : " + kecepatan15);
    kecepatan15 = kurangiKecepatan(kecepatan15, 2);
    System.out.println("Kecepatan akhir : " + kecepatan15);

    }

   static void dataHewan(String nm, String jns, String wr, int m, int v){
    System.out.println("---------------------");
    System.out.println("Data hewan : " );
    System.out.println("Nama\t: " + nm);
    System.out.println("Jenis\t: " + jns);
    System.out.println("Warna\t: " + wr);
    System.out.println("Massa\t: " + m);
    System.out.println("Kecepatan : " + v);
   }
   public static int tambahKecepatan(int kecepatan, int increment){
    kecepatan +=increment;
    return kecepatan;
   }
   public static int kurangiKecepatan(int kecepatan, int decrement){
    kecepatan -=decrement;
    return kecepatan;
   }

}
