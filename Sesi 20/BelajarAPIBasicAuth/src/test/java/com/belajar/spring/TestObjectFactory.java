package com.belajar.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.belajar.spring.model.Produk;

public class TestObjectFactory {
	public static Produk createProduct() {
		  final Produk product = new Produk();
		  product.setId(new Random().nextInt());
		  product.setNama_produk(RandomStringUtils.randomAlphabetic(10));
		  product.setHarga_beli(new Random().nextDouble());
		  product.setHarga_jual(new Random().nextDouble());

		  return product;
		}

		public static List<Produk> createProductList(final int size){
		  final List<Produk> result = new ArrayList<>();
		  for(int i=0; i<size; i++) {
		    result.add(createProduct());
		  }
		  return result;
		}
}
