package com.medical.mdbspringboot.controller;

import com.medical.mdbspringboot.model.MedicalRep;
import com.medical.mdbspringboot.service.MedicalRepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
@RequestMapping("/medicalrep")
public class MedicalRepController {

	@Autowired
	private MedicalRepService medicalrepservice;

	@GetMapping(path = "/all-representatives")
	public MedicalRep getAllRepresentative(){
		return new MedicalRep();
	}

	@GetMapping(path = "representative/{id}")
	public MedicalRep getAllRepresentativeById(String id){
		MedicalRep medicalRep = this.medicalrepservice.findByRepresentativeId(id);
		return medicalRep;
	}

	@PostMapping(path="/add-new-representatives")
	public MedicalRep addNewRep(){
		return new MedicalRep("1", "Paridhi", Arrays.asList(new String[]{"Dolo", "Vicks"}));
	}

	@DeleteMapping(path = "/delete-record")
	public MedicalRep deleteAll(){
		return null;
	}
}
