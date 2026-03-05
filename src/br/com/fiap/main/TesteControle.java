package br.com.fiap.main;

import br.com.fiap.model.ControlePs4;

public class TesteControle {

    public static void main(String[] args) {
        System.out.println(">>> Tentando burlar o sistema com a cor 'Rosa'...");

        System.out.println("\n1. Testando a regra no construtor:");
        ControlePs4 controleRosa = new ControlePs4("Rosa", "Branco", 500);
        System.out.println("Cor atual do objeto 'controleRosa': " + controleRosa.getCor());

        System.out.println("\n2. Testando a regra no método setCor():");
        ControlePs4 meuControle = new ControlePs4("Azul", "Azul", 800);
        System.out.println("Cor original do 'meuControle': " + meuControle.getCor());
        
        meuControle.setCor("Rosa");
        System.out.println("Cor após tentar alterar para 'Rosa': " + meuControle.getCor());

        meuControle.setCor("Dourado");
        System.out.println("Cor após alteração válida: " + meuControle.getCor());
        
        System.out.println("\n--- Proteção confirmada! O estado do objeto foi mantido consistente. ---");
        meuControle.exibirStatus();
    }
}
