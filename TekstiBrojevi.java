//Napravite program koji moze za niz od 10 brojeva da ispise:
//        First number in array: 123
//        Second number in array: 23
//        Third number in array: 3
//        i da se ovakav ispis moze koristiti do 15 elementa u nizu.



public class TekstiBrojevi {
    public static void main(String[] args) {
    int[] nizBrojeva= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    String[] nizTeksta= {"1st number in array: ","2nd number in array: ","3d number in array: ","4th number in array: ","5th number in array: ","6th number in array: ","7th number in array: ","8th number in array: ","9th number in array: ","10th number in array: ","11th number in array: ","12th number in array: ","13th number in array: ","14th number in array: ","15th number in array: ",};

   for (int i = 0; i < 10; i++){
        System.out.println(nizTeksta[i] + nizBrojeva[i]);

    }

    }








}
