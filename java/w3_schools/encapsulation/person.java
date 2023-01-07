package pemrogramanberbasisobjek.w3_schools.encapsulation;

public class person {
    private String name;
    private int age;
    private String address;

    public person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        name = "jhon";
        this.name = "jhon";
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo(){
        String info = " ";
        info += "Nama\t: " + this.name + "\n";
        info += " Umur\t: " + this.age + "\n";
        info += " Alamat\t: " + this.address;

        return info;
    }

}
