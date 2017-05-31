package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class TextInterface {
	
	public static void menu1() {
		System.out.println("Por favor seleccione uma das seguintes opções:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair ");
		
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
	
	
	public static void menu2() {
		System.out.println("Por favor seleccione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
	}
	
	public static void menu3() {
		System.out.println("1) Criar nova Prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
	}
	public static void produtoID(){
		System.out.println("Introduza o ID do producto");
	}
	public static void menuproduto() {
		System.out.println("1) Introduza o valor do produto");
		System.out.println("2) Introduza o valor do IVA do produto");
		System.out.println("3) Introduza o preço de venda ao público do produto");
	}
}

