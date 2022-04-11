package com.kujovic.diplomskiPocetak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kujovic.diplomskiPocetak.entity.Uloga;
import com.kujovic.diplomskiPocetak.repository.UlogaRepository;

@Service
public class UlogaService {

	private final UlogaRepository ulogaRepository;

	@Autowired
	public UlogaService(UlogaRepository ulogaRepository) {
		this.ulogaRepository = ulogaRepository;
	}
	
	public Uloga dodajUlogu(Uloga uloga) {
		return ulogaRepository.save(uloga);
	}
	
	public List<Uloga> pronadjiSveUloge(){
		return ulogaRepository.findAll();
	}
	
	public Uloga azurirajUlogu(Uloga uloga) {
		return ulogaRepository.save(uloga);
	}
	
	public Uloga nadjiUloguPoId(Long id) {
		return ulogaRepository.findUlogaById(id);
				
	}
	
	public void deleteUloga(Long id) {
		ulogaRepository.deleteUlogaById(id);
	}
	
}
