package pemrogramanberbasisobjek.pertemuan2;

public class PersegiPanjang {
    public int panjang, lebar;
    public double disc;

    public void displayInfo(){
        System.out.println("Panjang\t: " + panjang);
        System.out.println("Lebar\t: " + lebar);
        System.out.println();
    }

    public int getLuas(){
        return panjang*lebar;
    }
    
    public int getKeliling(){
        return (2*panjang) + (2*lebar);
    }

   
}
