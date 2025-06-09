package Animal;

import java.util.Objects;

public class Cachorro extends Animal {
    private PorteEnum porte;

    //construtor
    public Cachorro(String racaTipo, int idade, String proprietario, String nome, PorteEnum porte) {
        super(racaTipo, idade, proprietario, nome);
        this.porte = porte;
    }

    //getter e setter
    public PorteEnum getPorte() {
        return porte;
    }

    public void setPorte(PorteEnum porte) {
        this.porte = porte;
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.porte);
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
        final Cachorro other = (Cachorro) obj;
        return Objects.equals(this.porte, other.porte);
    }
    
    //toString

    @Override
    public String toString() {
        return "Cachorro: " + "Porte: " + porte + super.toString();
    }
}
