package pl.marcinwydra94.workshop.guess_numer;

import java.util.Scanner;

public class GuessNumberApp2 {
    public static void main(String[] args) {

        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach.");
        guessNumber2();


    } static void guessNumber2() {

        int min = 0;
        int max = 1000;

        do {

            int guess = ((max - min) / 2) + min;
            System.out.println("Zgaduję: " + guess + ". Jeżeli to twoja liczba wpisz 'zgadłeś', większa 'za dużo', mniejsza 'za mało.'");

            Scanner scan = new Scanner(System.in);
            String next = scan.nextLine();

            if (next.equals("za dużo")) {
                max = guess;
            } else if (next.equals("za mało")) {
                min = guess;
            } else if (next.equals("zgadłeś")) {
                System.out.println("Wygrałem!");
                break;
            }

        } while (true);

    }
}
