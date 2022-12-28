package pemrogramanberbasisobjek.pertemuan2;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
    m1.nim = "023432";
    m1.nama = "Yansy Ayuningtyas";
    m1.alamat = "Nias, Sumatera Utara";
    m1.kelas = "2A";

    Mahasiswa m2 = new Mahasiswa();
    m2.nim = "2141720264";
    m2.nama = "Rizqi Rohmatul Huda";
    m2.alamat = "Blitar, Jawa Timur";
    m2.kelas = "2G";

    Mahasiswa m3 = new Mahasiswa();
    m3.nim = "2141404003";
    m3.nama = "Cahyadi Galih";
    m3.alamat = "Yogyakarta, D.I Yogyakarta";
    m3.kelas = "2H";
    
    m1.displayBiodata();
    System.out.println();
    m2.displayBiodata();
    System.out.println();
    m3.displayBiodata();
    }
}
