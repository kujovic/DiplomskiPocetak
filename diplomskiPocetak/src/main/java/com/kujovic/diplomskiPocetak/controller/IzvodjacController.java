package com.kujovic.diplomskiPocetak.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kujovic.diplomskiPocetak.entity.Izvodjac;
import com.kujovic.diplomskiPocetak.service.IzvodjacService;

@RestController
@RequestMapping("/izvodjac")
public class IzvodjacController {

private final IzvodjacService izvodjacService;
	
	public IzvodjacController(IzvodjacService izvodjacService) {
		this.izvodjacService=izvodjacService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Izvodjac>> getAllIzvodjaci(){
		List<Izvodjac> izvodjaci = izvodjacService.pronadjiSveIzvodjace();
		return new ResponseEntity<>(izvodjaci,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Izvodjac> addIzvodjac (@RequestBody Izvodjac izvodjac){
		Izvodjac newIzvodjac = izvodjacService.dodajIzvodjaca(izvodjac);
		return new ResponseEntity<>(newIzvodjac,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Izvodjac> updateIzvodjaca (@RequestBody Izvodjac izvodjac){
		Izvodjac updateIzvodjac = izvodjacService.azurirajIzvodjaca(izvodjac);
		return new ResponseEntity<>(updateIzvodjac,HttpStatus.OK);
		
	}

}
