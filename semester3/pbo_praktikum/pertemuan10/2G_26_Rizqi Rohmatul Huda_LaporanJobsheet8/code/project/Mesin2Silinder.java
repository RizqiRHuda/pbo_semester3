package pemrogramanberbasisobjek.pertemuan10.project;

public class Mesin2Silinder extends Mesin {
    public int gear;

    public Mesin2Silinder(int gear, String jenis,  String nama, int no_seri, double power, int cc, int kecepatan, int massa){
       super(jenis, nama, no_seri, power, cc, kecepatan, massa);
       this.gear = gear;
    }
  
    public String startMachine(){
        String status="";
        if(gear >= 0 && gear < 7){
            if(gear == 0 && kecepatan == 0){
                status += "Mesin mati, Silahkan putar kunci pada posisi on!";
            }
            else if(gear > 0 && kecepatan ==0){
                status +="Mesin On";
            }else if(gear > 0 && kecepatan !=0){
                status +="Mesin On, Bergerak";
            }
            
        }else{
            status +="Periksa kembali kondisi motor";
        }
        return status;
    }

    public double produceEnergy(){
        //Ek = 1/2*m*v*v  
        double energi = 1;
        if(gear > 0 && gear < 7){
            energi = (0.5)*kecepatan*kecepatan*massa;
        }else{
            return 0;
        }
        return energi;
    }

    public String getInfo(){
        String info = "";
        info += super.getInfo();
        info += "\n Status Mesin\t\t: " + this.startMachine();
        info += "\n Jumlah Energi\t\t: " + this.produceEnergy();
        info += "\n Gear\t\t\t: " + this.gear + "\n";
        info +="-----------------------------------------------------\n\n";
        return info;
    }
}
