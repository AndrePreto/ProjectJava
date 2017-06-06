package io.altar.jseproject.repository;

import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;

public abstract class EntityRepository <E extends Entity> {
	
	private LinkedHashMap <Integer, Entity> Entities = new LinkedHashMap <Integer, Entity> ();
	
	private static int productId = 0;
	
	public static int productNextId(){
		return ++productId;
	}
		
	public void PutOnListProduct(Entity Entity){
		Entity.setId(productId);
		Entities.put(Entity.getId(), Entity);
	}
	
	private static int shelfId = 0;
	
	public static int shelfNextId(){
		return ++shelfId;
	}
		
	public void PutOnListShelf(Entity Entity){
		Entity.setId(shelfId);
		Entities.put(Entity.getId(), Entity);
	}
	
}
