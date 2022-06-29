package com.belajar.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.belajar.spring.service.ProdukService;


@Controller
public class UiController {
	
	@Autowired
	private ProdukService produkService;
	
	@RequestMapping(value = "/produkkk", method = RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("produks", produkService.findAllProduk());
		return "myview";
	}
}
