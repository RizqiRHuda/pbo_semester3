package pbo_semester3;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opsi;
        double bil1,bil2;
        double hasil = 0;
        System.out.println("Pilih opsi operasi hitung : \n*\n/ \n+\n- ");
        System.out.print("-> ");
        opsi = sc.next().charAt(0);
        System.out.println("----------------------");
        System.out.println("Operasi hitung : " + opsi);

        System.out.print("Input bilangan pertama\t: ");
        bil1 = sc.nextInt();
        System.out.print("Input bilangan kedua\t: ");
        bil2 = sc.nextInt();

        switch(opsi)  {
            case '+' : 
            hasil = bil1 + bil2;
            break;
            case '-' :
            hasil = bil1 - bil2;
            break;
            case '*' :
            hasil = bil1 * bil2;
            break;
            case '/' : 
            hasil = bil1/bil2;
            break;
            default :
            System.out.println("Operasi tidak valid");
        }
        System.out.println("----------------------");
        System.out.println("Hasil operasi hitung -> " + bil1 + " " + opsi + " " +  bil2 + " = " + hasil);
        
    }
}
