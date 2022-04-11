package com.kujovic.diplomskiPocetak.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Predmet  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  predmetId;
	
	private String nazivPredmeta;
	private int semestar;
	private String studijskiProgram;
	private String modul;
	private boolean obavezan;
	
	@ManyToOne
	private Katedra katedra;
	
	@OneToMany(mappedBy = "predmet")
	private List<Izvodjac> izvodjaci;
}
