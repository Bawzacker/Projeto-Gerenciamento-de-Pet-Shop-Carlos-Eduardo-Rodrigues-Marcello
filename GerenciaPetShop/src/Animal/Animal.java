package Animal;

import java.util.Objects;

public abstract class Animal {
    private String racaTipo;
    private int idade;
    private String proprietario;
    private String nome;

    //construtor
    public Animal(String racaTipo, int idade, String proprietario, String nome) {
        this.racaTipo = racaTipo;
        this.idade = idade;
        this.proprietario = proprietario;
        this.nome = nome;
    }

    //getters e setters
    public String getRacaTipo() {
        return racaTipo;
    }

    public void setRacaTipo(String racaTipo) {
        this.racaTipo = racaTipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //hashCode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.racaTipo);
        hash = 53 * hash + this.idade;
        hash = 53 * hash + Objects.hashCode(this.proprietario);
        hash = 53 * hash + Objects.hashCode(this.nome);
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
        final Animal other = (Animal) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.racaTipo, other.racaTipo)) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    //toString
    @Override
    public String toString() {
        return " Raca: " + racaTipo + ", Idade: " + idade + ", Proprietario: " + proprietario + ", Nome: " + nome;
    }
}
