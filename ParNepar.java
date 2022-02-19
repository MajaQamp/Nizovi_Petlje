//Napravite program kojem mozete pri pokretanju reci koliki niz zelite zatim da popunite niz sa int brojevima.
//Na ispisu svih brojeva kod mora ispisati redoslijed (ne index) u nizu, da li je paran ili ne kao i da li je veci od 10.


import java.sql.SQLOutput;
import  java.util.Scanner;
public class ParNepar {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        int[] myArray = new int[5];
        int pocetniBroj = 1;

        System.out.println("Please enter " + myArray.length + " numbers.\n");


        for (int i=0; i<myArray.length; i++){
            System.out.println("Please enter " + pocetniBroj++ + " number:");

            myArray[i]=reader.nextInt();

            if (myArray[i]%2==0){
                System.out.println("The number entered is an even number.");
            }else{
                System.out.println("The number entered is an odd number.");}
            if (myArray[i]>10){
                System.out.println("The number entered is greater than 10.\n");
            }
            else if (myArray[i]==10){
                System.out.println("The number entered is 10.\n");
            }
            else {
                System.out.println("The number entered is less than 10.\n");
            }
        }












    }
}
