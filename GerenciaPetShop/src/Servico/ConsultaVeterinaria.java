package Servico;

import Animal.Cachorro;
import Animal.Gato;
import Animal.OutroAnimal;

public class ConsultaVeterinaria extends Servico{

    //construtor
    public ConsultaVeterinaria(String nome, double precoBase) {
        super(nome, precoBase);
    }
    
    //metodos
    @Override
    public double calcularPrecoCao(Cachorro animal) {
        return getPrecoBase() * 1.2;
    }
    
    @Override
    public double calcularPrecoGato(Gato animal) {
        return getPrecoBase();
    }
    
    @Override
    public double calcularPrecoOutro(OutroAnimal animal) {
        return getPrecoBase() * 1.5;
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
        final ConsultaVeterinaria other = (ConsultaVeterinaria) obj;
        return true;
    }
}
