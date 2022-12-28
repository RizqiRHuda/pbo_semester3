package pemrogramanberbasisobjek.pertemuan7;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

  //  public Pegawai(){
  //      System.out.println("Objek dari class Pegawai dibuat");
  //  }

  public Pegawai(String nip, String nama, double gaji){
    this.nip = nip;
    this.nama = nama;
    this.gaji = gaji;
  }

    public String getInfo(){
        String info = "";
        info += "NIP\t\t\t\t: " + nip + "\n";
        info += "Nama\t\t\t\t: " + nama + "\n";
        info += "Gaji\t\t\t\t: " + gaji + "\n";

        return info;
    }
}

class Dosen extends Pegawai{
    public String nidn;
    
    public Dosen(String nip, String nama, double gaji, String nidn){
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public String getInfo(){
        return "NIDN\t\t\t: " + this.nidn + "\n";
    }
  
    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
 
 

