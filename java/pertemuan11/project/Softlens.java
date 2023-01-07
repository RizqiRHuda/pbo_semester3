package pemrogramanberbasisobjek.pertemuan11.project;

public class Softlens extends AlatOptik {
    public double diameter;

    public Softlens(double diamater, String nama, String warna, String merk, int harga, String fungsi){
        super(nama, warna, merk, harga, fungsi);
        this.diameter = diamater;
    }

    public String menggunakanAlat() {
        String steps = "";
        steps += "1. Membersihkan tangan sebelum mengambil softlens\n";
        steps += "2. Menggoyangkan lensa perlahan dari wadah lensa agar tidak menempel\n";
        steps += "3. Membersihkan lensa dengan cairan pembersih softlens pada saat digunakan mata lebih nyaman dan terhindar dari infeksi\n";
        steps += "4. Memastikan lensa dalam keadaan bagus dan tidak rusak\n";
        steps += "5. Berdiri di depan cermin, kemudian membuka mata dengan cara menarik kelopak mata atas dengan jari tangan kiri\n";
        steps += "6. Menarik kelopak mata bawah dengan jari tengah kanan dan pasangkan soflens\n";
        steps += "7. Menutup mata secara perlahan dan memutar bola mata agar lensa mata agar lensa terpasang sempurna\n";
        steps += "8. Bila softlens sudah terpasang sempurna, silahkan membuka mata\n";
        steps += "\n==================================================================================\n";

        return steps;
    }

    public String cetakInfo(){
        String info = "";
        info += super.cetakInfo();
        info += "Diameter Softlens\t: " + this.diameter + "\n";
        info += "\n" + "Cara menggunakan Softlen: \n" + this.menggunakanAlat();

        return info;
    }
}
