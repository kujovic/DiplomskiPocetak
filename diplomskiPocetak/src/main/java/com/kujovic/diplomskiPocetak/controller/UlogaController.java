package com.kujovic.diplomskiPocetak.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kujovic.diplomskiPocetak.entity.Nastavnik;
import com.kujovic.diplomskiPocetak.entity.Predmet;
import com.kujovic.diplomskiPocetak.entity.Uloga;
import com.kujovic.diplomskiPocetak.service.NastavnikService;
import com.kujovic.diplomskiPocetak.service.UlogaService;

@RestController
@RequestMapping("/uloga")
public class UlogaController {

	private final UlogaService ulogaService;
	
	public UlogaController(UlogaService ulogaService) {
		this.ulogaService=ulogaService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Uloga>> getAllUloge(){
		List<Uloga> uloge = ulogaService.pronadjiSveUloge();
		return new ResponseEntity<>(uloge,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Uloga> addUloga (@RequestBody Uloga uloga){
	//	System.out.println(uloga.getVrstaUloge()+uloga.getUlogaId());
		
		Uloga newUloga = ulogaService.dodajUlogu(uloga);
		return new ResponseEntity<>(newUloga,HttpStatus.CREATED);
	}
	
}
