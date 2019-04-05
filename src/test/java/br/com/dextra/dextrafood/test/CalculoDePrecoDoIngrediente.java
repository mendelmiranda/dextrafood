package br.com.dextra.dextrafood.test;

import org.junit.Test;

import br.com.dextra.dextrafood.model.Bacon;
import br.com.dextra.dextrafood.model.Lanche;
import br.com.dextra.dextrafood.model.Ovo;
import junit.framework.Assert;

class CalculoDePrecoDoIngrediente {

	@Test
	public void testCalculaValorDoIngrediene() {
		Lanche xEggBacon = new Lanche();
		xEggBacon.setDescricao("X-Egg Bacon mendel");
		xEggBacon.adicionaIngrediente(new Bacon(1));
		xEggBacon.adicionaIngrediente(new Ovo(2,6));
	
		Assert.assertEquals(14.0, xEggBacon.getValorDoLanche(), 0.001);
	}


}
