package io.altar.jseproject.textinterface;

import java.util.Scanner;
import java.util.ArrayList;
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
				TextInterface.consultarproduto();
				break;
			case 4:
				TextInterface.eliminarproduto();
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
				TextInterface.consultarprateleira();
				break;
			case 4:	
				TextInterface.eliminarprateleira();
				break;
			case 5:
				TextInterface.menu1();
				break;
		}
	}
	
	
	public static void criarproduto(){
		
		int Id = ProductRepository.productNextId();
		System.out.println("O producto tem o ID:" + Id +"\n");
		
		
		System.out.println("Introduza o disconto do produto");
		double discount = Double.parseDouble(Utils.validateDouble(false));
		System.out.println("Introduza o valor do IVA do produto");
		int tax = Integer.parseInt(Utils.validateIVA(false));
		System.out.println("Introduza o preço de venda ao público do produto");
		double salePrice = Double.parseDouble(Utils.validateDouble(false));
		System.out.println("Introduza a prateleira onde deseja colocar o produto criado");
		//ArrayList<Integer> shelfIdLocation = Integer.parseInt(Utils.validateInt(false));
		
		new Product (discount, tax, salePrice);
		
		TextInterface.menu2();
	}
	
	public static void editarproduto(){
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){
			if(!ProductList.isEmpty()){
				System.out.println("Introduza o ID do producto que deseja editar");
				int Id = Integer.parseInt(Utils.validateInt(false));
				if(Id==0){
					TextInterface.menu2();
				}else if(ProductList.ProductcontainsKey(Id)){
					
					System.out.println("O produto que deseja alterar tem a seguinte informação:" + ProductList.get(Id));
					System.out.println("Tem a certeza que quer editar este produto? Prima (s) para confirmar ou (n) para cancelar a operação");
					
					while(true){
						
						if (scanner.hasNext("s")){
							
							System.out.println("1) Editar apenas o desconto do produto");
							System.out.println("2) Editar apenas o IVA do produto");
							System.out.println("3) Editar apenas o preço de venda ao público do produto");
							System.out.println("4) Editar todos os campos do produto");
							
							int input = Utils.getInput(1,4);
							
							switch(input){
								case 1:
									System.out.println("Introduza o novo desconto do produto");
									String Newdiscount = Utils.validateEmptyDouble();
									if(Newdiscount != null){
										double discountOnly = Double.parseDouble(Newdiscount);
										ProductRepository.editProductDiscount(Id, discountOnly);
									}
									TextInterface.menu2();
									break;
								case 2:
									System.out.println("Introduza o novo IVA do produto");
									String NewTax = Utils.validateEmptyIVA();
									if(NewTax != null){
										int taxOnly = Integer.parseInt(NewTax);
										ProductRepository.editProductIVA(Id, taxOnly);
									}
									TextInterface.menu2();
									break;
								case 3:
									System.out.println("Introduza o novo preço de venda ao público do produto");
									String NewSalePrice = Utils.validateEmptyDouble();
									if(NewSalePrice != null){
										double salePriceOnly = Double.parseDouble(NewSalePrice);
										ProductRepository.editProductSalePrice(Id, salePriceOnly);
									}
									TextInterface.menu2();
									break;
								case 4:
									System.out.println("Introduza o novo desconto do produto");
									String discountNew = Utils.validateEmptyDouble();
									double discount = ((Product)ProductRepository.getInstance().get(Id)).getDiscount();
									if(discountNew != null){
										discount = Double.parseDouble(discountNew);
										ProductRepository.editProductSalePrice(Id, discount);
									}
									System.out.println("Introduza o novo IVA do produto");
									String TaxNew = Utils.validateEmptyIVA();
									int tax = ((Product)ProductRepository.getInstance().get(Id)).getTax();
									if(TaxNew != null){
										tax = Integer.parseInt(TaxNew);
									}
									System.out.println("Introduza o novo preço de venda ao público do produto");
									String SalePriceNew = Utils.validateEmptyDouble();
									double salePrice = ((Product)ProductRepository.getInstance().get(Id)).getSalePrice();
									if(SalePriceNew != null){
										salePrice = Double.parseDouble(SalePriceNew);
									}
					
									ProductRepository.editProduct(Id, discount, tax, salePrice);
									TextInterface.menu2();
									break;
							}
							
						}else if (scanner.hasNext("n")) {
							TextInterface.menu2();
							
						}else{
							System.out.println("Introduza uma comando válido: (s) para editar o produto seleccionado ou (n) para cancelar a operação");
							scanner.next();
						}
						
					}	
				}else{
					System.out.println("O Id do produto que inseriu não é válido. Insira o Id de um produto já existente");
				}
			}else{
				System.out.println("Não existe qualquer produto em stock para editar");
				
				TextInterface.menu2();
			}	
		}
	}
	
	public static void consultarproduto(){
		Scanner scanner = new Scanner(System.in);

		while(true){
			
			if(ProductList.isEmpty()){
				System.out.println("Não existe qualquer produto em stock para consultar");
				
				TextInterface.menu2();
			}else{
				System.out.println("Introduza o ID do producto que deseja consultar");
				int Id = Integer.parseInt(Utils.validateInt(false));
				if(Id==0){
					TextInterface.menu2();
				}else if(ProductList.ProductcontainsKey(Id)){
					System.out.println("O produto tem a seguinte informação:" + ProductList.get(Id));
					TextInterface.menu2();
				}else{
					System.out.println("O Id do produto que inseriu não é válido. Insira o Id de um produto já existente");
				}
			}	
		}
	}
	
	public static void eliminarproduto(){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			
			if(ProductList.isEmpty()){
				System.out.println("Não existe qualquer produto em stock para eliminar");
				
				TextInterface.menu2();
			}else{
				System.out.println("Introduza o ID do producto que deseja eliminar");
				int Id = Integer.parseInt(Utils.validateInt(false));
				if(Id==0){
					TextInterface.menu2();
				}else if(ProductList.ProductcontainsKey(Id)){
					System.out.println("O produto que deseja alterar tem a seguinte informação:" + ProductList.get(Id));
					System.out.println("Tem a certeza que quer eliminar este produto? Prima (s) para confirmar ou (n) para cancelar a operação");
					while(true){
						if (scanner.hasNext("s")){
							ProductList.remove(Id);
							TextInterface.menu2();
						}else if(scanner.hasNext("n")){
							TextInterface.menu2();
						}else{
							System.out.println("Introduza uma comando válido: (s) para eliminar o produto seleccionado ou (n) para cancelar a operação");
							scanner.next();
						}
					}	
				}else{
					System.out.println("O Id do produto que inseriu não é válido. Insira o Id de um produto já existente");
				}
			}	
		}
	}
	
	
	public static void criarprateleira(){
		
		
		int Id = EntityRepository.shelfNextId();
		System.out.println("A prateleira tem o ID:" + Id);
		
		System.out.println("");
		
		System.out.println("Introduza o código da prateleira");
		int code = Integer.parseInt(Utils.validateInt(false));
		System.out.println("Introduza a capacidade da prateleira");
		int capacity = Integer.parseInt(Utils.validateInt(false));
		System.out.println("Introduza o preço de aluguer da prateleira");
		double price = Double.parseDouble(Utils.validateDouble(false));
		
		new Shelf (code, capacity, price);
		
		TextInterface.menu3();
	}
	
	public static void editarprateleira(){
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){
			if(!ShelfList.isEmpty()){
				System.out.println("Introduza o ID da prateleira que deseja editar");
				int Id = Integer.parseInt(Utils.validateInt(false));
				if(Id==0){
					TextInterface.menu3();
				}else if(ShelfList.ShelfcontainsKey(Id)){
					
					System.out.println("A prateleira que deseja alterar tem a seguinte informação:" + ShelfList.get(Id));
					System.out.println("Tem a certeza que quer editar esta prateleira? Prima (s) para confirmar ou (n) para cancelar a operação" );
					while(true){
						if(scanner.hasNext("s")){
							
							System.out.println("Introduza o novo código da prateleira");
							int code = Integer.parseInt(Utils.validateInt(false));
							System.out.println("Introduza a nova capacidade da prateleira");
							int capacity = Integer.parseInt(Utils.validateInt(false));
							System.out.println("Introduza o novo preço de aluguer da prateleira");
							double price = Double.parseDouble(Utils.validateDouble(false));
						
							ShelfRepository.editShelf(Id, code, capacity, price);
							TextInterface.menu3();
							
						}else if(scanner.hasNext("n")){
							TextInterface.menu3();
						}else{
							System.out.println("Introduza uma comando válido: (s) para editar a prateleira seleccionada ou (n) para cancelar a operação");
						}
					}	
				}else{
					System.out.println("O Id da prateleira que inseriu não é válido. Insira o Id de uma prateleira já existente");
				}
				
			}else{
				System.out.println("Não existe qualquer prateleira para editar");
				
				TextInterface.menu3();
			}	
		}
	}
	
	public static void consultarprateleira(){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			
			if(ShelfList.isEmpty()){
				System.out.println("Não existe qualquer prateleira para consultar");
				
				TextInterface.menu3();
			}else{																																																																																																																																																																																																																																																
				System.out.println("Introduza o ID da prateleira que deseja consultar");
				int Id = Integer.parseInt(Utils.validateInt(false));
				if(Id==0){
					TextInterface.menu3();
				}else if(ShelfList.ShelfcontainsKey(Id)){
					System.out.println("A prateleira tem a seguinte informação:" +ShelfList.get(Id));
					System.out.println("Para voltar prima Enter");
					while(true){
						if (scanner.hasNext()){
							TextInterface.menu3();
						}else{
							System.out.println("Prima Enter para voltar atrás");
							scanner.next();
						}
					}	
				}else{
					System.out.println("O Id da prateleira que inseriu não é válido. Insira o Id de uma prateleira já existente");
				}
			}	
		}
	}
	
	public static void eliminarprateleira(){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			
			if(ShelfList.isEmpty()){
				System.out.println("Não existe qualquer prateleira para eliminar");
				
				TextInterface.menu3();
			}else{
				System.out.println("Introduza o ID da prateleira que deseja eliminar");
				int Id = Integer.parseInt(Utils.validateInt(false));
				if(Id==0){
					TextInterface.menu3();
				}else if(ShelfList.ShelfcontainsKey(Id)){
					System.out.println("A prateleira que deseja eliminar tem a seguinte informação:" + ShelfList.get(Id));
					System.out.println("Tem a certeza que quer eliminar esta prateleira? Prima (s) para confirmar ou (n) para cancelar a operação");
					while(true){
						if (scanner.hasNext("s")){
							ShelfList.remove(Id);
							TextInterface.menu3();
						}else if(scanner.hasNext("n")){
							TextInterface.menu3();
						}else{
							System.out.println("Introduza uma comando válido: (s) para eliminar o produto seleccionado ou (n) para cancelar a operação");
							scanner.next();
						}
					}	
				}else{
					System.out.println("O Id da prateleira que inseriu não é válido. Insira o Id de uma prateleira já existente");
				}
			}	
		}
	}
}

