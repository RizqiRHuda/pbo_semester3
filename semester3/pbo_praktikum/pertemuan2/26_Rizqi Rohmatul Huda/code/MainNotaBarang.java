package pemrogramanberbasisobjek.pertemuan2;
import java.util.Scanner;
public class MainNotaBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== Nota ====================== ");
        System.out.println();
        NotaBarang nb = new NotaBarang();
        System.out.print("Input nama barang\t: " );
        nb.namaBarang = sc.nextLine();
        System.out.print("Input jenis barang\t: " );
        nb.jenisBarang = sc.nextLine();
        System.out.print("Input jumlah barang\t: ");
        nb.jumlah = sc.nextInt();
        System.out.print("Harga barang\t: ");
        nb.harga = sc.nextInt();

        System.out.println();
        System.out.println("-----------------------");

        NotaBarang nb2 = new NotaBarang();
        sc.nextLine();
        System.out.print("Input nama barang\t: " );
        nb2.namaBarang = sc.nextLine();
        System.out.print("Input jenis barang\t: " );
        nb2.jenisBarang = sc.nextLine();
        System.out.print("Input jumlah barang\t: ");
        nb2.jumlah = sc.nextInt();
        System.out.print("Harga barang\t: ");
        nb2.harga = sc.nextInt();
        
        System.out.println();
        System.out.println("-----------------------");


        System.out.println("Nama barang\t: " + nb.namaBarang);
        System.out.println("Jenis barang\t: " + nb.jenisBarang);
        System.out.println("Jumlah barang\t: " + nb.jumlah);
        System.out.println("Diskon harga\t: " + nb.getDiskon());
        System.out.println("Total bayar\t: " + nb.getBayar());

        System.out.println();
        System.out.println("-----------------------");

        System.out.println("Nama barang\t: " + nb2.namaBarang);
        System.out.println("Jenis barang\t: " + nb2.jenisBarang);
        System.out.println("Jumlah barang\t: " + nb2.jumlah);
        System.out.println("Diskon harga\t: " + nb2.getDiskon());
        System.out.println("Total bayar\t: " + nb2.getBayar());

        System.out.println();
        System.out.println("====================== **** ====================== ");
    }
}
