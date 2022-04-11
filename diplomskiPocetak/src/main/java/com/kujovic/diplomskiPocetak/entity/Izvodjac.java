package com.kujovic.diplomskiPocetak.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Izvodjac implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name="ulogaId")
	private Uloga uloga;
	
	@Id
	@ManyToOne
	@JoinColumn(name="nastavnikId")
	private Nastavnik nastavnik;
	
	@Id
	@ManyToOne
	@JoinColumn(name="predmetId")
	private Predmet  predmet;
	
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
