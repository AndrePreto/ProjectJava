package io.altar.jseproject.repository;

import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;

public abstract class EntityRepository <E extends Entity> {
	
	private LinkedHashMap <Integer, Entity> Entities = new LinkedHashMap <Integer, Entity> ();
	
	private static int Id = 0;
	
	public static int NextId(){
		return ++Id;
	}
		
	public void PutOnList(Entity Entity){
		Entity.setId(Id);
		Entities.put(Entity.getId(), Entity);
	}
	
}
