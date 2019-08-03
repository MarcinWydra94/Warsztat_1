package pl.marcinwydra94.workshop.guess_numer;

import java.util.Random;
import java.util.Scanner;

public class GuessNumerApp {

    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        guessNumber(numberToGuess);



    } static int guessNumber(int numberToGuess) {

        Scanner scan = new Scanner(System.in);
        int timer = 0;

        System.out.println("Zgadnij liczbę od 1 do 100: ");

        do {
            while (!scan.hasNextInt()) {
                String wrongInput = scan.nextLine();
                System.out.println("To nie jest liczba. Zgadnij liczbę: ");
            }
            int chosenNumber = scan.nextInt();
            timer++;
            if (chosenNumber > numberToGuess) {
                System.out.println("Wylosowana liczba jest mniejsza. Spróbuj ponownie: ");
            } else if (chosenNumber < numberToGuess) {
                System.out.println("Wyloowana liczba jest większa.Spróbuj ponownie: ");
            } else {
                System.out.println("Zgadłeś, Ilość prób: " + timer);
            }
        } while (true);
    }
}






