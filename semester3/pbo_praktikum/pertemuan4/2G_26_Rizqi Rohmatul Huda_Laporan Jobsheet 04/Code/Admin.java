package pemrogramanberbasisobjek.pertemuan4;

public class Admin {
    private String nama;
    private int id;
    private String contact;
    private String alamat;
 
    public Admin(String nama, String contact, int id, String alamat){
        this.nama = nama;
        this.contact = contact;
        this.id = id;
        this.alamat = alamat;

    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    public String getDataAdmin(){
        String info = "";
        info +="Nama Admin\t\t: " + this.nama + "\n";
        info +="Contact\t\t\t: " + this.contact + "\n";
        info +="Alamat Admin\t\t: " + this.alamat + "\n";
        info +="Id Admin\t\t: " + this.id;

        return info;
    }

}
