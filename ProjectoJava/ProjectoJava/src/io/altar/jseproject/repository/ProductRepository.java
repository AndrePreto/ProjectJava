package io.altar.jseproject.repository;

import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository <Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
	//Mesmo antes de correr o programa o product repository já está criado
	
	private ProductRepository(){}
	
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
	public static void editProduct (int Id, double discount, int tax, double salePrice){
		
		((Product)ProductRepository.getInstance().get(Id)).setDiscount(discount);
		((Product)ProductRepository.getInstance().get(Id)).setTax(tax);
		((Product)ProductRepository.getInstance().get(Id)).setSalePrice(salePrice);
	}

	public static void editProductDiscount (int Id,double discount){
		
		((Product)ProductRepository.getInstance().get(Id)).setDiscount(discount);

	}
	
	public static void editProductIVA (int Id, int tax){
		
		((Product)ProductRepository.getInstance().get(Id)).setTax(tax);

	}

	public static void editProductSalePrice (int Id, double salePrice){
		
		((Product)ProductRepository.getInstance().get(Id)).setSalePrice(salePrice);

	}
	
	/*
	//Com arrayList
	//public static ArrayList<Product> Products = new ArrayList<Product> ();
	
	//Com HashMap
	public static LinkedHashMap<Integer, Product> Products = new LinkedHashMap<Integer, Product>();
	
	public static void ProductList(){
		
		if(Products.isEmpty()){
			System.out.println("Não existe nenhum produto em stock");
		}else{
			System.out.println("Tem os seguintes productos em Stock:");
			
			for (Entry<Integer, Product> entry : Products.entrySet()) {
				System.out.println(entry.getValue());
			
			//Com arrayList
			//System.out.println(Arrays.toString(Products.toArray()));
			}
		}
	}
	*/
	
}
