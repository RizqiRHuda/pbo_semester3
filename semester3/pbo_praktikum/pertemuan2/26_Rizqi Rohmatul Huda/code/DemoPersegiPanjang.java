package pemrogramanberbasisobjek.pertemuan2;
public class DemoPersegiPanjang {

    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 8;

        pp1.displayInfo();

        System.out.println("Luas persegi panjang\t: " + pp1.getLuas());
        System.out.println("Keliling Persegi panjang: " + pp1.getKeliling());
    }
}
