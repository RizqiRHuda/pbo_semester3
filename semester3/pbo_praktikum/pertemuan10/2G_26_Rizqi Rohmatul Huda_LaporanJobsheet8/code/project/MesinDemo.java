package pemrogramanberbasisobjek.pertemuan10.project;

public class MesinDemo {
    public static void main(String[] args) {
        Mesin2Silinder mesin1 = new Mesin2Silinder(3, "Motor2Silinder", "Rx-King", 21109, 9.9, 135,
        60, 120);
        System.out.println(mesin1.getInfo());

        System.out.println("``````````````\t\t\t\t`````````````\n");

        Generator generator1 = new Generator("Air", 100000, 30, "Generator", "Generator-DC", 405978, 9999, 
        100000, 10000, 1000);
        System.out.println(generator1.getInfo());
    }
}

