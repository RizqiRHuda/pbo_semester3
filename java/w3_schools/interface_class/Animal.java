package pemrogramanberbasisobjek.w3_schools.interface_class;

public interface Animal{
    public void animalSound();
    public void animalMove();
}

class Cat implements Animal{
    public void animalSound(){
        System.out.println("Miauw");
    }

    public void animalMove(){
        // int v=0;
        // int totalV=1;
        // String move = " ";
        // if(move.equals("berjalan")){
        //     System.out.println("kucing bergerak dengan berjalan" + "\ndengan kecepatan\n" + v);
        // }
        // else if(equals("berlari")){
        //     totalV = v + 30;
        //     System.out.println("kucing berlari dengan kecepatan " + totalV);
        // }
        System.out.println("kucing bergerak dengan berjalan dan berlari");
 
    }
}

class Main{
    public static void main(String[] args) {
        Cat kucing1 = new Cat();
        kucing1.animalSound();
        kucing1.animalMove();
        
    }
}
  
 