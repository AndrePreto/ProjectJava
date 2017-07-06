package io.altar.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityModel{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public EntityModel() {}
}