package pemrogramanberbasisobjek.pertemuan10.project;

public abstract class Mesin {
    public String jenis;
    public String nama;
    public int no_seri;
    public double power;
    public int cc;
    public int kecepatan;
    public int massa;

    public Mesin(String jenis, String nama, int no_seri, double power, int cc, int kecepatan, int massa){
        this.jenis = jenis;
        this.nama = nama;
        this.no_seri = no_seri;
        this.power = power;
        this.cc = cc;
        this.kecepatan = kecepatan;
        this.massa = massa;
    }

    public abstract String startMachine();
    public abstract double produceEnergy();

    public String getInfo(){
        String info = " ";
        info +="-----------------------------------------------------\n";
        info +=" Jenis \t\t\t: " + this.jenis + "\n";
        info +=" Nama \t\t\t: " + this.nama + "\n";
        info +=" No-Seri \t\t: " + this.no_seri + "\n";
        info +=" Tenaga Mesin\t\t: " + this.power + "\n";
        info +=" Massa\t\t\t: " + this.massa + "\n";
        info +=" Kecepatan\t\t: " + this.kecepatan + "\n";

        return info;
    }
}


