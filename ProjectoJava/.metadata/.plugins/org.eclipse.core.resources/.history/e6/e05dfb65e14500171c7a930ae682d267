package io.altar.jseproject.test;

import java.util.Scanner;

import io.altar.jseproject.textinterface.TextInterface;

public class Test {

	public static void main (String[] args) {
		TextInterface.menu1();
		
		int input = getInput(1,3);
		
		switch (input){
			case 1:
				TextInterface.menu2();
				break;
			case 2:
				TextInterface.menu3();
				break;
			case 3:
				break;
		}
	}
		
	public static int getInput(int min, int max){
		Scanner scanner = new Scanner(System.in);	
		int input = 0;
		
		while (true){
			if(scanner.hasNextInt()){
				input = scanner.nextInt();
				if (input >= min && input <= max){
					return input;
				} else {
				System.out.println("Seleccione um valor numérico entre " + min + " e" + max);
				}
			} else {
				System.out.println("Seleccione um valor numérico entre " + min + "e" + max);
				scanner.next();
			}
		}
	}	
}

