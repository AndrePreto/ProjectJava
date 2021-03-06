package io.altar.jseproject.model;

import io.altar.jseproject.repository.ShelfRepository;

public class Shelf extends Entity{
	
	//private int shelfId;
	private int productID;
	private int code;
	private int capacity;
	private double price;
	/*
	public int getShelfId() {
		return shelfId;
	}
	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}
	*/
	public int getProductID(){
		return productID;
	}
	public void setProductID(int productID){
		this.productID = productID;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Shelf(int code, int capacity, double price) {
		this.code = code;
		this.capacity = capacity;
		this.price = price;
		ShelfRepository.getInstance().PutOnListShelf(this);
		//ShelfRepository.Shelfs.put(shelfId, this);
	}	
	
	@Override
	public String toString(){
		return "|Id: " + getId() + "|Código: " + code + "|Capacidade: " + capacity + "|Preço: " + price + "|";             
	}
}