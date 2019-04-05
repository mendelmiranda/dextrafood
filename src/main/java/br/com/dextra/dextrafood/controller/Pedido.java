package br.com.dextra.dextrafood.controller;

import br.com.dextra.dextrafood.model.Alface;
import br.com.dextra.dextrafood.model.Bacon;
import br.com.dextra.dextrafood.model.HamburguerDeCarne;
import br.com.dextra.dextrafood.model.Ingrediente;
import br.com.dextra.dextrafood.model.Lanche;
import br.com.dextra.dextrafood.model.Ovo;
import br.com.dextra.dextrafood.model.Queijo;

public class Pedido {
	
	
	public Lanche finalizaPedido(Lanche lanche) {
		return lanche;
	}
	

	public Ingrediente montaIngrediente(String ingrediente, int quantidade) {
//		Ingrediente ingredient = null;
		if ("Alface".equals(ingrediente)) {
			return new Alface(quantidade);
		}
		if ("Bacon".equals(ingrediente)) {
			 return new Bacon(quantidade);
		}
		if ("Hamburguer de carne".equals(ingrediente)) {
			return new HamburguerDeCarne(quantidade);
		}
		if ("Ovo".equals(ingrediente)) {
			return new Ovo(quantidade);
		}
		if ("Queijo".equals(ingrediente)) {
			return new Queijo(quantidade);
		}
		return null;

	}

}
