package pemrogramanberbasisobjek.w3_schools.abstract_class;

public class Second {
    public static void main(String[] args) {
      Student st = new Student();

      System.out.println("Nama\t: " + st.fname);
      System.out.println("Umur\t: " + st.age);
      System.out.println("Tahun lulus\t: " + st.graduationYear);
      st.study();
    
    }
}
