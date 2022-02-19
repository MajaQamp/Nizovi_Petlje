//Napravite program koji ce objediniti dva niza u jedan veliki niz.

import java.util.Arrays;
import  java.util.Scanner;

public class dvaNizaObjedinjena {
    public static void main(String[] args) {
Scanner reader= new Scanner(System.in);

    int [] prviNiz= {1,5,7,8,1,2};
    int [] drugiNiz={8,5,5,5,4};
    int duzinaPrvogNiza = prviNiz.length;
    int duzinaDrugogNiza = drugiNiz.length;
    int duzinaNovogNiza = duzinaPrvogNiza+duzinaDrugogNiza;
    int [] noviNiz = new int[duzinaNovogNiza];

            System.arraycopy(prviNiz, 0, noviNiz, 0, duzinaPrvogNiza);
            System.arraycopy(drugiNiz, 0, noviNiz, duzinaPrvogNiza, duzinaDrugogNiza);

        System.out.println("The new array combining two initial arrays is: ");
        System.out.println(Arrays.toString (noviNiz));
        //Je li Arrays.toString jedini nacin da se tacno isprinta cijeli niz?






    }}
