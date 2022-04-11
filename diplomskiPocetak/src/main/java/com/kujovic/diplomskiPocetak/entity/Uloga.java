package com.kujovic.diplomskiPocetak.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Uloga  implements Serializable{
	
	@Id 
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  ulogaId;
	
	
	private String vrstaUloge;
	
	@OneToMany(mappedBy = "uloga")
	private List<Izvodjac> izvodjaci;
}
