package io.altar.jseproject.repository;

import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.jseproject.model.Entity;

public abstract class EntityRepository <E extends Entity> {
	
	private LinkedHashMap <Integer, Entity> Entities = new LinkedHashMap <Integer, Entity> ();
	
	private static int productId = 0;
	
	public static int productNextId(){
		return ++productId;
	}
		
	public void PutOnListProduct(Entity Product){
		Product.setId(productId);
		Entities.put(Product.getId(), Product);
	}
	
	private static int shelfId = 0;
	
	public static int shelfNextId(){
		return ++shelfId;
	}
		
	public void PutOnListShelf(Entity Shelf){
		Shelf.setId(shelfId);
		Entities.put(Shelf.getId(), Shelf);
	}
	
	public Set<Integer> keySet(){
		return Entities.keySet();
	}
	public Entity get(Integer key){
		return Entities.get(key);
	}
	
	public boolean isEmpty(){
		return Entities.isEmpty();
	}
}
