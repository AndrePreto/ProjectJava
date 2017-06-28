package io.altar.service;

import java.util.Collection;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.model.Shelf;
import io.altar.repository.ShelfRepository;

@Named("shelfService")
@RequestScoped
public class ShelfService {
		
		private ShelfRepository ShelfList = ShelfRepository.getInstance();
		
		public void createShelves(Shelf shelf) {
			ShelfList.PutOnListShelf(shelf);
		}
		
		public void removeShelves(Shelf shelf){
			ShelfList.remove(shelf.getId());
		}
		
		public Collection<Shelf> getShelves(){
			return ShelfList.getall();
		}

}
