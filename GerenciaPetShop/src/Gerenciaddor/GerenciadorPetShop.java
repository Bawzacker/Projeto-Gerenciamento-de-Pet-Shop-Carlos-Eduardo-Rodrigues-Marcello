package Gerenciaddor;

import Animal.Cachorro;
import Animal.Gato;
import Animal.OutroAnimal;
import Animal.PelagemEnum;
import Animal.PorteEnum;
import Animal.TamanhoEnum;
import Servico.Banho;
import Servico.ConsultaVeterinaria;
import Servico.Tosa;

public class GerenciadorPetShop {
    public static void main(String[] args) {
        
        Gato g1 = new Gato("Azul", PelagemEnum.media, "PCB", 5, "Marcia", "Merlin");
        Gato g2 = new Gato("Azul", PelagemEnum.media, "PCB", 5, "Marcia", "Merlin");
        Gato g3 = new Gato("Amarelo", PelagemEnum.curta, "Azul Russo", 3, "Marcio", "Alice");
        Cachorro c1 = new Cachorro("Labrador", 4, "Jorge", "Thor", PorteEnum.grande);
        OutroAnimal o1 = new OutroAnimal("Papagaio", TamanhoEnum.pequeno, "Ave", 12, "Jessica", "Gary");
        
        Banho b1 = new Banho("Banho", 30);
        Tosa t1 = new Tosa("Tosa", 25);
        ConsultaVeterinaria cv1 = new ConsultaVeterinaria("Consulta", 75);
        
        System.out.println("Instâncias de Animais");
        System.out.println(g1.toString());
        System.out.println(c1.toString());
        System.out.println(o1.toString());
        
        System.out.println("");
        
        System.out.println("Banhos");
        System.out.println(g1.getNome() + ": " + b1.calcularPrecoGato(g1));
        System.out.println(c1.getNome() + ": " + b1.calcularPrecoCao(c1));
        System.out.println(o1.getNome() + ": " + b1.calcularPrecoOutro(o1));
        
        System.out.println("");
        
        System.out.println("Tosas");
        System.out.println(g1.getNome() + ": " + t1.calcularPrecoGato(g1));
        System.out.println(c1.getNome() + ": " + t1.calcularPrecoCao(c1));
        System.out.println(o1.getNome() + ": " + t1.calcularPrecoOutro(o1));
        
        System.out.println("");
        
        System.out.println("Consultas");
        System.out.println(g1.getNome() + ": " + cv1.calcularPrecoGato(g1));
        System.out.println(c1.getNome() + ": " + cv1.calcularPrecoCao(c1));
        System.out.println(o1.getNome() + ": " + cv1.calcularPrecoOutro(o1));
        
        System.out.println("");
        
        System.out.println("Comparação por equals()");
        System.out.println(g1.equals(g2));
        System.out.println(g2.equals(g3));
        System.out.println(g1.equals(g3));
        
        System.out.println("");
        
        System.out.println("Comparação por hashCode()");
        System.out.println(g1.hashCode() == g2.hashCode());
        System.out.println(g2.hashCode() == g3.hashCode());
        System.out.println(g1.hashCode() == g3.hashCode());
    }
}
