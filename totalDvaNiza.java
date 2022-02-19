//Napravite program koji ce izracunati total kada se svaki element iz jednog niza sabere sa svakim elementom iz drugog niza.

public class totalDvaNiza {
    public static void main(String[] args) {

        int[] prviNiz={1,2,3,4,5,6};
        int[] drugiNiz={8,7,6,5,4,3};

        int sumaPrviNiz=0;
        int sumaDrugiNiz=0;

        for (int i=0; i<prviNiz.length; i++) {
            sumaPrviNiz = sumaPrviNiz + prviNiz[i];}


       for (int j=0; j<drugiNiz.length; j++){
           sumaDrugiNiz = sumaDrugiNiz + drugiNiz[j];}

        System.out.println("Total prvi niz: " + sumaPrviNiz);
        System.out.println("Total drugi niz: " + sumaDrugiNiz);
        System.out.println("Total oba niza: " + (sumaPrviNiz + sumaDrugiNiz));

    }







    }

