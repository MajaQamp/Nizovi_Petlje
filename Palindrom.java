//Napravite program koji provjerava da li je rijec palindrom -  inace mozete koristiti metodu toCharArray() da string pretvorite u niz char-ova.

import  java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {

        System.out.println("Enter a word to check if it's a palindrome: ");
        Scanner reader=new Scanner(System.in);
        String pocetnaRijec=reader.nextLine();
        String obrnutaRijec="";

        char[] pocetnaRijecUcharovima=pocetnaRijec.toCharArray();

        for (int i= pocetnaRijecUcharovima.length-1;i>=0; i--){

            obrnutaRijec = obrnutaRijec + pocetnaRijecUcharovima[i];

        }

        if (pocetnaRijec.equals(obrnutaRijec)){
            System.out.println("The word entered is a palindrome.");
        }else{
            System.out.println("The word entered is not a palindrome.");
        }







    }}
