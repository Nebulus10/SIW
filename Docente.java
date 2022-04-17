package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import org.hibernate.annotations.CascadeType;
import javax.persistence.CascadeType;

@Entity
public class Docente{
	
	@Id 
	private String nome;
	
	private String cognome;
	
	private LocalDate nascita;
	
	private Integer durata;
	
	private String luogo_nascita;
	
	private Integer partita_iva;
	
	//The EAGER fetch is used here to guarantee the load of all the courses given by a professor, which can be useful
	//This can be done because the relation between "corso" and "allievi" follows a LAZY fetch policy.7
	//The cascade policy allow us to delete the courses of a professor that doesn't exist no more.
	@OneToMany(mappedBy = "docente", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@Column(nullable = false)
	private List<Corso> corsi;

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}

	public Integer getPartita_iva() {
		return partita_iva;
	}

	public void setPartita_iva(Integer partita_iva) {
		this.partita_iva = partita_iva;
	}
	
	public Docente(String nome, String cognome, String luogo_nascita, Integer durata, LocalDate nascita, Integer partita_iva){
		
		this.cognome = cognome;
		this.durata = durata;
		this.luogo_nascita = luogo_nascita;
		this.nascita = nascita;
		this.nome = nome;
		this.partita_iva = partita_iva;
		
	}
	
	public Docente() {}
	
	
}
