package Servico;

import Animal.Cachorro;
import Animal.Gato;
import Animal.OutroAnimal;

public abstract class Servico {
    private String nome;
    private double precoBase;

    //construtor
    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    //methods
    public abstract double calcularPrecoCao(Cachorro animal);
    public abstract double calcularPrecoGato(Gato animal);
    public abstract double calcularPrecoOutro(OutroAnimal animal);
    
    
    //toString
    @Override
    public String toString() {
        return "Servico: " + "Nome: " + nome + ", Preco Base: " + precoBase;
    }
}
