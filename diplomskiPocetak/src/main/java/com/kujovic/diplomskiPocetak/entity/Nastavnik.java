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
public class Nastavnik  implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  nastavnikId;
	
	private String imePrezime;
	private String brojTelefona;
	private String status; //profesor,docent
	
	@ManyToOne
	private Katedra katedra;
	
	@OneToMany(mappedBy = "nastavnik")
	private List<Izvodjac> izvodjaci;
	
}
