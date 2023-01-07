package pemrogramanberbasisobjek.randomtest;

public class DemoPersegi {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        Persegi p2 = new Persegi();

        p.sisi = 4;
        p2.sisi = 6;
        p.displayPersegi();
        p2.displayPersegi();
        System.out.println("Luas persegi : " + p.luasPersegi());
        System.out.println("Keliling persegi : " + p.kelilingPersegi());
        System.out.println();
        System.out.println("Luas persegi : " + p2.luasPersegi());
        System.out.println("Keliling persegi : " + p2.kelilingPersegi());
    }
}
