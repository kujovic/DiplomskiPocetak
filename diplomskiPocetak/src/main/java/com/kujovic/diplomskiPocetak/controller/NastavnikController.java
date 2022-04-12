package com.kujovic.diplomskiPocetak.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kujovic.diplomskiPocetak.entity.Nastavnik;
import com.kujovic.diplomskiPocetak.service.NastavnikService;

@RestController
@RequestMapping("/nastavnik")
public class NastavnikController {

private final NastavnikService nastavnikService;
	
	public NastavnikController(NastavnikService nastavnikService) {
		this.nastavnikService=nastavnikService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Nastavnik>> getAllNastavnike(){
		List<Nastavnik> nastavnici = nastavnikService.pronadjiSveNastavnike();
		return new ResponseEntity<>(nastavnici,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Nastavnik> getNastavnikById (@PathVariable("id") Long id){
		Nastavnik nastavnik = nastavnikService.nadjiNastavnikaPoId(id);
		return new ResponseEntity<>(nastavnik,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Nastavnik> addNastavnik (@RequestBody Nastavnik nastavnik){
		Nastavnik newNastavnik = nastavnikService.dodajNastavnika(nastavnik);
		return new ResponseEntity<>(newNastavnik,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Nastavnik> updateNastavnik (@RequestBody Nastavnik nastavnik){
		Nastavnik updateNastavnik = nastavnikService.azurirajNastavnika(nastavnik);
		return new ResponseEntity<>(updateNastavnik,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteNastavnik (@PathVariable("id") Long id){
		nastavnikService.deleteNastavnik(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
