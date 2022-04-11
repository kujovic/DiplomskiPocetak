package com.kujovic.diplomskiPocetak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kujovic.diplomskiPocetak.entity.Predmet;
import com.kujovic.diplomskiPocetak.repository.PredmetRepository;

@Service
public class PredmetService {

	private final PredmetRepository predmetRepository;

	@Autowired
	public PredmetService(PredmetRepository predmetRepository) {
		this.predmetRepository = predmetRepository;
	}
	
	public Predmet dodajPredmet(Predmet predmet) {
		return predmetRepository.save(predmet);
	}
	
	public List<Predmet> pronadjiSvePredmete(){
		return predmetRepository.findAll();
	}
	
	public Predmet azurirajKatedru(Predmet predmet) {
		return predmetRepository.save(predmet);
	}
	
	public Predmet nadjiKatedruPoId(Long id) {
		return predmetRepository.findPredmetById(id);
				
	}
	
	public void deleteNastavnik(Long id) {
		predmetRepository.deletePredmetById(id);
	}
	
}
