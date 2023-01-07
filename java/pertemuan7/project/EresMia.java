package pemrogramanberbasisobjek.pertemuan7.project;

public class EresMia {
    public static void main(String[] args) {
        int i, j, k, l, m;

        for(i = 1; i <= 5; i++){
            for(j=5; j>=i; j--)
            System.out.printf(" ");
            for(k=1; k<=i; k++)
            System.out.printf("*");
            for(l=1; l<=i; l++)
            System.out.printf("*");
            for(m=4; m>=i; m--)
            System.out.printf(" ");
            for(k=1; k<=i; k++)
            System.out.printf("*");
            for(l=1; l<=i; l++)
            System.out.printf("*");
			System.out.printf("\n");	
        }

        for(i=10; i>=1; i--){
            for(j=10; j>=i; j--)
            System.out.printf(" ");
            for(l=1; l<=i; l++)
            System.out.printf("*");
            for(m=i; m>=2; m--)
            System.out.printf("*");
			System.out.printf("\n");
        }
        System.out.printf("\n---------------- <3 ----------------");
    }
}
