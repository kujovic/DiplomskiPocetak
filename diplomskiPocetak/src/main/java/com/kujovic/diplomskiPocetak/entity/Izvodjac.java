package com.kujovic.diplomskiPocetak.entity;

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
public class Izvodjac {
	@Id 
	@ManyToOne
	private Long  predmetId;
	
	@Id 
	@ManyToOne
	private Long  nastavnikId;
	
	@Id 
	@ManyToOne
	private Long  ulogaId;
	
	private String opis;
	
//	@Id
//	@OneToMany(targetEntity = Predmet.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="p1_fk", referencedColumnName = "predmetId")
//	private int predmetId;
//	
//	@Id
//	@OneToMany(targetEntity = Nastavnik.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="n1_fk", referencedColumnName = "nastavnikId")
//	private int nastavnikId;
//	
//	@Id
//	@OneToMany(targetEntity = Uloga.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="u_fk", referencedColumnName = "ulogaId")
//	private int ulogaId;
//	
//	private String opis;
}
