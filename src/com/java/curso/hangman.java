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
		Boolean isAllGuessLetterFilled = false; // Guess word completed
		boolean isThisGuessLetterFilled = false; // Letter inside our word. Ex: we choose A, every instance of A is
													// filled

		// Chose random word
		int randomNumber = r.nextInt(WORDS.length);
		String randomWord = WORDS[randomNumber];
		System.out.println(randomWord);

		char[] bufferRandomWord = new char[randomWord.length()]; // Current guess with correct letters guessed
		String printableBufferRandomWord = ""; // Printable (with spaces) buffer

		for (int i = 0; i < randomWord.length(); i++) {
			bufferRandomWord[i] = '_';
		}
		int posBufferRandomWord = 0;
		int contBufferRandomWord = 0;
		// String para sacar por pantalla
//		String bufferPrintWord = "_";
//		bufferPrintWord = bufferPrintWord.repeat(randomWord.length());
//		bufferPrintWord = bufferPrintWord.replace("", " ").trim();

		int att = 0; // attempts
		char guessLetter = 0; // Input letter to guess
		String bufferGuessLetter = ""; // String with all input letters used. 26 letters alphabet (possible tries)

//		System.out.println("Bienvenido al juego del ahorcado.");
//		System.out.println("Elija su opción:");
//		System.out.println("");

//		while (isWin) {
		for (int j = 0; j < 5; j++) {
			isGuessLetterRepeated = true;

			printHangman.printState(att);

			while (isGuessLetterRepeated) { // We assume letter is repeated until we input a valid (new) one
				isAllGuessLetterFilled = false;
				// Input char to advance the game
				System.out.println("Introduzca letra:");
				guessLetter = sc.next().charAt(0);

				// Check letters in previous tries
				if (bufferGuessLetter.indexOf(guessLetter) > -1) {
					System.out.println("Letra ya usada, posicion " + (bufferGuessLetter.indexOf(guessLetter) + 1)
							+ " de " + bufferGuessLetter);
				} else { // Guess letter never used
					contBufferRandomWord = 0;
					while (!isAllGuessLetterFilled) {
						contBufferRandomWord = 0;
						while (!isThisGuessLetterFilled) {
							// search if this letter exists or not
							posBufferRandomWord = randomWord.indexOf(guessLetter, contBufferRandomWord);
							isThisGuessLetterFilled = false;
							contBufferRandomWord = 0;
							if (posBufferRandomWord > 0) {
								isAllGuessLetterFilled = false;
								while (!isThisGuessLetterFilled) {
									posBufferRandomWord = randomWord.indexOf(guessLetter, contBufferRandomWord);
									if (posBufferRandomWord > 0) {
										System.out.println(
												"Letra " + guessLetter + " en posicion: " + posBufferRandomWord);
										bufferRandomWord[posBufferRandomWord] = guessLetter;
										contBufferRandomWord = posBufferRandomWord + 1;
									} else {
										isThisGuessLetterFilled = true;
										isAllGuessLetterFilled = true;
									}
								}
							} else {
								att++;
								System.out.println(
										"Letra " + guessLetter + " no encontrada. Intentos: " + (att) + " de 6.");
								isAllGuessLetterFilled = true;
								// isThisGuessLetterFilled = true;
							}
							isGuessLetterRepeated = false;
						}
					}
				}
			}
			bufferGuessLetter = bufferGuessLetter.concat(String.valueOf(guessLetter));

			if (sc.hasNextLine())
				sc.nextLine(); // flush scanner

			// We make printable our current buffer word, for easy reading
			printableBufferRandomWord = String.copyValueOf(bufferRandomWord);
			printableBufferRandomWord = printableBufferRandomWord.replace("", " ").trim();

			System.out.println("bufferGuessLetter(" + randomWord.length() + "): " + String.valueOf(bufferGuessLetter));
			System.out.println("bufferRandomWord(" + randomWord.length() + "): " + String.valueOf(bufferRandomWord));
			System.out.println("printableBufferRandomWord(" + randomWord.length() + "): " + printableBufferRandomWord);

//		int charPosition = guessWord.indexOf(ch);
//		System.out.println("Posicion: " + charPosition);

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