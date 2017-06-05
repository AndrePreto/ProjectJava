package io.altar.jseproject.model;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import io.altar.jseproject.repository.ShelfRepository;

public class Shelf {
	private int Id;
	private int code;
	private int capacity;
	private double price;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
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
	
	public Shelf(int shelfId, int code, int capacity, double price) {
		this.Id = shelfId;
		this.code = code;
		this.capacity = capacity;
		this.price = price;
		//ShelfRepository.Shelfs.put(shelfId, this);
	}	
	
	@Override
	public String toString(){
		return "|Id: " + Id + "|Código: " + code + "|Capacidade: " + capacity + "|Preço: " + price + "|";             
	}
}