package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Societa{
	
	@Id 
	private String ragione_sociale;
	
	private String indirizzo_sede;
	
	private Integer telefono;

	@OneToMany(mappedBy = "societa")
	@Column(nullable = false)
	private List<Allievi> allievi;

	public String getIndirizzo_sede() {
		return indirizzo_sede;
	}

	public void setIndirizzo_sede(String indirizzo_sede) {
		this.indirizzo_sede = indirizzo_sede;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public Societa(String indirizzo_sede, String ragione_sociale, Integer telefono){
		
		this.indirizzo_sede = indirizzo_sede;
		this.ragione_sociale = ragione_sociale;
		this.telefono = telefono;
		
	}
	
	public Societa() {}
	
}
