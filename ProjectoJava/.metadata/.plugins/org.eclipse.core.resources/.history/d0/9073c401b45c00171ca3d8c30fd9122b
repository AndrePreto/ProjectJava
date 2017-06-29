package io.altar.view;

import java.io.Serializable;
import java.util.Collection;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.model.Shelf;
import io.altar.service.ShelfService;

@Named("shelfView")
@RequestScoped
public class ShelfView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
    private ShelfService shelfService;
	
	private Shelf shelf = new Shelf();
	
    public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}	
	
    public void addShelf() {
    	shelfService.createShelves(shelf);
    }
    
    public void removeShelf(){
    	shelfService.removeShelves(shelf);
    }
    
    public Collection<Shelf> getShelves() {
        return shelfService.getShelves();
    }
//
//	@PostConstruct
//    public void init() {
//    	shelfService.createShelves();
//    			
//    }
//    
//    public ShelfService getShelfService() {
//        return shelfService;
//    }
// 
//    public void setShelfService(ShelfService shelfService) {
//        this.shelfService = shelfService;
//    }
//    
}