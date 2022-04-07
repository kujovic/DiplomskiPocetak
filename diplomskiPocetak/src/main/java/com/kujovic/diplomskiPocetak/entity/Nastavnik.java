package com.kujovic.diplomskiPocetak.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Nastavnik  implements Serializable{
	
	@Id 
	private Long  nastavnikId;
	
	private String imePrezime;
	private String brojTelefona;
	private String status; //profesor,docent
	
	@ManyToOne
	private Katedra katedra;
	
	@OneToMany
	private List<Izvodjac> izvodjaci;
	
}
