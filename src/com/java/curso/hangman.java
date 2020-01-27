package com.java.curso;

import java.lang.annotation.Repeatable;
import java.util.Random;
import java.util.Scanner;


public class hangman {

	public static final String[] WORDS = { "PALABRA", "PALABRO" };

	public static void main(String[] args) {
		PrintHangman printHangman = new PrintHangman();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

//		System.out.println("Bienvenido al juego del ahorcado.");
//		System.out.println("Elija su opción:");
//		System.out.println("");

		// Chose random word
		int randomNumber = r.nextInt(WORDS.length);
		String randomWord = WORDS[randomNumber];
		System.out.println(randomWord);

		//Input char to advance the game
		System.out.println("Intente adivinar una letra:");
		char guessLetter = ' ';
		guessLetter = sc.next().charAt(0);
		
		// Input word to win the game
		// int guessWord = ()
		System.out.println("Intente adivinar la palabra:");
		String guessWord = sc.nextLine();
		
		String bufferWord = "_";
		bufferWord = bufferWord.repeat(10);
//		//String that will be completed
//		String bufferWord = "_";
//		for (int i = 0; i < randomWord.length(); i++) {
//			bufferWord.charAt(i) = "_";
//		}
		String bufferPrintWord = bufferWord.replace("", " ").trim();
		
		System.out.println("Buffer word: " + bufferPrintWord);
		
//		int charPosition = guessWord.indexOf(ch);
//		System.out.println("Posicion: " + charPosition);
		
		
		// Returns index of first occurrence of character. 
	    int firstIndex = guessWord.indexOf('A'); 
	    System.out.println("First occurrence of char 'A'" + 
	                       " is found at : " + firstIndex); 
	  
	    // Returns index of last occurrence specified character. 
	    int lastIndex = guessWord.lastIndexOf('A'); 
	    System.out.println("Last occurrence of char 'A' is" + 
	                       " found at : " + lastIndex); 
	  
	    // Index of the first occurrence of specified char 
	    // after the specified index if found. 
	    int first_in = guessWord.indexOf('A', 2); 
	    System.out.println("First occurrence of char 'A'" + 
	                       " after index 2 : " + first_in); 
	  
	    int last_in = guessWord.lastIndexOf('A', 2); 
	    System.out.println("Last occurrence of char 'A'" + 
	                     " after index 2 is : " + last_in); 
	  

		if (guessWord.equals(randomWord)) {
			System.out.println("Acertaste: " + randomWord);
		} else {
			System.out.println("Fallaste: " + randomWord + "\nDijiste: " + guessWord);
		}

		//printHangman.state_0();

	}
}