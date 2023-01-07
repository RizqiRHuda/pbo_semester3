package pemrogramanberbasisobjek.pertemuan11.jobsheet7;

public class DemoElektronik {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("kipas", 230000, "putih", "Maspion");
        System.out.println(kipas.getInfo());
    
        Tv tv = new Tv("OLED", 30, 6500000, "Hitam", "LG");
        System.out.println(tv.getInfo());
        tv.naikkanVolume(3);
        tv.turunkanVolume(5);
   
        Kulkas kulkas = new Kulkas(2, 5000000 , "Putih", "Samsung");
        System.out.println(kulkas.getInfo());
  
        SmartFridge smartFridge = new SmartFridge(45, 4, 10000000, "Grey", "Samsung");
        System.out.println(smartFridge.getInfo());
        smartFridge.naikkanVolume(3);
        smartFridge.turunkanVolume(5);
    }
}
