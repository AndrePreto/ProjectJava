package io.altar.jseproject.textinterface;

import java.util.Scanner;
import java.util.Collections;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repository.ShelfRepository;
import io.altar.jseproject.utils.Utils;
import io.altar.jseproject.repository.ProductRepository;
import io.altar.jseproject.repository.EntityRepository;

import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class TextInterface {
	
	private static ProductRepository ProductList = ProductRepository.getInstance();
	
	private static ShelfRepository ShelfList = ShelfRepository.getInstance();
	
	public static void menu1() {
		System.out.println("Por favor seleccione uma das seguintes opções:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair ");
		
		int input = Utils.getInput(1,3);
		
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
		
		
		if(ProductList.isEmpty()){
			System.out.println("------------------------------------");
			System.out.println("|Não existe nenhum produto em stock|");
			System.out.println("------------------------------------");
		}else{
			System.out.println("Tem os seguintes productos em Stock:");
			
			for (Integer key : ProductList.keySet()) {
				System.out.println(ProductList.get(key));
			}
		}
		
		System.out.println("Por favor seleccione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int input = Utils.getInput(1,5);
		
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
		
		if(ShelfList.isEmpty()){
			System.out.println("-------------------------------");
			System.out.println("|Não existe nenhuma prateleira|");
			System.out.println("-------------------------------");
		}else{
			System.out.println("Tem as seguintes prateleiras:");
			
			for (Integer key : ShelfList.keySet()) {
				System.out.println(ShelfList.get(key));
			}
		} 
		
		System.out.println("1) Criar nova Prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int input = Utils.getInput(1,5);
		
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
		double discount = Utils.validateDouble();
		System.out.println("Introduza o valor do IVA do produto");
		int tax = Utils.validateIVA();
		System.out.println("Introduza o preço de venda ao público do produto");
		double salePrice = Utils.validateDouble();
		
		new Product (discount, tax, salePrice);
		
		TextInterface.menu1();
	}
	
	public static void editarproduto(){
		System.out.println("Introduza o ID do producto que deseja editar");
		int Id = Utils.validateInt();
			if(ProductList.ProductcontainsKey()){
			
				System.out.println("Introduza o novo valor do produto");
				double discount = Utils.validateDouble();
				System.out.println("Introduza o novo IVA do produto");
				int tax = Utils.validateIVA();
				System.out.println("Introduza o novo preço de venda ao público do produto");
				double salePrice = Utils.validateDouble();
				
				
				ProductRepository.editProduct(Id, discount, tax, salePrice);
			}else{
				System.out.println("Insira o Id de um produto já existente");
			}
	}
	
	
	public static void criarprateleira(){
		
		
		int Id = EntityRepository.shelfNextId();
		System.out.println("A prateleira tem o ID:" + Id);
		
		System.out.println("Introduza o código da prateleira");
		int code = Utils.validateInt();
		System.out.println("Introduza a capacidade da prateleira");
		int capacity = Utils.validateInt();
		System.out.println("Introduza o preço de aluguer da prateleira");
		int price = Utils.validateInt();
		
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

