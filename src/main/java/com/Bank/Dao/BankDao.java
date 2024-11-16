package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Entity.Bank;
import com.Bank.Repository.BankRepository;

@Repository
public class BankDao {

	@Autowired
	BankRepository br;

	public List<Bank> getPost(List<Bank> a) {
		
		return br.saveAll(a);
	}
	public Bank getName(String a) {
		return br.getBankName(a);
	}
	public List<Bank> gets() {
		return br.findAll();
	}
}
