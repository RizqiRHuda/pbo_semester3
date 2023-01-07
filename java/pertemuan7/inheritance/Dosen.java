package pemrogramanberbasisobjek.pertemuan7.inheritance;
import pemrogramanberbasisobjek.pertemuan7.testpackage.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;
    
    public Dosen(){
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";

        System.out.println(dosen1.getInfo());
    }
}
