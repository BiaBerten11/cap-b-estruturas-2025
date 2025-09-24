package application;

import application.lista.ListaSimples;
import application.pilha.PilhaSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("Terceiro");

        lista.remover(1);

        System.out.println(lista);

        PilhaSimples pilha = new PilhaSimples(3);
        pilha.empilhar("Primeiro elemento");
        pilha.empilhar("Segundo elemento");

        System.out.println(pilha.desempilhar());
        pilha.empilhar("Terceiro elemento");
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
    }
}

