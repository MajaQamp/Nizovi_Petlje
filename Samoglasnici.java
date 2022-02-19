import java.util.Scanner;

public class Samoglasnici {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.println("Unesite riječ ili rečenicu: " );

        String Rijec = reader.nextLine();
        System.out.println("Unijeli ste: " + Rijec);

        String novaRijec = Rijec.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Riječ/rečenica bez samoglsnika je: " + novaRijec);








    }
}
