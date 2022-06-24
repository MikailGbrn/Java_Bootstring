package com.spring.belajarapidatabase.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.belajarapidatabase.model.SupirModel;
import com.spring.belajarapidatabase.service.SupirService;

@RestController
@RequestMapping("/api/v1")
public class SupirController {
	@Autowired
	private SupirService supirService;
	
	@CrossOrigin
	@GetMapping("/supirs")
	public List<SupirModel> list() {
		return supirService.ListAllSupir();
	}
	
	@CrossOrigin
	@GetMapping("/supirs/{id}")
	public ResponseEntity<SupirModel> supirs(@PathVariable Integer id){
		try {
			SupirModel supir = supirService.getSupir(id);
			return new ResponseEntity<SupirModel>(supir, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<SupirModel>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@PostMapping("/supirs")
	public ResponseEntity<?> supirs(@RequestBody SupirModel supir) {
		supirService.saveSupir(supir);
		return new ResponseEntity<>("Berhasil Simpan Data Supirs", HttpStatus.OK);
	}
	
	@CrossOrigin
	@PutMapping("/supirs/{id}")
	public ResponseEntity<?> update(@RequestBody SupirModel supir, @PathVariable Integer id) {
		try {
			SupirModel existSupir = supirService.getSupir(id);
			if (existSupir.getId() != id) {
				return new ResponseEntity<>("ID Tidak Ada !!",HttpStatus.OK);
			}
			supir.setId(id);
			supirService.saveSupir(supir);
			return new ResponseEntity<>("Berhasil Edit Data Supirs Dengan Nama "+supir.getFirstName(), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("TIDAK ADAAA",HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@DeleteMapping("/supirs/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		supirService.deleteSupir(id);
		return new ResponseEntity<>("Berhasil Hapus Data Supirs", HttpStatus.OK);
	}
}
