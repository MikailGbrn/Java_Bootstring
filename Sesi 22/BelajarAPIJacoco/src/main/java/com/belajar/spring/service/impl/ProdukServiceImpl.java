package com.belajar.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.spring.model.Produk;
import com.belajar.spring.repository.ProdukRepository;
import com.belajar.spring.service.ProdukService;

@Service
public class ProdukServiceImpl implements ProdukService {

	@Autowired
	private ProdukRepository produkRepository;

	@Override
	public List<Produk> findAllProduk() {
		return produkRepository.findAll();
	}

	@Override
	public Produk saveorUpdateProduk(Produk produk) {
		return produkRepository.save(produk);
	}

	@Override
	public Produk findProdukById(int id) {
		Produk produk = produkRepository.findById(id).orElse(new Produk());
		return produk;
	}

	@Override
	public void deleteProduk(int id) {
		Produk produk = produkRepository.findById(id).orElse(new Produk());
		produkRepository.delete(produk);

	}

}
