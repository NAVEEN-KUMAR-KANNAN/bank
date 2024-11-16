package com.phone.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.phone.exception.PriceException;

	@RestControllerAdvice
	public class GlobalException {
		@ExceptionHandler(PriceException.class)
		public ResponseEntity<Object> handlePrice(PriceException pk){
			return new ResponseEntity<>("NotStartsWithException",HttpStatus.NOT_FOUND);
		}
		
	}
