package com.phone.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.phone.entity.Phone;
import com.phone.exception.PriceException;
import com.phone.service.PhoneService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value="/Phone")
public class PhoneController {

	@Autowired
	PhoneService ps;
	@PostMapping(value="/posts")
	public List<Phone> posts (@RequestBody List<Phone> p) {
		return ps.posts(p);
	}
//	@GetMapping()
//	public String gets(@RequestBody List<Phone> e) {
//		return ps.gets(e);
//	}
//	
	@GetMapping(value="/getAll")
	public List<Object> getAll() {
		return ps.getAll();
	}
	@GetMapping(value="/getPrices/{a}/{b}")
	public List<Phone> getAll(@PathVariable int a,@PathVariable int b) {
		return ps.getPrices(a,b);
	}
	@GetMapping(value="/getAlll")
	public List<Phone> getAlll() {
		return ps.getAlll();
	}
	
	@GetMapping(value="/getBrand/{a}")
	public List<Phone>getBrand(@PathVariable String a) {
		return ps.getBrand(a);
	}
	@GetMapping(value="/getPrice/{a}")
	public List<Phone> getPrice(@PathVariable int a) {
		return ps.getPrice(a);
	}
	@PostMapping("/priceException")
	public String getExcep(@RequestBody Phone a) throws PriceException{
		
		return ps.getExcep(a);
    }
	@GetMapping(value="/getRate/{a}")
	public Phone getRate(@PathVariable int a) throws Exception{
		return ps.getRate(a) ;
	}
	
	@GetMapping(value="/getName/{a}")
	public Phone getName(@PathVariable String a) throws PriceException{
		return ps.getName(a);
	}
	@GetMapping(value="/getFirst/{a}")
	public Phone getFirst(@PathVariable String a) throws PriceException {
		return ps.getFirst(a);
	}
	
	
	
	
}
