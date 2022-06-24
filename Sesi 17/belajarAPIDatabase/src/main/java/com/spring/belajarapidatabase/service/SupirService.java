package com.spring.belajarapidatabase.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.belajarapidatabase.model.SupirModel;
import com.spring.belajarapidatabase.repository.SupirRepository;

@Service
@Transactional
public class SupirService {
	
	@Autowired
	private SupirRepository supirRepository;
	
	public List<SupirModel> ListAllSupir() {
		return supirRepository.findAll();
	}
	
	public void saveSupir(SupirModel supir) {
		supirRepository.save(supir);
	}
	
	public SupirModel getSupir(Integer id) {
		return supirRepository.findById(id).get();
	}
	
	public void deleteSupir(Integer id) {
		supirRepository.deleteById(id);
	}
}
