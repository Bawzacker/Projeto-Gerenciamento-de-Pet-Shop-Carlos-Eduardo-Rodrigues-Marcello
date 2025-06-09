package Servico;

import Animal.Cachorro;
import Animal.Gato;
import Animal.OutroAnimal;

public class Banho extends Servico {

    //construtor
    public Banho(String nome, double precoBase) {
        super(nome, precoBase);
    }

    //metodos
    @Override
    public double calcularPrecoCao(Cachorro animal) {
        double porte;
        porte = 0d;
        
        switch(animal.getPorte()){
            case pequeno -> porte = 1;
            case medio -> porte = 2;
            case grande -> porte = 3;
        }
        
        if (porte != 0){
            return getPrecoBase() * porte;
        }else{
            System.out.println("Erro");
            return 0;
        }
    }
    
    @Override
    public double calcularPrecoGato(Gato animal) {
        double pelagem;
        pelagem = 0;
        
        switch(animal.getPelagem()){
            case curta -> pelagem = 1;
            case media -> pelagem = 2;
            case longa -> pelagem = 3;
        }
        
        if (pelagem != 0){
            return getPrecoBase() * pelagem;
        }else{
            System.out.println("Erro");
            return 0;
        }
    }
    
    @Override
    public double calcularPrecoOutro(OutroAnimal animal) {
        double tamanho;
        tamanho = 0;
        
        switch(animal.getTamanho()){
            case pequeno -> tamanho = 1;
            case medio -> tamanho = 2;
            case grande -> tamanho = 3;
        }
        
        if (tamanho != 0){
            return getPrecoBase() * tamanho;
        }else{
            System.out.println("Erro");
            return 0;
        }
    }
    
    //toString
    @Override
    public String toString() {
        return getNome() + ": " + getPrecoBase();
    }
    
    //hashCode
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banho other = (Banho) obj;
        return true;
    }
}
