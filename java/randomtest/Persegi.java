package pemrogramanberbasisobjek.randomtest;

public class Persegi {
    public int sisi;

    public void displayPersegi(){
        System.out.println("Panjang sisi persegi : " + sisi);
    }

    public int luasPersegi(){
        return sisi*sisi;
    }
    public int kelilingPersegi(){
        return 4*sisi;
    }
}
