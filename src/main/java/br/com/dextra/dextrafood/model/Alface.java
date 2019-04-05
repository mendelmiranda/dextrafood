package br.com.dextra.dextrafood.model;

/**
 *
 * @author wendellmiranda
 */
public class Alface implements Ingrediente {
    private String nome = "Alface";
    private int quantidade;
    private double valor;
    
    public Alface(int quantidade){
    		this.valor = 0.40;
        this.quantidade = quantidade;
    }
    
    public Alface(int quantidade, double valor){
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double valor() {
        return (this.valor*quantidade);
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
