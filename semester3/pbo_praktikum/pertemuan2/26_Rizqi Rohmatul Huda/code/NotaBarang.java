package pemrogramanberbasisobjek.pertemuan2;

public class NotaBarang {
    public String namaBarang, jenisBarang;
    public int jumlah,harga;
    public double totalHarga;

    public void displayBarang () {
        System.out.println("Nama barang\t: " + namaBarang);
        System.out.println("Jenis barang\t: " + jenisBarang);
        System.out.println("Jumlah barang\t" + jumlah);
        System.out.println("Harga satuan\t: " + harga);
        System.out.println("Total bayar : " + getBayar());
    }

    public double getDiskon(){
        double diskon = 0;
        totalHarga = jumlah*harga;    
        if(totalHarga >= 1000000){
            diskon = totalHarga*0.025;
        }
        else if(totalHarga >= 500000 && totalHarga < 1000000){
           diskon =totalHarga* 0.01;
        }
        return diskon;
    }

    public double getBayar(){
        double bayar = totalHarga - getDiskon();
        return bayar;
    }
}
