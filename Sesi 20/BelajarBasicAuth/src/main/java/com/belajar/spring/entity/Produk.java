package com.belajar.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produk")
public class Produk {
	private int id;
	private String nama_produk;
	private double harga_jual;
	private double harga_beli;
	
	public Produk() {
		
	}
	
	public Produk(String nama_produk, double harga_jual, double harga_beli) {
		this.nama_produk = nama_produk;
		this.harga_beli = harga_beli;
		this.harga_jual = harga_jual;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public double getHarga_jual() {
		return harga_jual;
	}

	public void setHarga_jual(double harga_jual) {
		this.harga_jual = harga_jual;
	}

	public double getHarga_beli() {
		return harga_beli;
	}

	public void setHarga_beli(double harga_beli) {
		this.harga_beli = harga_beli;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
