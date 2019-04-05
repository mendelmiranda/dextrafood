package br.com.dextra.dextrafood.model;

/**
 *
 * @author wendellmiranda
 */
public class Queijo implements Ingrediente {

	private String nome = "Queijo";
    private int quantidade;
    private double valor;

    public Queijo(int quantidade) {
    		this.valor = 1.50;
        this.quantidade = quantidade;
    }
    
    public Queijo(int quantidade, double valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double valor() {
        if (quantidade > 2) {
            return this.valor * quantidade - verificaQuantidade(quantidade);
        } else {
            return this.valor * quantidade;
        }
    }

    @Override
    public int quantidade() {
        return this.quantidade;
    }

    public double verificaQuantidade(double quantidade) {
        int valorPromo = 1;
        return quantidade * valorPromo;
    }
    
    @Override
    public String toString() {
    		return nome();
    }

}
