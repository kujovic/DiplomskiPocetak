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

import com.kujovic.diplomskiPocetak.entity.Katedra;
import com.kujovic.diplomskiPocetak.service.KatedraService;


@RestController
@RequestMapping("/katedra")
public class KatedraController {
	private final KatedraService katedraService;
	
	public KatedraController(KatedraService katedraService) {
		this.katedraService=katedraService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Katedra>> getAllKatedre(){
		List<Katedra> katedre = katedraService.pronadjiSveKatedre();
		return new ResponseEntity<>(katedre,HttpStatus.OK);
	}
	
//	@GetMapping("/find/{id}")
//	public ResponseEntity<Katedra> getKatedraById (@PathVariable("id") Long id){
//		Katedra katedra = katedraService.nadjiKatedruPoId(id);
//		return new ResponseEntity<>(katedra,HttpStatus.OK);
//		
//	}
	
	@PostMapping("/add")
	public ResponseEntity<Katedra> addKatedra (@RequestBody Katedra katedra){
		Katedra newKatedra = katedraService.dodajKatedru(katedra);
		return new ResponseEntity<>(newKatedra,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Katedra> updateKatedra (@RequestBody Katedra katedra){
		Katedra updateKatedra = katedraService.azurirajKatedru(katedra);
		return new ResponseEntity<>(updateKatedra,HttpStatus.OK);
		
	}
	
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<?> deleteKatedra (@PathVariable("id") Long id){
//		katedraService.deleteKatedra(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//		
//	}
}
