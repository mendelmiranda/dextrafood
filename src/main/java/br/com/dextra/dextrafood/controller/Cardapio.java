package br.com.dextra.dextrafood.controller;

import br.com.dextra.dextrafood.model.Alface;
import java.util.ArrayList;
import java.util.List;

import br.com.dextra.dextrafood.model.Bacon;
import br.com.dextra.dextrafood.model.HamburguerDeCarne;
import br.com.dextra.dextrafood.model.Ingrediente;
import br.com.dextra.dextrafood.model.Lanche;
import br.com.dextra.dextrafood.model.Ovo;
import br.com.dextra.dextrafood.model.Queijo;
import java.util.Arrays;


/**
 *
 * @author wendellmiranda
 */
public class Cardapio {
    
    public List<Lanche> listaLancheDoCardapio(){
    	
        Lanche xBacon = new Lanche();
        xBacon.setDescricao("X-Bacon");
        xBacon.adicionaIngrediente(new Bacon(1));
        xBacon.adicionaIngrediente(new HamburguerDeCarne(1));
        xBacon.adicionaIngrediente(new Queijo(1));
        
        Lanche xBurguer = new Lanche();
        xBurguer.setDescricao("X-Burguer");
        xBurguer.adicionaIngrediente(new HamburguerDeCarne(1));
        xBurguer.adicionaIngrediente(new Queijo(1));
        
        Lanche xEgg = new Lanche();
        xEgg.setDescricao("X-Egg");
        xEgg.adicionaIngrediente(new Ovo(1));
        xEgg.adicionaIngrediente(new HamburguerDeCarne(1));
        xEgg.adicionaIngrediente(new Queijo(1));
        
        Lanche xEggBacon = new Lanche();
        xEggBacon.setDescricao("X-Egg Bacon");
        xEggBacon.adicionaIngrediente(new Ovo(1,5));
        xEggBacon.adicionaIngrediente(new Bacon(1));
        xEggBacon.adicionaIngrediente(new HamburguerDeCarne(1));
        xEggBacon.adicionaIngrediente(new Queijo(1));
        
        List<Lanche> lanchesDoCardapio = new ArrayList<>();
        lanchesDoCardapio.add(xBacon);
        lanchesDoCardapio.add(xBurguer);
        lanchesDoCardapio.add(xEgg);
        lanchesDoCardapio.add(xEggBacon);
                
        //double total = calcula(lanchesDoCardapio);        
        
        
        return lanchesDoCardapio;      
    }
    
    public static double calculaIngredientes(List<Lanche> lanches){
        return lanches.stream().mapToDouble(Lanche::getValorDoLanche).sum();
    }
    
    public static double calcula(List<Lanche> lanches){
        return lanches.stream().mapToDouble(Lanche::getValorDoLanche).sum();
    }
    
    public List<Ingrediente> listaDeIngredientes(){
        return Arrays.asList(new Alface(1), new Bacon(1), new HamburguerDeCarne(1), new Ovo(1), new Queijo(1));
    }
    
    
}
