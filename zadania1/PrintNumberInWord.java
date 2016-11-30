package zadania1;

import java.util.Scanner;

/**
 * Program wczytuje liczbe z klawiatury . Jesli liczba jest z przedzialu 1 - 9
 * to wyswietla nazwe cyfy. Jesli liczba jest wieksza od 9 to wyswietla info
 * "Inna"
 */
public class PrintNumberInWord {
	public static void main(String[] args) {
		System.out.println("Podaj liczbê z przedzia³u 1-9: ");
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

 
      // Using nested-if
      if(number == 1) {
         System.out.println("Jeden");
      } else if(number == 2) {
    	  System.out.println("Dwa");
      } else if(number == 3) {
    	  System.out.println("Trzy");        
      } else if(number == 4){
    	  System.out.println("Cztery");
      }else if(number == 5) {
    	  System.out.println("Piêæ");        
      } else if(number == 6){
    	  System.out.println("Szeœæ");
      }else if(number == 7) {
    	  System.out.println("Siedem");        
      } else if(number == 8){
    	  System.out.println("Osiem");
      }else if(number == 9){
    	  System.out.println("Dziewiêæ");
      }else{
    	  System.out.println("Inna");
      }
 
      // Using switch-case
      switch(number) {
         case 1: System.out.println("Jeden"); break;  // Don't forget "break"
         case 2: System.out.println("Dwa"); break;
         case 3: System.out.println("Trzy"); break;
         case 4: System.out.println("Cztery"); break;
         case 5: System.out.println("Piêæ"); break;
         case 6: System.out.println("Szeœæ"); break;
         case 7: System.out.println("Siedem"); break;
         case 8: System.out.println("Osiem"); break;
         case 9: System.out.println("Dziewiêæ"); break;
         default: System.out.println("Inna"); 
      }
   }
}