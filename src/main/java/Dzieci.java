/*Grupka dzieci przyszla sie zwazyc do lekarza na kolonii kolejno lekarka podaje wage i naciska enter.
  Na koncu masz wypisac wage najlżejszego i najcięższego dziecka
  oraz medianę
        Pacjentów ma być losowa liczba między 10 a 20, każdemu ma się wylosować waga w zakresie 20 - 150
        Najpierw wypisać na ekran wylosowanych pacjentów a pod tą listą niech będzie podsumowanie mediany i średniej*/

import java.util.Random;
import java.util.Arrays;

public class Dzieci {
    public static void main(String[] args) {

        int minimalnaLiczbaPacjentow = 10;
        int maksymalnaLiczbaPacjentow = 20;

        Random rand = new Random();
        int liczbaPacjentów = rand.nextInt(maksymalnaLiczbaPacjentow - minimalnaLiczbaPacjentow + 1) + minimalnaLiczbaPacjentow;
        int[] wagaPacjenta = new int[liczbaPacjentów];

        System.out.println("Liczba pacjentów wynosi: " + liczbaPacjentów);

        for (int i = 0; i < liczbaPacjentów; i++) {
            int z = 20;
            int q = 150;
            Random rand2 = new Random();
            int waga = rand2.nextInt(q - z + 1) + z;
            wagaPacjenta[i] = waga;

            System.out.println("pacjent nr: " + (i + 1) + " " + "ma wagę: " + waga);
        }

        Arrays.sort(wagaPacjenta);

        for (int i = 0; i < liczbaPacjentów; i++) {
            int waga = wagaPacjenta[i];
            System.out.println("pacjent nr: " + (i + 1) + " " + "ma wagę: " + waga);
        }

        double mediana = 0;
        if (wagaPacjenta.length % 2 == 0) {
            int indexSrodkowegoElementuNr1 = (liczbaPacjentów / 2) - 1;
            int indexSrodkowegoElementuNr2 = liczbaPacjentów / 2;
            double srednia = wagaPacjenta[indexSrodkowegoElementuNr1] + wagaPacjenta[indexSrodkowegoElementuNr2];
            mediana = srednia / 2.0;
        }
        else {
            mediana = wagaPacjenta[liczbaPacjentów/2];
        }

        System.out.println("Mediana: " + mediana + " minimalna waga: " + wagaPacjenta[0] + " maksymalna waga: " + wagaPacjenta[liczbaPacjentów - 1]);
    }
}