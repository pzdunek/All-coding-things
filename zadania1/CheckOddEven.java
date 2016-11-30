package zadania1;

import java.util.Scanner;

/*
 * Program wczytuje liczbe z klawiatuy i wyswietla informacje, czy liczba jest parzysta, czy nieparzysta.
   * Przed wyjscie wyswietla "DONE""
 */
public class CheckOddEven {
	public static void main(String[] args) {

		System.out.println("Podaj liczbê: ");
		
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		System.out.println("Twoja liczba to: " + number);
		if (number % 2 == 0) {
			System.out.println("Liczba jest parzysta");
		} else {
			System.out.println("Liczba nie jest parzysta");
		}
		System.out.println("DONE");
	}
}