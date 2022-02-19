//NApravite program koji ce sabrati dva niza zajedno, ukoliko je jedan niz veci od drugog
//        taj broj se samo prepise



import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class SabiranjeDvaNiza {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] kratkiNiz={1,2,3,4,5,6};
        int[] dugiNiz={8,7,6,5,4,3,6,8,7,1,1,2,2};
        int[] duzinaObaNiza=new int [kratkiNiz.length+dugiNiz.length];

        if (kratkiNiz.length> dugiNiz.length){
            int[] temp = new int[kratkiNiz.length];
            temp=kratkiNiz;
            kratkiNiz=dugiNiz;
            dugiNiz=temp;
        }



        System.out.println("Prvi niz je: ");
        for (int i=0; i< kratkiNiz.length; i++) {
            System.out.print(kratkiNiz[i]);

        }
        System.out.print("\n");

        System.out.println("Drugi niz je: ");
        for (int j=0; j< dugiNiz.length; j++) {
            System.out.print(dugiNiz[j]);

        }

        System.out.print("\nRezultat je:\n");

        for (int k=0; k< kratkiNiz.length; k++) {
            dugiNiz[k] = kratkiNiz[k] + dugiNiz[k];

        }

        for (int l=0; l< dugiNiz.length;l++){
            System.out.print(dugiNiz[l]);
        }












    }}






