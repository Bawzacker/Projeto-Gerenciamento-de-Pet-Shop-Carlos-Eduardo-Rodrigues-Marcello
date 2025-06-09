package Animal;

import java.util.Objects;

public class Gato extends Animal {
    private String corOlhos;
    private PelagemEnum pelagem;
    
    //construtor
    public Gato(String corOlhos, PelagemEnum pelagem, String racaTipo, int idade, String proprietario, String nome) {
        super(racaTipo, idade, proprietario, nome);
        this.corOlhos = corOlhos;
        this.pelagem = pelagem;
    }
    
    
    //getter e setter
    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public PelagemEnum getPelagem() {
        return pelagem;
    }

    public void setPelagem(PelagemEnum pelagem) {
        this.pelagem = pelagem;
    }
    
    //hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.corOlhos);
        hash = 73 * hash + Objects.hashCode(this.pelagem);
        return hash;
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
        final Gato other = (Gato) obj;
        if (!Objects.equals(this.corOlhos, other.corOlhos)) {
            return false;
        }
        return Objects.equals(this.pelagem, other.pelagem);
    }

    //toString
    @Override
    public String toString() {
        return "Gato: " + "Cor dos Olhos: " + corOlhos + ", Pelagem: " + pelagem + super.toString();
    }
}
