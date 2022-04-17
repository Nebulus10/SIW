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
public class Allievi{
	
	@Id 
	private String nome;
	
	private String cognome;
	
	private String luogo_nascita;
	
	private LocalDate nascita;
	
	private Integer matricola;
	
	private String posta_elettronica;

	@ManyToMany(mappedBy = "allievi")
	@Column(nullable= false)
	private List<Corso> corsi;
	
	@ManyToOne
	private Societa societa;
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public Integer getMatricola() {
		return matricola;
	}

	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}

	public String getPosta_elettronica() {
		return posta_elettronica;
	}

	public void setPosta_elettronica(String posta_elettronica) {
		this.posta_elettronica = posta_elettronica;
	}
	
	public Allievi(String nome, String cognome, String posta_elettronica, LocalDate nascita, Integer matricola, String luogo_nascita){
		
		this.nome = nome;
		this.cognome = cognome;
		this.luogo_nascita = luogo_nascita;
		this.matricola = matricola;
		this.nascita = nascita;
		this.posta_elettronica = posta_elettronica;
		
	}
	
	public Allievi() {}
	
	
	
}
