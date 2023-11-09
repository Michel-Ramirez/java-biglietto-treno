package org.lesson.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		double ticketPrice = 0.21;
		
		// DISCOUNT IN %
		double underDiscount = 0.2;
		double overDiscont = 0.4;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Quanti km vuoi percorrere?: ");
		int km = in.nextInt();
		
		System.out.println("Inserisci la tua età: ");
		int age = in.nextInt();
		
		double basePrice = km * ticketPrice;
		
		if(age < 19) {
			
			double amountDiscount = basePrice * underDiscount;
			double finalePrice = basePrice - amountDiscount;
			
			System.out.println("L'età inserita è: " + age + " quindi under 18" + " Il prezzo del biglietto scontato è: " + finalePrice);
			
		} else if (age > 65) {
			double amountDiscount = basePrice * overDiscont;
			double finalePrice = basePrice - amountDiscount;
			
			System.out.println("L'età inserita è: " + age + " quindi over 65" + " Il prezzo del biglietto scontato è: " + finalePrice);
			
		} else {
			
			System.out.println("Il prezzo del biglietto è: " + basePrice);
		}
		
		
	}

}
