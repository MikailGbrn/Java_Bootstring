package com.belajar.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.belajar.spring.repository.ProdukRepository;
import com.belajar.spring.service.ProdukService;

import org.springframework.data.domain.Pageable;

@Controller
public class UiController {
	
	@Autowired
	private ProdukService produkService;
	
	@GetMapping("/index")
	public ModelMap getAll(Pageable pageable) {
		return new ModelMap().addAttribute("produks", produkService.listAllProduk());
	}
}
