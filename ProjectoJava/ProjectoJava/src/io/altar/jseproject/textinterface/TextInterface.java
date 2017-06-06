package io.altar.jseproject.textinterface;

import java.util.Scanner;
import java.util.Collections;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repository.ShelfRepository;
import io.altar.jseproject.repository.ProductRepository;
import io.altar.jseproject.repository.EntityRepository;

import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class TextInterface {
	
	public static ProductRepository ProductList = ProductRepository.getInstance();
	public static ShelfRepository ShelfList = ShelfRepository.getInstance();
	
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
	
	public static int validateInt(){
		Scanner scanner = new Scanner(System.in);
		int inputvalue = 0;
		
		while(true){
			if(scanner.hasNextInt()){
				inputvalue = scanner.nextInt();
				if(inputvalue > 0){			
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
				if(inputvalue > 0){			
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
			
	
	public static void menu2() {
		
		/*
		if(ProductList.isEmpty()){
			System.out.println("Não existe nenhum produto em stock");
		}else{
			System.out.println("Tem os seguintes productos em Stock:");
			
			for (Entry<Integer, Product> entry : ProductList.entrySet()) {
				System.out.println(entry.getValue());
			}
		}
		*/	
		
		System.out.println("Por favor seleccione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int input = getInput(1,5);
		
		switch (input){
			case 1:
				TextInterface.criarproduto();
				break;
			case 2:
				TextInterface.editarproduto();
				break;
			case 3:
			case 4:
				break;
			case 5:
				TextInterface.menu1();
				break;
		}
	}
	
	public static void menu3() {
		
		//ShelfRepository.ShelfList();
		
		System.out.println("1) Criar nova Prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int input = getInput(1,5);
		
		switch (input){
			case 1:
				TextInterface.criarprateleira();
				break;
			case 2:
				TextInterface.editarprateleira();
				break;
			case 3:
			case 4:
				break;
			case 5:
				TextInterface.menu1();
				break;
		}
	}
	
	
	public static void criarproduto(){
		
		int Id = ProductRepository.productNextId();
		System.out.println("O producto tem o ID:" + Id);
		
		System.out.println("Introduza o valor do produto");
		double discount = validateDouble();
		System.out.println("Introduza o valor do IVA do produto");
		int tax = validateInt();
		System.out.println("Introduza o preço de venda ao público do produto");
		double salePrice = validateDouble();
		
		new Product (discount, tax, salePrice);
		
		TextInterface.menu1();
	}
	
	public static void editarproduto(){
		System.out.println("1) Introduza o ID do producto que deseja editar");
	}
	
	public static void editarprodutomenu() {
		System.out.println("1) Introduza o valor do produto");
		System.out.println("2) Introduza o valor do IVA do produto");
		System.out.println("3) Introduza o preço de venda ao público do produto");
	}
	
	
	public static void criarprateleira(){
		
		
		int Id = ShelfRepository.shelfNextId();
		System.out.println("A prateleira tem o ID:" + Id);
		
		System.out.println("Introduza o código da prateleira");
		int code = validateInt();
		System.out.println("Introduza a capacidade da prateleira");
		int capacity = validateInt();
		System.out.println("Introduza o preço de aluguer da prateleira");
		int price = validateInt();
		
		new Shelf (code, capacity, price);
		
		TextInterface.menu1();
	}
	
	public static void editarprateleira(){
		System.out.println("1) Introduza o ID da prateleira");
	}
	
	public static void editarprateleiramenu() {
		System.out.println("1) Introduza o código da prateleira");
		System.out.println("2) Introduza a capacidade da prateleira");
		System.out.println("3) Introduza o preﾃｧo de aluguer da prateleira");
	}
}

