package zadania1;

import java.util.Scanner;

/**
 * Program wczyta liczbe z klawiatury i wypisze "PASS" jesli zmienna "mark" jest
 * wieksza od 50; lub "FAIL" w przeciwnym przypadku. Program musi wypisac
 * "DONE" przed wyjsciem.
 */
public class CheckPassFail {
	public static void main(String[] args) {
      int mark;
      
      System.out.println("Podaj liczbê:");
      Scanner sc = new Scanner(System.in);
      mark = sc.nextInt();
      
      System.out.println("The mark is " + mark);
 
      if (mark > 50) {
         System.out.println("PASS");
      } else {
         System.out.println("FAIL");
      }
      System.out.println("DONE");
   }
}