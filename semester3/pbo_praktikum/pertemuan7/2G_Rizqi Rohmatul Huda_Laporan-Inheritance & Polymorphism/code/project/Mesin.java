package pemrogramanberbasisobjek.pertemuan7.project;

public class Mesin {
    public String jenis;
    public String nama;
    protected int no_seri;
    public double power;
    public int cc;
    protected int kecepatan;

    public Mesin(){
        System.out.println("Ini adalah mesin utama");
    }

    public Mesin(String jenis, String nama, int no_seri, double power, int cc, int kecepatan){
        this.jenis = jenis;
        this.nama = nama;
        this.no_seri = no_seri;
        this.power = power;
        this.cc = cc;
        this.kecepatan = kecepatan;
    }
    
    public String getInfo(){
        String info = "";
        info += "\n---------------------------------------\n";
        info += "Jenis \t\t\t: " + this.jenis + "\n";
        info += "Nama \t\t\t: " + this.nama + "\n";
        info += "No Seri \t\t: " + this.no_seri + "\n";
        info += "Tenaga mesin\t\t: " + this.power + "\n";
        
        return info;
    }
}

class Mesin2Silinder extends Mesin{
    public int gear;
    
    public Mesin2Silinder(){
        System.out.println("Ini adalah mesin 2 silinder");
    }

    public Mesin2Silinder(String jenis,  String nama, int no_seri, double power, int cc, int gear, int kecepatan){
        super(jenis, nama, no_seri, power, cc, kecepatan); //memanggil super() berparameter untuk membuat objecet parent class pada constructor class child class
        this.gear = gear;
    }

    public String getInfo(){

        String ability = "";
        ability += "Urutan gear\t\t: " + this.gear + "\n";
        ability += "Kecepatan\t\t: "   + this.kecepatan + "\n";
        ability +="Jumlah cc\t\t: " + this.cc;
        ability += "\n---------------------------------------";
       
        return ability;
    }

    public String  getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
