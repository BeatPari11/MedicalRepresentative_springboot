package com.medical.mdbspringboot.service;

import com.medical.mdbspringboot.model.MedicalRep;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface MedicalRepService {
	List<MedicalRep> findAll();
	MedicalRep findByRepresentativeId(String id);
	//List<MedicalRep> findAllRepresentative();
	void deleteRepresentativeById(String id);
}
