package io.altar.jseproject.utils;

import java.util.Scanner;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.textinterface.TextInterface;

public class Utils {
	public static int getInput(int min, int max){
		Scanner scanner = new Scanner(System.in);	
		int input = 0;
		
		while (true){
			if(scanner.hasNextInt()){
				input = scanner.nextInt();
				if (input >= min && input <= max){
					return input;
				} else {
				System.out.println("Seleccione um valor numérico entre " + min + " e " + max);
				}
			} else {
				System.out.println("Seleccione um valor numérico entre " + min + " e " + max);
				scanner.next();
			}
		}
	}
	
	public static int validateInt(){
		Scanner scanner = new Scanner(System.in);
		int inputvalue = 0;
		
		while(true){
			if(scanner.hasNextInt()){
				inputvalue = scanner.nextInt();
				if(inputvalue >= 0){			
					return inputvalue;
				}else{
				System.out.println("Por favor introduza um número positivo");
				}
			}else{	
				System.out.println("Por favor introduza um número");
				scanner.next();
			}
		}
	}
	
	public static double validateDouble(){
		Scanner scanner = new Scanner(System.in);
		double inputvalue = 0;
		
		while(true){
			if(scanner.hasNextDouble() || scanner.hasNextInt()){
				inputvalue = scanner.nextDouble();
				if(inputvalue >= 0){			
					return inputvalue;
				}else{
				System.out.println("Por favor introduza um número positivo");
				}
			}else{	
				System.out.println("Por favor introduza um número");
				scanner.next();
			}
		}
	}
	
	public static int validateIVA(){
		Scanner scanner = new Scanner(System.in);
		int inputvalue = 0;
		
		while(true){
			if(scanner.hasNextInt()){
				inputvalue = scanner.nextInt();
				switch (inputvalue){
					case 6:
					case 13:
					case 21:
					case 23:
						return inputvalue;
					default:
						System.out.println("Por favor introduza um valor de IVA válido (6,13,21 ou 23)");
				}
			}else{
				System.out.println("Por favor introduza um número");
				scanner.next();
			}
		}
	}

	public static String validateEmpty(){
		Scanner scanner = new Scanner(System.in);
		
		int inputvalue = 0;
		String input = scanner.nextLine();
		
		while(true){
			
			try{
				if (scanner.hasNextLine()){
					inputvalue = Integer.parseInt(input);
					if(inputvalue>0){
						return input;
					}else{
						System.out.println("Por favor introduza um número positivo");
					}
				}
			}catch(Exception NumberFormatException){
					System.out.println("Por favor introduza um número");
					scanner.next();
			}

		}
	}

}
