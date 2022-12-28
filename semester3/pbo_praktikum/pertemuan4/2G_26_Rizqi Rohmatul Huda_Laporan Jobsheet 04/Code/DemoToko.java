package pemrogramanberbasisobjek.pertemuan4;

public class DemoToko {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Phone", "Electronic", 2000000, 111);
        Admin admin1 = new Admin("User1", "08123456", 101, "Malang-Blok A1");
        Toko toko1 = new Toko("Center-J1", "Blok-A 404", "000405");

        toko1.tambahAdmin(admin1);
        toko1.tambahBarang(barang1);

        System.out.println(toko1.getInfo());
        System.out.println(barang1.getInfoBarang());
        System.out.println();
        System.out.println();
        
        Barang barang2 = new Barang("NoteBook", "Electronic", 12000000, 112);
        Admin admin2 = new Admin("User2", "08123999", 102, "Malang-Blok B2");
        Toko toko2 = new Toko("Center-J2", "Blok-B 405", "000409");

        toko2.tambahAdmin(admin2);
        toko2.tambahBarang(barang2);

        System.out.println(toko2.getInfo());
        System.out.println(barang2.getInfoBarang());

        Barang barang3 = new Barang("Computer", "Electronic", 13000000, 113);
        Admin admin3 = new Admin("User3", "0812808", 103, "Malang-Blok C");
        Toko toko3 = new Toko("Center-J3", "Blok-C 406", "000407");
        
        toko3.tambahAdmin(admin3);
        toko3.tambahBarang(barang3);

        System.out.println(toko3.getInfo());
        System.out.println(barang3.getInfoBarang());
        
    }
}
