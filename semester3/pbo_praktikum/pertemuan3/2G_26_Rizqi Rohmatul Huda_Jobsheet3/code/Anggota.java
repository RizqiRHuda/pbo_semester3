package pemrogramanberbasisobjek.pertemuan3;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjam;
    private int jumlahPinjam;

    public Anggota(String noKTP, String nama, int limitPinjam){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    

    public String getNoKTP() {
        return this.noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjam() {
        /*if(jumlahPinjam > 5000000){
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        } */
        return limitPinjam;
    }

    public void setLimitPinjam(int limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public int getJumlahPinjam() {
        return this.jumlahPinjam;
    }
    /* 
     *   public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }
    */
  

    public void pinjam(int tambahanPinjaman){
        if(tambahanPinjaman <= limitPinjam){
            jumlahPinjam = jumlahPinjam + tambahanPinjaman;
        }
       else {
        System.out.println("Maaf jumlah pinjaman melebihi limit");
       }
        //return jumlahPinjam;
    }

    public int angsur(int angsuran){
        if(angsuran>=(jumlahPinjam*0.1)){
            jumlahPinjam -= angsuran;
        }else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
        return jumlahPinjam;
    }  
}
