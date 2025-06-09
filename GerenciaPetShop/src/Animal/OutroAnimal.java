package Animal;

import java.util.Objects;

public class OutroAnimal extends Animal{
    private String tipoEspecifico;
    private TamanhoEnum tamanho;
    
    //construtor

    public OutroAnimal(String tipoEspecifico, TamanhoEnum tamanho, String racaTipo, int idade, String proprietario, String nome) {
        super(racaTipo, idade, proprietario, nome);
        this.tipoEspecifico = tipoEspecifico;
        this.tamanho = tamanho;
    }
    
    
    //getter e setter
    public String getTipoEspecifico() {
        return tipoEspecifico;
    }

    public void setTipoEspecifico(String tipoEspecifico) {
        this.tipoEspecifico = tipoEspecifico;
    }

    public TamanhoEnum getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoEnum tamanho) {
        this.tamanho = tamanho;
    }
    
    //hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.tipoEspecifico);
        hash = 29 * hash + Objects.hashCode(this.tamanho);
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
        final OutroAnimal other = (OutroAnimal) obj;
        if (!this.tipoEspecifico.equals(other.tipoEspecifico)) {
            return false;
        }
        return Objects.equals(this.tamanho, other.tamanho);
    }
    
    //toString
    @Override
    public String toString() {
        return "Outro Animal: " + "Tipo Especifico: " + tipoEspecifico + ", Tamanho: " + tamanho + super.toString();
    }
}
