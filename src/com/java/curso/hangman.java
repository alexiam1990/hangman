package com.java.curso;

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

		// Input word
		// int guessWord = ()
		System.out.println("Intente adivinar la palabra:");
		String guessWord = sc.nextLine();
				
		

		if (guessWord.equals(randomWord)) {
			System.out.println("Acertaste: " + randomWord);
		} else {
			System.out.println("Fallaste: " + randomWord + "\nDijiste: " + guessWord);
		}

		printHangman.state_0();

	}
}