package com.belajar.spring.service;

import java.util.List;

import com.belajar.spring.model.Produk;

public interface ProdukService {

	List<Produk> findAllProduk();

	Produk findProdukById(int id);

	Produk saveorUpdateProduk(Produk produk);

	void deleteProduk(int id);
}
