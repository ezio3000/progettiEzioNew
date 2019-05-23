package it.ezio.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	
	/**
	 * aggiunge un nuovo elemento Voto 
	 * @param v
	 */
	public void add(Voto v) {
		voti.add(v);		
	}

}
