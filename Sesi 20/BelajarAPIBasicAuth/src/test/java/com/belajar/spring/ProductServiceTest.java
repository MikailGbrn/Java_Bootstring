package com.belajar.spring;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import static org.mockito.Mockito.times;

import com.belajar.spring.model.Produk;
import com.belajar.spring.repository.ProdukRepository;
import com.belajar.spring.service.ProdukService;
import com.belajar.spring.service.impl.ProdukServiceImpl;

@RunWith(SpringRunner.class)
public class ProductServiceTest {

	@InjectMocks
	private ProdukService produkService = new ProdukServiceImpl();

	@Mock
	private ProdukRepository produkRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(produkService, "produkRepository", produkRepository);
	}

	@Test
	public void testFindAll() {

		final List<Produk> datas = TestObjectFactory.createProductList(10);
		Mockito.when(produkRepository.findAll()).thenReturn(datas);

		final List<Produk> actual = produkService.findAllProduk();
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(datas.size()));
	}

	@Test
	public void testProductById() throws Exception {

		final int id = new Random().nextInt();
		final Produk product = TestObjectFactory.createProduct();
		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.of(product));

		final Produk actual = produkService.findProdukById(id);
		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(product.getId()));
		MatcherAssert.assertThat(actual.getNama_produk(), Matchers.equalTo(product.getNama_produk()));
		MatcherAssert.assertThat(actual.getHarga_beli(), Matchers.equalTo(product.getHarga_beli()));
		MatcherAssert.assertThat(actual.getHarga_jual(), Matchers.equalTo(product.getHarga_jual()));
	}

	@Test
	public void testProductByIdWithNullDataFromDB() throws Exception {
		final int id = new Random().nextInt();

		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.empty());
		final Produk actual = produkService.findProdukById(id);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testSaveUpdateProduct() {
		final Produk product = TestObjectFactory.createProduct();
		Mockito.when(produkRepository.save(product)).thenReturn(product);

		final Produk actual = produkService.saveorUpdateProduk(product);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testDeleteProduct() {
		final int id = new Random().nextInt();
		Produk produk = TestObjectFactory.createProduct();

		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.of(produk));
		Mockito.doNothing().when(produkRepository).delete(produk);
		produkService.deleteProduk(id);

		Mockito.verify(produkRepository, times(1)).delete(produk);
	}
}
