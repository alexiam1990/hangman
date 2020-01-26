package com.java.curso;

import java.util.Random;

public class hangman {

	public static final String[] WORDS = { "PALABRA", "PALABRO" };

	public static void main(String[] args) {
		PrintHangman printHangman = new PrintHangman();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

//		System.out.println("Bienvenido al juego del ahorcado.");
//		System.out.println("Elija su opción:");
//		System.out.println("");
		
		//Chose random word
		int randomNumber = r.nextInt(WORDS.length);
		System.out.println(WORDS[randomNumber]);
		
		//Input word
	//	int guessWord = sc
		String nombre = sc.nextLine();
		
		
		printHangman.state_0();

	}
}