package io.altar.jseproject.model;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import io.altar.jseproject.repository.ProductRepository;

import io.altar.jseproject.repository.EntityRepository;


public class Product {
	
	private int Id;
	private double discount;
	private int tax;
	private double salePrice;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public Product(int Id, double discount, int tax, double salePrice) {
		this.Id = Id;
		this.discount = discount;
		this.tax = tax;
		this.salePrice = salePrice;
		//ProductRepository.Products.put(Id,this);
		//EntityRepository.entities.put(Id,this);
	}
	
	@Override
	public String toString(){
		return "|Id: " + Id + "|Disconto: " + discount + "|IVA: " + tax + "|Preço de Venda: " + salePrice + "|";             
	}

}


