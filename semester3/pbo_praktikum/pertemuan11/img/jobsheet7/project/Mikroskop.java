package pemrogramanberbasisobjek.pertemuan11.project;

import java.text.DecimalFormat;

public class Mikroskop extends AlatOptik implements Serviceable {
    public String lensa;
    public double s;// s = jarak benda
    public double f;// f = titik fokus

    public Mikroskop(String lensa, double s, double f, String nama, String warna, String merk, int harga,
            String fungsi) {
        super(nama, warna, merk, harga, fungsi);
        this.lensa = lensa;
        this.s = s;
        this.f = f;
    }

    public String menggunakanAlat() {
        String steps = "";
        steps += "------------------------------------------------------------------------------------------------\n";
        steps += "Cara menggunkan Mikroskop: \n";
        steps += "1. Peganglah lengan mikroskop dengan salah satu tangan dan tangan lain menyangga kaki mikroskop\n";
        steps += "2. Memasangkan lensa okuler dengan pembesaran lemah\n";
        steps += "3. Putar cermin mikroskop ke arah sumber cahaya untuk mendapatkan bidang pandang yang sesuai\n";
        steps += "4. Letakkan benda uji yang akan diamati pada meja mikroskop dan klem dengan pinset\n";
        steps += "5. Lakukan pembesaran sampai objek terlihat jelas\n";
        steps += "6. Jika sudah selesai bersihkan mikroskop dan tempatkan pada lemari";
        steps += "\n------------------------------------------------------------------------------------------------\n";
        return steps;
    }

    public void hitungPerbesaran(int opsi, double sb) {
        // M = (s`/s)*(25/f + 1) / M = (s`/s)*(25/f)
        double hasil = 1; // M
        if (opsi == 1) {
            hasil = (s / sb) * (25 / f + 1);
            DecimalFormat dFormat = new DecimalFormat("#.##");
            System.out.println("Hasil perbesaran dengan berakomodasi maximun : " + dFormat.format(hasil) + "\n");
        } else if (opsi == 2) {
            hasil = (s / sb) * (25 / f);
            System.out.println("Hasil perbesaran dengan tidak berakomodasi : " + String.format("%.2f", hasil) + "\n");
        }

    }

    public String cetakInfo() {
        String info = " ";
        info += super.cetakInfo() + "\n";
        info += "Lensa\t: " + this.lensa + "\n";
        info += this.menggunakanAlat() + "\n";

        return info;
    }

    public void service() {
        System.out.println("\n------- Service Alat Optik -------\n");
        System.out.println("1. Mengecek seluruh kondisi alat");
        System.out.println("2. Melakukan perbaikan");
        System.out.println("\n-----------------------------------");
    }

    public void repair(int a) {
        System.out.println("\n------- Repair Alat Optik -------\n");

        String idx[] = new String[3];
        int index[] = new int[3];
        String parts[] = new String[3];
        int harga[] = new int[3];

        System.out.println("Memperbaiki dan mengganti bagian alat yang rusak");
        parts[0] = "Lensa Okuler";
        parts[1] = "Lensa Objektif";
        parts[2] = "Kondensor";

        harga[0] = 100000;
        harga[1] = 120000;
        harga[2] = 50000;

        for (int i = 0; i < parts.length; i++) {
            idx[i] = parts[a];
        }

        for (int i = 0; i < harga.length; i++) {
            index[i] = harga[a];
        }
        System.out.println("Kerusakan\t\t: " + parts[a]);
        System.out.println("Ongkos perbaikan alat    : " + harga[a]);
        System.out.println("\n-----------------------------------");
    }

}
