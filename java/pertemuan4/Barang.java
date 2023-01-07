package pemrogramanberbasisobjek.pertemuan4;

public class Barang {
    private String nama;
    private String jenis;
    private int harga;
    private int id;

    public Barang(String nama, String jenis, int harga, int id){
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.id = id;

    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfoBarang(){
        String info = "";
        info +="-------------------\n";
        info +="Data barang\t: \n";
        info +="Nama barang\t\t: " + this.nama + "\n";
        info +="Jenis barang\t\t: " + this.jenis + "\n";
        info +="Harga barang @\t\t: " + this.harga + "\n";
        info +="Id barang\t\t: " + this.id + "\n";
        info +="\n=================================\n";

        return info;
    }

}
