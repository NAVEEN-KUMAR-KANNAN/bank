package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.BankService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value="/bank")
public class BankController {

	@Autowired
	BankService bs;
	
	@PostMapping(value="/post")
	public List<Bank> getPost(@RequestBody List<Bank> a) {
		return bs.getPost(a);
	}
	@GetMapping(value="/getbyIfsc/{ifsc}")
	public String gets(@PathVariable String ifsc){
		return bs.gets(ifsc +"this is ifsc code");
	}
	
	@GetMapping(value="/getBankName/{a}")
	public Bank getName(@PathVariable String a) {
		return bs.getName(a);
	}
	@GetMapping("/getAll")
	public List<Bank> getAll() {
		return bs.getAll();
	}
	
	
	
}
