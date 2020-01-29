package com.java.curso;

import java.util.Random;
import java.util.Scanner;

public class hangman {

	public static final String[] WORDS = { "PALABRA", "PALABRO" };

	public static void main(String[] args) {
		PrintHangman printHangman = new PrintHangman();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Boolean isWin = false;
		Boolean isGuessLetterRepeated = true;

		// Chose random word
		int randomNumber = r.nextInt(WORDS.length);
		String randomWord = WORDS[randomNumber];
		System.out.println(randomWord);

		char[] bufferRandomWord = new char[randomWord.length()]; // Our current guess with all our correct letter guessed
		for (int i = 0; i < randomWord.length(); i++) {
			bufferRandomWord[i] = '_';
		}
		// String para sacar por pantalla
		String bufferPrintWord = "_";
		bufferPrintWord = bufferPrintWord.repeat(randomWord.length());
		bufferPrintWord = bufferPrintWord.replace("", " ").trim();

		int att = 0; // attempts
		char guessLetter = 0; // Input letter to guess
		String bufferGuessLetter = ""; // String with all input letters used. 26 letters alphabet (possible tries)

//		System.out.println("Bienvenido al juego del ahorcado.");
//		System.out.println("Elija su opción:");
//		System.out.println("");

//		while (isWin) {
		for (int j = 0; j < 5; j++) {
			isGuessLetterRepeated = true;

			while (isGuessLetterRepeated) { // We assume letter is repeated until we input a valid (new) one
				// Input char to advance the game
				System.out.println("Intente adivinar una letra:");
				guessLetter = sc.next().charAt(0);

				// Check letters in previous tries
				if (bufferGuessLetter.indexOf(guessLetter) > -1) {
					System.out.println("Letra ya usada, posicion " + (bufferGuessLetter.indexOf(guessLetter) + 1)
							+ " de " + bufferGuessLetter);
				} else {
					isGuessLetterRepeated = false;
				}
			}
			bufferGuessLetter = bufferGuessLetter.concat(String.valueOf(guessLetter));
			if (sc.hasNextLine())
				sc.nextLine(); // flush scanner
			
			System.out.println("bufferRandomWord(" + randomWord.length() + "): " + String.valueOf(bufferRandomWord));
			System.out.println("bufferPrintWord(" + randomWord.length() + "): " + bufferPrintWord);

//		int charPosition = guessWord.indexOf(ch);
//		System.out.println("Posicion: " + charPosition);

			// printHangman.state_0();
//		}
		}
		sc.close();
	}

//	// Returns index of first occurrence of character. 
//    int firstIndex = guessWord.indexOf('A'); 
//    System.out.println("First occurrence of char 'A'" + 
//                       " is found at : " + firstIndex); 
//  
//    // Returns index of last occurrence specified character. 
//    int lastIndex = guessWord.lastIndexOf('A'); 
//    System.out.println("Last occurrence of char 'A' is" + 
//                       " found at : " + lastIndex); 
//  
//    // Index of the first occurrence of specified char 
//    // after the specified index if found. 
//    int first_in = guessWord.indexOf('A', 2); 
//    System.out.println("First occurrence of char 'A'" + 
//                       " after index 2 : " + first_in); 
//  
//    int last_in = guessWord.lastIndexOf('A', 2); 
//    System.out.println("Last occurrence of char 'A'" + 
//                     " after index 2 is : " + last_in); 
}