package pemrogramanberbasisobjek.pertemuan3;
/* 
  public class Motor {
    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);
        if(isMesinOn) {
            System.out.println("Mesin On");
        }
        else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=====================");
    }

}
*/


  public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        if(isMesinOn) {
            System.out.println("Mesin On");
        }
        else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=====================");
    }
    

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public String getPlatNomor(){
        return platNomor;
    }
    public void  setIsMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;
    }
    public boolean getIsMesinOn(){
        return isMesinOn;
    }
    public void setKecepatan(int kecepatan){
        //5.  Ubah class Motor sehingga kecepatan nya tidak boleh nilai negative!
        if(kecepatan < 0){
            System.out.println("Kecepatan tidak boleh bernilai negatif");
            return;
        }
        if(!this.isMesinOn && kecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            if(kecepatan > 100){
                System.out.println("Kecepatan tidak boleh lebih dari 100");
            }
            this.kecepatan = kecepatan;
        }  
    }
    public int getKecepatan(){
        return kecepatan;
    }
}
/* 
 public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;


	public String getPlatNomor() {
		return this.platNomor;
	}

	public void setPlatNomor(String platNomor) {
		this.platNomor = platNomor;
	}

	public boolean isIsMesinOn() {
		return this.isMesinOn;
	}

	public void setIsMesinOn(boolean isMesinOn) {
		this.isMesinOn = isMesinOn;
	}

	public int getKecepatan() {
		return this.kecepatan;
	}

	public void setKecepatan(int kecepatan) {
		this.kecepatan = kecepatan;
	}

    
}
*/



