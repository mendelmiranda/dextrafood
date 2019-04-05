package br.com.dextra.dextrafood.model;
/**
 *
 * @author wendellmiranda
 */
public class HamburguerDeCarne implements Ingrediente {
    
	private String nome = "Hamburguer de carne";
    private int quantidade;
    private double valor;
    
    public HamburguerDeCarne(int quantidade){
    		this.valor = 3.0;
        this.quantidade = quantidade;
    }
    
    public HamburguerDeCarne(int quantidade, double valor){
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double valor() {
        if(quantidade >2){
           return this.valor * quantidade - verificaQuantidade(quantidade);
        }else {
            return this.valor * quantidade;
        }
    }

    @Override
    public int quantidade() {
        return this.quantidade;
    }
    
    public double verificaQuantidade(double quantidade){
        int valorPromo = 1;
        return quantidade * valorPromo;
    }
    
    @Override
    public String toString() {
    		return nome();
    }
    
}
