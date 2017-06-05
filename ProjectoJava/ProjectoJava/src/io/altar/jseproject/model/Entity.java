package io.altar.jseproject.model;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repository.EntityRepository;

public class Entity{
	private int Id;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public Entity(int Id) {
		this.Id = Id;
		EntityRepository.entities.put(Id,this);
	}
}
