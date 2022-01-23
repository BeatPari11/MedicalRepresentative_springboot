package com.medical.mdbspringboot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection ="representative")
public class MedicalRep {
	
@Id
public String id;

public String name;
public List<String> drugs;

public MedicalRep()
{
	
}
public MedicalRep(String id,String name,List<String>drugs)
{
	this.id=id;
	this.name=name;
	this.drugs=drugs;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getDrugs() {
	return drugs;
}
public void setDrugs(List<String> drugs) {
	this.drugs = drugs;
}
@Override
public String toString() {
	return String.format("Medical Rep [id = %s, name = %s, drugs = %s]",id, name, drugs);
}

}
