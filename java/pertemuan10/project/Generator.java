package pemrogramanberbasisobjek.pertemuan10.project;

public class Generator extends Mesin {
    public String place;
    public int eAir;
    public int h;

    public Generator(String place, int eAir, int h ,String jenis,  String nama, int no_seri, double power, int cc, int kecepatan, int massa){
        super(jenis, nama, no_seri, power, cc, kecepatan, massa);
        this.place = place;
        this.eAir = eAir;
        this.h = h;
    }

    
    public String startMachine(){
        String status="";
        if(eAir > 10000  && kecepatan >0){
            status +="Turbin berputar, mesin on";
        }else{
            status +="Tambah debit air";
        }
        return status;
    }

    public double produceEnergy(){
        int energi = 1;

        if(eAir > 10000 && eAir <1000000){
            energi = eAir*h;
        }else if(eAir > 1000000){
            System.out.println("Tambah jumlah Turbin, debit air terlalu besar");

        }else{
            System.out.println("Debit air terlalu kecil");
        }
        
        return energi;
    }

    public String getInfo(){
        String info = "";
        info += super.getInfo();
        info += " Elemen Generator\t: " + this.place + "\n";
        info += "\n Status Mesin\t\t: " + this.startMachine();
        info += "\n Jumlah Energi\t\t: " + this.produceEnergy();
        info +="\n-----------------------------------------------------";
        
        return info;
    }
}

