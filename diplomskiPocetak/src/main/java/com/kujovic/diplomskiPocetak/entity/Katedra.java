package com.kujovic.diplomskiPocetak.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Katedra {
	@Id
	private int katedraId;
	private String nazivKatedre;
	
//	@OneToMany(targetEntity = Predmet.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="p_fk", referencedColumnName = "predmetId")
//	private List<Predmet> predmeti;
	
	@OneToMany(mappedBy = "nastavnikId")
	private List<Nastavnik> nastavnici;
	
	@OneToMany(mappedBy = "predmetId")
	private List<Predmet> predmeti;
	
	@OneToOne
	private Izvodjac izvodjac;
}
