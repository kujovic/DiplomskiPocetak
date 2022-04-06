package com.kujovic.diplomskiPocetak.entity;

import java.util.List;

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
public class Predmet {
	@Id
	private int predmetId;
	
	private String nazivPredmeta;
	private int semestar;
	private String studijskiProgram;
	private String modul;
	private boolean obavezan;
	
	@ManyToOne
	private Katedra katedra;
	
	@OneToOne
	private Izvodjac izvodjac;
}
