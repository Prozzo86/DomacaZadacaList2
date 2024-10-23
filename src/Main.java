import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite 10 brojeva:");
        for (int i = 0; i < 10; i++) {
            brojevi.add(scanner.nextInt());
        }

        int najcesciBroj = brojevi.get(0);
        int maxPonavljanja = 1;

        for (int i = 0; i < brojevi.size(); i++) {
            int trenutniBroj = brojevi.get(i);
            int brojPonavljanja = 0;

            for (int j = 0; j < brojevi.size(); j++) {
                if (brojevi.get(j) == trenutniBroj) {
                    brojPonavljanja++;
                }
            }

            if (brojPonavljanja > maxPonavljanja) {
                maxPonavljanja = brojPonavljanja;
                najcesciBroj = trenutniBroj;
            }
        }
        System.out.println("Broj koji se najviše puta ponavljao: " + najcesciBroj);
        System.out.println("Ponavlja se " + maxPonavljanja + " puta.");
    }
}
