package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, Integer>{

}
