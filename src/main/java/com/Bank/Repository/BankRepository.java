package com.Bank.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bank.Entity.Bank;


public interface BankRepository extends JpaRepository<Bank,Integer> {

	@Query(value=("select * from bank_details where ifsc_code like ?"),nativeQuery = true)
	public Bank getBankName(String a);
}
