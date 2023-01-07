package pemrogramanberbasisobjek.randomtest.semester2.jobshet2;

public class Barang {
    String namaBarang;
    String jenisBarang;
    int stok;
    int hargaSatuan;

    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tampilBarang(){
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n){
        stok +=n;
    }

    void kurangiStok(int n){
       // stok -=n;
       if(stok > 0){
        stok -=n;
       }
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }

   int hitungDiskon(){
    int hargaTotal =0;
    int diskon=0;
    if(hargaTotal > 1000000){
        diskon *=0.1;
    }else if(hargaTotal >=500000 &&  hargaTotal <= 1000000){
        diskon *= 0.05;
    }
    return diskon;
   }

   int hitungHargaBayar(){
    return hitungHargaTotal(hargaSatuan) - hitungDiskon();
   }
}


class BarangMain{
    public static void main(String[] args) {
        Barang b1 = new Barang( "Corsair 2 GB",  "DDR", 250000, 10);
        // b1.namaBarang = "Corsair 2 GB";
        // b1.jenisBarang = "DDR";
        // b1.hargaSatuan = 250000;
        // b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = " + hargaTotal);
        int totalBayar = b1.hitungHargaBayar();
        System.out.println(totalBayar);
    }
}