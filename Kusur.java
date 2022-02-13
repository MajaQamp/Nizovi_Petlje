public class Kusur {
    public static void main(String[] args) {
        int iznosRacuna=100;
        int uplata=70;
        int kusur = uplata - iznosRacuna;
        int brojNovcanica20 = kusur/20;
        int ostatakNakon20 = kusur%20;
        int brojNovcanica10 = ostatakNakon20/10;
        int ostatakNakon20i10 = kusur - (brojNovcanica20*20) - (brojNovcanica10*10);
        int brojKovanica2KM = ostatakNakon20i10/2;
        int ostatakNakon2KM = kusur - (brojNovcanica20*20) - (brojNovcanica10*10) - (brojKovanica2KM*2);
        int brojKovanica1KM = ostatakNakon2KM/1;
        int ostatakNakon1KM = kusur - (brojNovcanica20*20) - (brojNovcanica10*10) - (brojKovanica2KM*2)-(brojKovanica1KM*1) ;



       if (uplata>100) {
            System.out.println("You have too much money.");
        }
        if (iznosRacuna<=0) {
            System.out.println("You didn't buy anything, did you?");
        }
        if (iznosRacuna<0) {
            System.out.println("Did you maybe break something?!");}

        if ((uplata>iznosRacuna) && ((uplata<100) || (iznosRacuna>0))) {
            System.out.println("Change:  " + kusur + " BAM" + "\nNumber of 20 BAM banknotes:  " + brojNovcanica20 + "\nNumber of 10 BAM banknotes:  " + brojNovcanica10 + "\nNumber of 2 BAM coins:  " + brojKovanica2KM + "\nNumber of 1 BAM coins:  " + brojKovanica1KM);
      }
        if (uplata<iznosRacuna) {
            System.out.println("Please add the remaining amount: "+ kusur + " BAM-");
        }












    }}
