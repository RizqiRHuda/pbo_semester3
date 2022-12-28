package pemrogramanberbasisobjek.pertemuan11.project;

public abstract class AlatOptik {
    public String nama;
    public String fungsi;
    public String merk;
    public String warna;
    public int harga;

    public AlatOptik(String nama, String warna, String merk, int harga, String fungsi){
        this.nama = nama;
        this.warna = warna;
        this.merk = merk;
        this.harga = harga;
        this.fungsi = fungsi;
    }

    public abstract String menggunakanAlat();
    
    public String cetakInfo(){
        String info = "" + "\n";
        info += "Nama\t: " + this.nama + "\n";
        info += "Warna\t: " + this.warna + "\n";
        info += "Merk\t: " + this.merk + "\n";
        info += "Harga\t: " + this.harga + "\n";
        info += "Fungsi\t: " + this.fungsi + "\n";
        return info;
    }
}
