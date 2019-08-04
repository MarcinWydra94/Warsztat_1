package pl.marcinwydra94.workshop.dice;

import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {

        int numberOfThrows = 0;
        int modifier = 0;
        int sum = 0;

        Scanner scanCube = new Scanner(System.in);
        System.out.println("Podaj typ kostki, którą chcesz użyć, dostępne są: D3, D4, D6, D8, D10, D12, D20, D100");
        String typeOfCube = scanCube.nextLine();

        Scanner scanThrows = new Scanner(System.in);
        System.out.println("Podaj ile razy chciałbyś rzucić kotką: ");
        while (!scanThrows.hasNextInt()) {
            String inPutThrows = scanThrows.nextLine();
            System.out.println(inPutThrows + "to nie liczba, podaj liczbę rzutów");
        }
        numberOfThrows = scanThrows.nextInt();

        Scanner scanModifier = new Scanner(System.in);
        System.out.println("Podaj ile chciałbyś dodać lub odjąć od wyniku");
        while (!scanModifier.hasNextInt()) {
            String inPutModifier = scanModifier.nextLine();
            System.out.println(inPutModifier + " to nie liczba, podaj liczbę");
        }
        modifier = scanModifier.nextInt();

        Random rand = new Random();

        if (typeOfCube.equalsIgnoreCase("D3")) {
            sum = numberOfThrows * (rand.nextInt(3) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("D4")) {
            sum = numberOfThrows * (rand.nextInt(4) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("D6")) {
            sum = numberOfThrows * (rand.nextInt(6) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("D8")) {
            sum = numberOfThrows * (rand.nextInt(6) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("D10")) {
            sum = numberOfThrows * (rand.nextInt(10) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("D12")) {
            sum = numberOfThrows * (rand.nextInt(12) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("D20")) {
            sum = numberOfThrows * (rand.nextInt(20) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        } else if (typeOfCube.equalsIgnoreCase("100")) {
            sum = numberOfThrows * (rand.nextInt(100) + 1) + modifier;
            System.out.println("Wynik twojego rzutu to: " + sum);
        }


    }
}
