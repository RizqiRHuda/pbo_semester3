package pemrogramanberbasisobjek.pertemuan10.abstractclass;

public class Lebah extends Hewan {
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat){
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }
    
    @Override
    public void bernapas(){
        System.out.println("Otot perut mengundur, udara masuk melalui hidung di segmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("Otot perut berkonstraksi, udara dikeluarkan");
    }

    @Override
    public void bergerak(){
        System.out.println("Mendapatkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang");
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kasta\t: " + this.kasta);
    }
}
