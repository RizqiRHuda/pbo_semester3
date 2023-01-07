package pemrogramanberbasisobjek.w3_schools.abstract_class;

public abstract class Hewan {
    public String nama;

    public Hewan(String nama){
        this.nama = nama;
    }

    public abstract void bergerak();
    public String getInfo(){
        String info ="";
        info += "Nama " + this.nama;

        return info;
    }
    
}

abstract class Cat extends Hewan{
    public Cat(String nama){
        super(nama);
    }

    public String getInfo(){
        String info = "";
        info = super.nama;
        return info;
    }
}




