package pemrogramanberbasisobjek.w3_schools.inheritance;



public class Mesin {
    public int kecepatan;
    public int gear;

    Mesin(int kecepatan, int gear){
        this.kecepatan = kecepatan;
        this.gear = gear;

    }

    public void increaseSpeed(int gear, int v){
        
        int hasil = 0;
        kecepatan +=v;
        if(gear == 1){
            hasil = 30;
            if(kecepatan < hasil){
                System.out.println(kecepatan + " : gear 1");
            }
            else if(kecepatan > hasil){
                System.out.println("melebihi kecepatan max : " + hasil);
            }
        }
        if(gear == 2){
            hasil = 30;
            if(kecepatan < hasil){
                System.out.println(kecepatan + " : gear 1");
            }
            else if(kecepatan > hasil){
                System.out.println("melebihi kecepatan max : " + hasil);
            }
        }

    } 

    public int decreaseSpeed(){

        return 1;
    }
}

class Mesin2Silinder extends Mesin{

    int kecepatan, gear;
  Mesin2Silinder(int kecepatan, int gear){
    super(kecepatan, gear);
  }


}
