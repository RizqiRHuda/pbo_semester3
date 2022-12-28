package pemrogramanberbasisobjek.pertemuan11.project;

public class Motor implements Serviceable {
    public String jenis;
    public String no_seri;
    public int cc;
    public String warna;
    public int vMax;

    public int kecepatan;
    public int gear;

    public Motor(String jenis, int cc, String no_seri, String warna, int vMax/* , int kecepatan ,int gear*/) {
        this.jenis = jenis;
        this.cc = cc;
        this.no_seri = no_seri;
        this.warna = warna;
        this.vMax = vMax;
    }

    public Motor(int kecepatan, int gear) {
        this.kecepatan = kecepatan;
        this.gear = gear;
    }
    
    public String getInfo() {
        String info = "\n";
        info += "-------------- Data Motor -------------------\n";
        info += "Jenis\t\t\t: " + this.jenis + "\n";
        info += "Jumlah Cc\t\t: " + this.cc + "\n";
        info += "Nomor Plat\t\t: " + this.no_seri + "\n";
        info += "Warna\t\t\t: " + this.warna + "\n";
        info += "Kecepatan Maximum\t: " + this.vMax + "\n";
        info += "Posisi Gear ke : " + this.gear;
        info += "\n----------------------------------------";
        return info;
    }

    public void tambahKecepatan(int increment){
        kecepatan +=increment;
        System.out.println("Kecepatan setelah ditambah: " + kecepatan + " km/h");
    }

    public void kurangiKecepatan(int decrement){
        kecepatan -=decrement;
        System.out.println("Kecepatan setelah dikurangi: " + kecepatan + " km/h\n");
    }

    public void service() {
        System.out.println("\n--------------------- Service Motor -----------------\n");
        System.out.println("1. Mengecek seluruh kondisi alat");
        System.out.println("2. Melakukan perbaikan");
        System.out.println("\n---------------------------------------------------");
    }

    public void repair(int a) {
        System.out.println("\n--------------------- Repair Motor -----------------\n");
        String idx[] = new String[3];
        int index[] = new int[3];
        String parts[] = new String[3];
        int harga[] = new int[3];

        System.out.println("Memperbaiki dan mengganti bagian mesin motor yang rusak");
        parts[0] = "Piston";
        parts[1] = "Gear";
        parts[2] = "Cylinder Head";

        harga[0] = 1000000;
        harga[1] = 600000;
        harga[2] = 850000;

        for (int i = 0; i < parts.length; i++) {
            idx[i] = parts[a];
        }

        for (int i = 0; i < harga.length; i++) {
            index[i] = harga[a];
        }
        System.out.println("Kerusakan\t\t: " + parts[a]);
        System.out.println("Ongkos perbaikan\t: " + harga[a]);
        System.out.println("\n---------------------------------------------------");

    }

}

