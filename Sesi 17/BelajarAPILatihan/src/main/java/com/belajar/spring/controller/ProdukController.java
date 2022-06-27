package com.belajar.spring.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.spring.model.Produk;
import com.belajar.spring.service.ProdukService;

@RestController
@RequestMapping("/api")
public class ProdukController {
	@Autowired
	ProdukService produkService;
	
	@CrossOrigin
	@GetMapping("/produks")
	public List<Produk> list() {
		return produkService.listAllProduk();
	}
	
	@CrossOrigin
	@GetMapping("/produks/{id}")
	public ResponseEntity<Produk> produks(@PathVariable Integer id){
		try {
			Produk produk = produkService.getProduk(id);
			return new ResponseEntity<Produk>(produk, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Produk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@PostMapping("/produks")
	public ResponseEntity<?> produks(@RequestBody Produk produk) {
		produkService.saveProduk(produk);
		return new ResponseEntity<>("Berhasil Simpan Data Produk", HttpStatus.OK);
	}
	
	@CrossOrigin
	@PutMapping("/produks/{id}")
	public ResponseEntity<?> update(@RequestBody Produk produk, @PathVariable Integer id) {
		try {
			Produk existProduk = produkService.getProduk(id);
			if (existProduk.getId() != id) {
				return new ResponseEntity<>("ID Tidak Ada !!",HttpStatus.OK);
			}
			produk.setId(id);
			produkService.saveProduk(produk);
			return new ResponseEntity<>("Berhasil Edit Data Supirs Dengan Nama "+produk.getNama_produk(), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("TIDAK ADAAA",HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@DeleteMapping("/produk/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		produkService.deleteProduk(id);
		return new ResponseEntity<>("Berhasil Hapus Data Produk", HttpStatus.OK);
	}
	
}
