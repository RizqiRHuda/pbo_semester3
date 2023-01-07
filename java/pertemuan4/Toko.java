package pemrogramanberbasisobjek.pertemuan4;
import java.util.ArrayList;

public class Toko {
    private String nama;
    private String alamat;
    private String contact;

    private ArrayList<Admin> listAdmin;//mendeklarasikan bahwa listAdmin bertipe Arraylist atau kumpulan dari admin2

    private ArrayList<Barang> listBarang;

    public Toko (String nama, String alamat, String contact){
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.listAdmin = new ArrayList<>();//menginstansiasi tempat arraylist yang akan diisi 
        this.listBarang = new ArrayList<>();

    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getInfoToko() {
        return nama + alamat + contact;
    }

    public void tambahBarang(Barang barang){
        listBarang.add(barang);
    }

    public void tambahAdmin(Admin admin){
        listAdmin.add(admin);
    }
   
     public String getInfo () {
        String info = "";
        info +="--------------------------------------\n";
        info += "Nama Toko\t\t: " + this.nama + "\n";
        info += "Contact\t\t\t: " + this.contact + "\n";
        //info += "\n";
        info +="--------------------------------------\n";

        if (!listAdmin.isEmpty() ) {
            info += "Data admin  : \n";
            info +="\n";

            for (Admin a : listAdmin ){//untuk setiap objek a bertipe admin di dalam list admin 
                info += a.getDataAdmin();
            }
        }

        else {
            info += " ";
        }

        info +="\n";
        return info;
    }
   
}
