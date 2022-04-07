package com.kujovic.diplomskiPocetak.entity;

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
public class Uloga {
	
	@Id 
	private Long  ulogaId;
	
	private String vrstaUloge;
	
//	@OneToMany
//	private List<Izvodjac> izvodjaci;
}
