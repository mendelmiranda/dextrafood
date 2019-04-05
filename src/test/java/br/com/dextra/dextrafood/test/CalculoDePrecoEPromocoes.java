package br.com.dextra.dextrafood.test;

import org.junit.Test;

import br.com.dextra.dextrafood.model.Alface;
import br.com.dextra.dextrafood.model.HamburguerDeCarne;
import br.com.dextra.dextrafood.model.Lanche;
import junit.framework.Assert;

public class CalculoDePrecoEPromocoes {

	@Test
	public void testCalculaValorDoDescontoDoAlface() {
		Lanche xEggBacon = new Lanche();
		xEggBacon.setDescricao("X-Egg Bacon mendel");
		//xEggBacon.adicionaIngrediente(new Bacon(1));
		xEggBacon.adicionaIngrediente(new Alface(1));
		xEggBacon.adicionaIngrediente(new HamburguerDeCarne(3));
		
		double valor = 5.76;
		Assert.assertEquals(valor, xEggBacon.getValorDoLanche(), 0.001);
	}
	
	@Test
	public void testCalculaValorDoDescontoParaMaisCarne() {
		Lanche xEggBacon = new Lanche();
		xEggBacon.setDescricao("X-Egg Bacon mendel");
		//xEggBacon.adicionaIngrediente(new Bacon(1));
		//xEggBacon.adicionaIngrediente(new Alface(1));
		xEggBacon.adicionaIngrediente(new HamburguerDeCarne(3));
	
		Assert.assertEquals(6.0, xEggBacon.getValorDoLanche(), 0.001);
	}
	
	
}