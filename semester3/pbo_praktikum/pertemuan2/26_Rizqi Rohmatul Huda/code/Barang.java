package pemrogramanberbasisobjek.pertemuan2;

public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih(){
        return hargaKotor -diskon * hargaKotor;
    }
    
    public void displayInfo(){
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Harga kotor\t: " + hargaKotor);
        System.out.println("Diskon\t\t: " + diskon);
        System.out.println("Harga Bersih\t: " + getHargaBersih());
    }
}
