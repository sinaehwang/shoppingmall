package com.shop.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Restaurent {

	@Autowired
	private Chef chef;
	
}
