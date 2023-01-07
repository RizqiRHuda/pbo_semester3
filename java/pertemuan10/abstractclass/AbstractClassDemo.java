package pemrogramanberbasisobjek.pertemuan10.abstractclass;

public class AbstractClassDemo {
    public static void main(String[] args) {
    
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        Ular ular1 = new Ular(false, 0, null, null);
        ular1.isBerbisa = true;
        ular1.berat = 6.1;
        ular1.makanan = "tikus";
        ular1.habitat = "hutan";

        ular1.cetakInfo();
        ular1.bernapas();
        ular1.bergerak();
    }
}


