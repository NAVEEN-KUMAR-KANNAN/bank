package com.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Dao.BankDao;
import com.Bank.Entity.Bank;

@Service
public class BankService {

	@Autowired
	BankDao bd;

	public List<Bank> getPost(List<Bank> a) {
		
		return bd.getPost(a);
	}
	public Bank getName(String a) {
		return bd.getName(a);
	}
	public String gets(String ifsc) {
		
		List<Bank> banks = bd.gets();
		String bank = "";
		for(int i =0;i<banks.size();i++) {
			if(banks.get(i).getIfscCode().equals(ifsc)) {
				bank = banks.get(i).getBankName();
			}
		}
		return bank;
	}
}
