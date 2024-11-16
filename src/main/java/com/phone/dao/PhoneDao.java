package com.phone.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phone.entity.Phone;
import com.phone.repository.PhoneRepository;

@Repository
public class PhoneDao {

	@Autowired
	PhoneRepository pr;
	public List<Phone> posts(List<Phone> p) {
		return pr.saveAll(p);
	}
	public List<Object>getAll(){
		return pr.getAll();
	}
	public List<Phone>getPrices(int a,int b){
		return pr.getPrices(a,b);
	}
	public List<Phone>getAlll(){
		return pr.getAlll();
	}
	public List<Phone>getBrand(String a){
		return pr.getBrand(a);
	}
	public List<Phone>getPrice(int a){
		return pr.getPrice(a);
	}
	
	public String getExcep(Phone a) {
		
		pr.save(a);
		return "Posted Successfully";
	}
	public Phone getRate(Phone p){
		return pr.findById(p.getId()).get();
	}
	public Phone getName(String ph) {
		return pr.getName(ph);
	}
	public Phone getFirst(String a) {
		
		return pr.getFirst(a);
	}
	
}
