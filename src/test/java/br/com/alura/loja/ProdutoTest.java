package br.com.alura.loja;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void test() {
		
		Produto p = new Produto("Caneta", BigDecimal.TEN);
		assertEquals(p.getPreco(), BigDecimal.TEN);
		
	}

}
