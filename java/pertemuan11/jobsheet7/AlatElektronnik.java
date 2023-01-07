package pemrogramanberbasisobjek.pertemuan11.jobsheet7;

public class AlatElektronnik {
    private double harga;
    private String warna;
    private String merk;

    public AlatElektronnik(double harga, String warna, String merk){
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Method getInfo class Elektronik
    public String getInfo(){
        String info = "";
        info += "Harga\t\t: " + this.harga + "\n";
        info += "Warna\t\t: " + this.warna + "\n";
        info += "Merk\t\t: " + this.merk + "\n";
        return info;
    }

}

