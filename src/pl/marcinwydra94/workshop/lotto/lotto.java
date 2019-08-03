package pl.marcinwydra94.workshop.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {


        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
        Collections.shuffle(Arrays.asList(arr));

        int[] arrChosenNumbers = new int[6];

        Scanner scan = new Scanner(System.in);
        int j = 0;

        try {

            while (j < 6) {


                System.out.println("Wprowadź liczbę do losowania Lotto, możliwość od 1 do 49 bez powtarzania wcześniej użytej liczby: ");
                int chosenNumber = scan.nextInt();

                if (chosenNumber < 1 || chosenNumber > 49) {
                    System.out.println("Wprowadziłeś niedozwoloną liczbę, podaj w zakresie od 1 do 49: ");
                    chosenNumber = scan.nextInt();
                }

                for (int k = j; k < arrChosenNumbers.length; k++) {
                    if (arrChosenNumbers[k] == chosenNumber) {
                        System.out.println("Wybrałeś już tę liczbę w tym zakresie, wpisz inną: ");
                        chosenNumber = scan.nextInt();
                    }

                    arrChosenNumbers[k] = chosenNumber;
                }
                j++;

            }
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadziłeś liczby.");
            scan.nextInt();

        }

        int strikedNumbers = 0;

        for (int l = 0; l < arrChosenNumbers.length; l++) {
            for (int m = 0; m < arrChosenNumbers.length; m++) {
                if (arr[l] == arrChosenNumbers[m]) {
                    strikedNumbers++;
                }

            }
        }

        System.out.println("Twoje liczby: " + Arrays.toString(arrChosenNumbers));
        System.out.println("Wylosowane liczby: [" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + ", " + arr[5] + "]");


        if (strikedNumbers >= 3) {
            System.out.println("Wygrałeś: " +strikedNumbers + "!");
        } else
            System.out.println("Niestety nie udało się wygrać, miałeś: " + strikedNumbers + " trafień.");



    }

}
