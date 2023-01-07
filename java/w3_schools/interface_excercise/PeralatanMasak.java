package pemrogramanberbasisobjek.w3_schools.interface_excercise;

import java.util.Scanner;

public abstract class PeralatanMasak {
   public String nama;
   public String merk;
   
   public PeralatanMasak(String nama, String merk){
    this.nama = nama;
    this.merk = merk;
   }

   public abstract void tampilMenggunakan(boolean isOn);
   public String getInfo(){
    String info = "";

    return info;
   }

}

class KomporListrik extends PeralatanMasak{
    public int  burnerBody;

    public KomporListrik(int burnerBody,String nama, String merk){
        super(nama, merk);
        this.burnerBody = burnerBody;
    }

    public void tampilMenggunakan(boolean isOn){
       if(isOn == true){
        System.out.println("green");
        System.out.println("1. Kompor telah terhubung sumber listrik");
        System.out.println("2. Kompor siap digunakan!");
       }else{
        System.out.println("silahkan hubungkan stop kontak pada sumber listrik");
       }
    }

    public void tampilMenggunakan(int random){
        
    }

    // public void turnOffAutomatically(){
        
    // }

    public String getInfo(){
        String info = "";

        info += super.getInfo();
        info += "Jumlah Burner Body : " + this.burnerBody + "\n";
        return info;
    }

    public void shutOffOtomatis(double t){
        if(t > 110){
        tampilMenggunakan(false);
        }
    }

    public void protectTools(int [] a){
     int arr[] = {1,2,3};
    
        if(arr[0] == a[0] && arr[1] == a[1] && arr[2] == a[2]){
            System.out.println("OKEE");
        }else{
            System.out.println("Kleru Masseh");
        }
  
    }

}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KomporListrik komporListrik = new KomporListrik(0, null, null);
        komporListrik.tampilMenggunakan(true);
        System.out.print("Password : \n");

        int idx[] = new int[3];
        for(int i = 0; i<3; i++){
            System.out.print("[");
            idx[i] = sc.nextInt();
       
        }
       
        komporListrik.shutOffOtomatis(111);
        komporListrik.protectTools(idx);
  

        sc.close();
    }
}


    //  if(arr[i] == a[i]){
    //     System.out.println("Password :" + idx[i]);
      
    //    }else if(arr[i] != a[i]){
        
    //    }