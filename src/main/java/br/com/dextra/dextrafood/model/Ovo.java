package br.com.dextra.dextrafood.model;

/**
 *
 * @author wendellmiranda
 */
public class Ovo implements Ingrediente {
	private String nome = "Ovo";
    private int quantidade;
    private double valor;
    
    public Ovo(int quantidade) {
    	 	this.valor = 0.80;
        this.quantidade = quantidade;
    }
    
    public Ovo(int quantidade, double valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double valor() {
        return valor * quantidade;
    }

    @Override
    public int quantidade() {
        return this.quantidade;
    }
    
    @Override
    public String toString() {
    		return nome();
    }
    
}
