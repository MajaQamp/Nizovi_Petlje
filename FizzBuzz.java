//Napravite program koji ce iterirati brojeve jedan po jedan i zatim provjeriti da li je broj djeljiv sa 3
//        ako da umjesto tog broja ce ispisati fizz, ako je broj djeljiv sa 5 ispisat ce buzz,
//        ako je broj djeljiv sa 3 i 5 ispisat ce fizzbuzz, a ako nije nista od navedenog samo ce biti ispisan.
//        Takodje treba napraviti niz koji sadrzi sve brojeve koji nisu prikazani vec su fizz, buzz ili fizzbuzzirani


public class FizzBuzz {
    public static void main(String[] args) {
        int[] nizBrojeva = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};


        for (int i=1; i<= nizBrojeva.length; i++){
                if (i % 15 == 0){
                    System.out.print(" FizzBuzz ");
                }

                else if (i % 5 == 0) {
                    System.out.print(" Buzz ");
                }

                else if (i % 3 == 0) {
                    System.out.print(" Fizz ");
                                }

                else {
                    System.out.print(" "+i+" ");
            }}


        System.out.println("\nFizzbuzzirani brojevi su: ");

        for (int j=1; j<= nizBrojeva.length; j++){
            if (j % 15 == 0 || j % 5 == 0 || j % 3 == 0)
                System.out.print(" " + j+ " " );
        }






    }}
