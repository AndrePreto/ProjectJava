package io.altar.jseproject.repository;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository<Product>{
	private static final ProductRepository Instance = new ProductRepository();
	
	public static ProductRepository getInstance(){
		return Instance;
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
