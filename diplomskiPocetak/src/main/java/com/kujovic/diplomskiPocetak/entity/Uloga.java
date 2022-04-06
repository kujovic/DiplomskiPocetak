package com.kujovic.diplomskiPocetak.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Uloga {
	
	@Id
	private int ulogaId;
	
	private String vrstaUloge;
	
	@OneToOne
	private Izvodjac izvodjac;
}
