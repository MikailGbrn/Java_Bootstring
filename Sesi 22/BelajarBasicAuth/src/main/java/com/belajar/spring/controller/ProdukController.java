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

import com.belajar.spring.entity.Produk;
import com.belajar.spring.service.ProdukService;

@RestController
@RequestMapping("/api/produks")
public class ProdukController {
	@Autowired
	ProdukService produkService;
	
	@CrossOrigin
	@GetMapping("")
	public List<Produk> list() {
		return produkService.findAllProduk();
	}
	
	@CrossOrigin
	@GetMapping("/id/{id}")
	public ResponseEntity<Produk> produks(@PathVariable Integer id){
		try {
			Produk produk = produkService.findProdukById(id);
			return new ResponseEntity<Produk>(produk, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Produk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@PostMapping("")
	public ResponseEntity<?> produks(@RequestBody Produk produk) {
		produkService.saveorUpdateProduk(produk);
		return new ResponseEntity<>("Berhasil Simpan Data Produk", HttpStatus.OK);
	}
	
	@CrossOrigin
	@PutMapping("/id/{id}")
	public ResponseEntity<?> update(@RequestBody Produk produk, @PathVariable Integer id) {
		try {
			Produk existProduk = produkService.findProdukById(id);
			if (existProduk.getId() != id) {
				return new ResponseEntity<>("ID Tidak Ada !!",HttpStatus.OK);
			}
			produk.setId(id);
			produkService.saveorUpdateProduk(produk);
			return new ResponseEntity<>("Berhasil Edit Data Supirs Dengan Nama "+produk.getNama_produk(), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("TIDAK ADAAA",HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		produkService.deleteProduk(id);
		return new ResponseEntity<>("Berhasil Hapus Data Produk", HttpStatus.OK);
	}
	
}
