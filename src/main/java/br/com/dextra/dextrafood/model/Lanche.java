package br.com.dextra.dextrafood.model;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wendellmiranda
 */
public class Lanche {

    private String descricao;
    private double valorDoLanche;

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void calcula() {
        double total = calculaValorDolanche(this.ingredientes);
        
        if(verificaSeIngredientePertencePromocao(this.ingredientes) && !verificaSeTemBacon(this.ingredientes)){
            double desconto = (10 * total) / 100;
            setValorDoLanche(total-desconto);
        }else{
            setValorDoLanche(total);
        }
    }
    
    public void adicionaIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
        calcula();
    }

    public Double calculaValorDolanche(List<Ingrediente> ingrediente) {
        return ingrediente.stream().mapToDouble(Ingrediente::valor).sum();
    }

    public boolean verificaSeIngredientePertencePromocao(List<Ingrediente> totalDeIngredientes) {    
       return totalDeIngredientes.stream().anyMatch(valor -> valor.nome().equals("Alface"));
    }
    
    public boolean verificaSeTemBacon(List<Ingrediente> totalDeIngredientes) {    
        return totalDeIngredientes.stream().anyMatch(valor -> valor.nome().equals("Bacon"));
     }
    
    public List<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDoLanche() {
        return valorDoLanche;
    }

    public void setValorDoLanche(double valorDoLanche) {
        this.valorDoLanche = valorDoLanche;
    }
    
    

}
