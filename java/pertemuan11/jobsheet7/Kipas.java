package pemrogramanberbasisobjek.pertemuan11.jobsheet7;

public class Kipas extends AlatElektronnik {
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenis = jenis;

    }
    
    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


    // Method getInfo() class Kipas
    public String getInfo(){
        String info = "";
        info += "\n---------------- Kipas ----------------\n";
        info += super.getInfo();
        info += "Jenis\t\t: " + this.jenis;
        info += "\n---------------------------------------\n";
        return info;
    }
}



