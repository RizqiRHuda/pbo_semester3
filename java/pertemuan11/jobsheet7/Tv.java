package pemrogramanberbasisobjek.pertemuan11.jobsheet7;

public class Tv extends AlatElektronnik implements Audible {
    private String jenisLayar;
    private int volume;

    public String getJenisLayar() {
        return this.jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Tv(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment){
        volume += increment;
        System.out.println("\nMenaikan volume menjadi : " + volume);
    }

    @Override
    public void turunkanVolume(int decrement){
        volume -=decrement;
        System.out.println("Menurunkan volume menjadi : " + volume);
        System.out.println("---------------------------------------\n");
    }


// Method getInfo() class Tv
    public String getInfo(){
        String info = "";
        info += "---------------- TV ----------------\n";
        info += super.getInfo();
        info +="Jenis layar\t: " + this.jenisLayar + "\n";
        info +="Volume\t\t: " + this.volume;
    
        return info;
    }

}
