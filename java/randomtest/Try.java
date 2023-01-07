package pemrogramanberbasisobjek.randomtest;

public class Try  implements Moveable{
    int a = 1;
 
    @Override
    public void moveUp() {
       int x =0;
       x +=1;
       System.out.println(x);
        
    }
    public void luas(){
        double luas = 0;
        luas = phi*3*3;
        System.out.println(luas);
    }
}

class Testing{
    public static void main(String[] args) {
        Try obj = new Try();
        obj.luas();
    }
}
