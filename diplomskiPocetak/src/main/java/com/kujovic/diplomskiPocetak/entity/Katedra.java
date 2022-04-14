package com.kujovic.diplomskiPocetak.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Katedra  implements Serializable{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  katedraId;
	
	private String nazivKatedre;
	
//	@OneToMany(targetEntity = Predmet.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="p_fk", referencedColumnName = "predmetId")
//	private List<Predmet> predmeti;
	
	@OneToMany(mappedBy = "nastavnikId")
	private List<Nastavnik> nastavnici;
	
	@OneToMany(mappedBy = "predmetId")
	private List<Predmet> predmeti;
	
//	@ManyToOne
//	private Izvodjac izvodjac;
}
