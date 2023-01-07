# Interface Java
----
### Interface adalah sebuah blue print dari kelas yang memiliki konstanta statis dan method abstrak.

#### Memiliki method dan variable abstrak
#### Di-representasikan menggunakan is-A

## Mengapa menggunakan Interface ?
1. Digunakan untuk menciptakan abstraksi
2. Dengan menggunakan interface dapat mendukung fungsi dari pewarisan berganda
3. it can be used to achieve loose coupling

## Deklarasi Interface
--> Menggunakan kata kunci **interface**
#
Memberikan abstraksi total artinya semua method dideklarasikan dengan badan kosong dan semua bidang bersifat public, static, dan final secara default.
#
Subclass harus mengimplementasikan semua method dari kelas yang telah diinterface


public class test {
    static int kecepatan = 0;//operasi yg dilakukan tetap digunakan meskipun gear berubah
    // public int gear = 0;
    static int currentGear = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g, v;
        char opsi = 'y';
        do{
            System.out.println("gear : ");
            g = sc.nextInt();
            System.out.println("kecepatan : ");
            v = sc.nextInt();
            // System.out.println(menambahKecepatan(g,v));
            menambahKecepatan(g,v);
            System.out.println("up gear?y/t");
            opsi = sc.next().charAt(0);
        }while(opsi == 'y' || opsi == 't');
        // mengurangiKecepatan(g, v);
        // System.out.println("gear : ");
        // g = sc.nextInt();
        // System.out.println("kecepatan : ");
        // v = sc.nextInt();

        sc.close();

    }

    static void menambahKecepatan(int gear, int v) {
        // int temp1 = 0;
        // int temp2 = 0;

        int hasil = 0;
        
        kecepatan += v;

        if (gear < currentGear) {
            switch(gear) {
                  case 1 :
                        kecepatan -= 15;
                        break;
                  case 2 :
                        kecepatan -= 10;
                        break;
                  case 3 :
                        kecepatan -= 7;
                        break;
                  case 4 :
                        kecepatan -= 5;
                        break;
            }
        }

        if (gear == 1) {
            hasil = 40;
            if (kecepatan < hasil) {
                // kecepatan = v;
                System.out.println(kecepatan + " : Gear  1");
        

            } else if (kecepatan > 40) {
                System.out.println("Melebihi : " + hasil);
            }
        }
        if (gear == 2) {
            hasil = 60;
            // temp2 = kecepatan + temp1;
            if (kecepatan < hasil) {
                System.out.println(kecepatan + " : Gear 2");
            } else if (kecepatan > hasil /*&& kecepatan > hasil*/) {
                System.out.println("Melebihi : " + hasil);
            }
        }

        if(gear == 3){
            hasil = 80;
            if(kecepatan < hasil){
                System.out.println(kecepatan + " : Gear 3");
            } else if(kecepatan > hasil){
                System.out.println("Melebihi : " + hasil);
            }
        }

        if(gear == 4){
            hasil = 110;
            if(kecepatan < hasil){
                System.out.println(kecepatan + " : Gear 4");
            } else if(kecepatan > hasil){
                System.out.println("Melebihi : " + hasil);
            }
        }

        if(gear == 5){
            hasil = 150;
            if(kecepatan < hasil){
                System.out.println(kecepatan + " : Gear 5");
            } else if(kecepatan > hasil){
                System.out.println("Melebihi : " + hasil);
            }
        }

        currentGear += gear;
        // return hasil;

    }

    // static void mengurangiKecepatan(int gear, int v){
    //     //int hasil = 0;
    //     //kecepatan -=v;
    //     if(gear < currentGear){
    //         kecepatan -=15;
    //        // System.out.println(kecepatan);
    //     }
    //     // else{
    //     //     System.out.println(hasil);
    //     // }
    //     currentGear -=gear;

   

    // }

}
