package br.com.dextra.dextrafood.model;

/**
 *
 * @author wendellmiranda
 */
public class Bacon implements Ingrediente{
	private String nome = "Bacon";
    private int quantidade;
    private double valor;
    
    
    public Bacon(int quantidade){
    		this.valor = 2.00;
        this.quantidade = quantidade;
    }
    
    public Bacon(int quantidade, double valor){
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double valor() {
        return this.valor*this.quantidade;
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
