package pemrogramanberbasisobjek.pertemuan7.project;

public class MesinDemo {
    public static void main(String[] args) {
        Mesin2Silinder mesin2s = new Mesin2Silinder("Motor","Rx-King",21019, 9.9, 135, 4, 100);
        Mesin2Silinder mesin3s = new Mesin2Silinder("Motor","250 FI",303404, 1.1, 250, 5, 180);

          System.out.println(mesin2s.getAllInfo());
          System.out.println(mesin3s.getAllInfo());
    }
}

