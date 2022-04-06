package com.kujovic.diplomskiPocetak.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Nastavnik {
	
	@Id
	private int nastavnikId;
	
	private String imePrezime;
	private String brojTelefona;
	private String status; //profesor,docent
	
	@ManyToOne
	private Katedra katedra;
	
	@OneToOne
	private Izvodjac izvodjac;
	
}
