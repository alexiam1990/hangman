package com.java.curso;

public class PrintHangman {

	public PrintHangman() {
		super();
		
	}
	
	public void printState (int tries){
		switch (tries) {
		case 0:
			state_0();
			break;
		case 1:
			state_1();
			break;
		case 2:
			state_2();
			break;
		case 3:
			state_3();
			break;
		case 4:
			state_4();
			break;
		case 5:
			state_5();
			break;
		case 6:
			state_6();
			break;
		}
	}
	
	public void state_0() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}

	public void state_1() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"  O   |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}

	public void state_2() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"  O   |  " + "\n" +
		"  |   |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}

	public void state_3() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"  O   |  " + "\n" +
		" /|   |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}

	public void state_4() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"  O   |  " + "\n" +
		" /|\\  |  " + "\n" +
		"      |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}

	public void state_5() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"  O   |  " + "\n" +
		" /|\\  |  " + "\n" +
		" /    |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}

	public void state_6() {
		System.out.println(
		"  +---+  " + "\n" +
		"  |   |  " + "\n" +
		"  O   |  " + "\n" +
		" /|\\  |  " + "\n" +
		" / \\  |  " + "\n" +
		"      |  " + "\n" +
		"=========" 
		);}
	}
