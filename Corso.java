package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso{
	
	@Id 
	private String nome;
	
	private LocalDate inizio;
	
	private Integer durata;
	
	@ManyToMany
	@Column(nullable= false)
	private List<Allievi> allievi;

	@ManyToOne
	private Docente docente;
	
	public LocalDate getInizio() {
		return inizio;
	}

	public void setInizio(LocalDate inizio) {
		this.inizio = inizio;
	}

	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}
	
	public Corso(String nome, LocalDate inizio, Integer durata){
		
		this.nome = nome;
		this.inizio = inizio;
		this.durata = durata;
		
	}
	
	public Corso() {}
	
	
}
