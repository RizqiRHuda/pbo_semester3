package pemrogramanberbasisobjek;

public class Animal {
    protected String kind = "Carnivora";
    protected String kind2 = "Herbivora";
    protected int kecepatan;
    public void meal(){
        System.out.println("Grasses");
    }
    public void sound(){
        System.out.println("Rrrr, rrr");
    }

    public int tambahKecepatan(int kecepatan, int increment){
        kecepatan +=increment;
        return kecepatan;
    }

}

class Cat extends Animal{
    private String modelName = "Maincoon";
    public static void main(String[] args) {
        // Membuat objek dari kucing
        Cat myCat = new Cat();
        //Memanggil method sound dari class hewan  pada kucing
        myCat.sound();
        System.out.println(myCat.kind + " " + myCat.modelName);
        System.out.println(myCat.tambahKecepatan(3, 5));
    }
}

class Cow extends Animal{
    private String modelName = "Australia";
    public static void main(String[] args) {
        Cow mycow = new Cow();
        mycow.meal();
        System.out.println(mycow.kind2 + " " + mycow.modelName);
    }
}
