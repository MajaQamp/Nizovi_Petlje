//Napravite program  kojem cemo reci opseg za koji ce morat ispisati sve parne brojeve u koje ne ulaze brojevi
//kojima postavljamo opseg

import  java.util.Scanner;
public class EvenRange {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.println("Please enter the first number in the range: ");
        int pocetniBroj = reader.nextInt();

        System.out.println("Please enter the last number in the range: ");
        int zadnjiBroj = reader.nextInt();

        System.out.println("Even number for the range " + pocetniBroj + " to " + zadnjiBroj + " are:");

        for (int i=pocetniBroj+1; i<zadnjiBroj; i++) {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }



    }}
