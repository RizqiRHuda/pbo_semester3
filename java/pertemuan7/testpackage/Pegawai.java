package pemrogramanberbasisobjek.pertemuan7.testpackage;

public class Pegawai {
    public String nip;
    public String nama;
    protected double gaji;

    public Pegawai(){
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo(){
        String info = "";
        info += "NIP\t\t\t\t: " + nip + "\n";
        info += "Nama\t\t\t\t: " + nama + "\n";
        info += "Gaji\t\t\t\t: " + gaji + "\n";

        return info;
    }
}
