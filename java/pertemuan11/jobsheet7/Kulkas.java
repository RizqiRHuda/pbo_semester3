package pemrogramanberbasisobjek.pertemuan11.jobsheet7;

public class Kulkas extends AlatElektronnik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
        System.out.println("---------------- Kulkas ----------------\n");
    }

    public int getJumlahPintu() {
        return this.jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

// Method getInfo() class Kulkas
    public String getInfo(){
        String info = "";
        info += super.getInfo();
        info += "Jumlah pintu\t: " + this.jumlahPintu + "\n";
   
        return info;
    }

}

class SmartFridge extends Kulkas implements Audible{
    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk){
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
        System.out.println( "---------------- SmartFridge ----------------");
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
        System.out.println("---------------------------------------------\n");
    }

// Method getInfo() class SmartFridge
    public String getInfo(){
        String info = "";
        info += super.getInfo();
        info += "Volume\t\t: " + this.volume ;
      
        return info;
    }
}
