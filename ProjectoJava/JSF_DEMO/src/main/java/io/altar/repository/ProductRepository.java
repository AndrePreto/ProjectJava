package io.altar.repository;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.model.Product;

@Named("productRepository")
@RequestScoped
public class ProductRepository extends EntityRepository <Product> {
	
	public List<Product> getAllProducts(){
		Query query = getDataBase().createQuery("FROM Product");
		List<Product> ProductList = (List<Product>)query.getResultList();
		return ProductList;
	}
	
	@Override
	@Transactional
	public void RemoveFromDataBase (Product product){
		Product removedProduct = getDataBase().find(Product.class, product.getId());
		getDataBase().remove(removedProduct);
	}
	
	@Transactional
	public void Edit(int id, double discount, int tax, double salePrice){
		Product editedProduct = getDataBase().find(Product.class, id);
		editedProduct.setDiscount(discount);
		editedProduct.setTax(tax);
		editedProduct.setSalePrice(salePrice);
	}
	
	/*
	private static final ProductRepository INSTANCE = new ProductRepository();
	//Mesmo antes de correr o programa o product repository já está criado
	
	public ProductRepository(){}
	
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
	public void editProduct (int Id, double discount, int tax, double salePrice){
		
		((Product) get(Id)).setDiscount(discount);
		((Product) get(Id)).setTax(tax);
		((Product) get(Id)).setSalePrice(salePrice);
	}

	public void editProductDiscount (int Id,double discount){
		
		((Product) get(Id)).setDiscount(discount);

	}
	
	public void editProductIVA (int Id, int tax){
		
		((Product) get(Id)).setTax(tax);

	}

	public void editProductSalePrice (int Id, double salePrice){
		
		((Product) get(Id)).setSalePrice(salePrice);

	}
	*/
	
	
	
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