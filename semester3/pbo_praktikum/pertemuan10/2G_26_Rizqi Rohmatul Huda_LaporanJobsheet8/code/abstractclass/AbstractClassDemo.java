package pemrogramanberbasisobjek.pertemuan10.abstractclass;

public class AbstractClassDemo {
    public static void main(String[] args) {
    
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();
    }
}


