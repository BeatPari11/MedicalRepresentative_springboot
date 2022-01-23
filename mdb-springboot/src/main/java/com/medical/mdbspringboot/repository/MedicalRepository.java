package com.medical.mdbspringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.medical.mdbspringboot.model.MedicalRep;

public interface MedicalRepository extends MongoRepository<MedicalRep,String> {
	
	MedicalRep findByRepresentativeId(String id);
	List<MedicalRep> findAllRepresentative();
	
	

}
