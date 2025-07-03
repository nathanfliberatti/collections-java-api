package main.java.list.Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPalavras {

    private List<String> palavras;

    public OrdenacaoPalavras() {
        this.palavras = new ArrayList<>();
    }

    private void adicionarPalavras(String palavra) {
        palavras.add(palavra);
    }

    private List<String> palavrasEmOrdemAlfabetica() {
        List<String> emOrdemAlfabetica = new ArrayList<>(palavras);
        Collections.sort(emOrdemAlfabetica);
        return emOrdemAlfabetica;
    }

    public static void main(String[] args) {
        OrdenacaoPalavras ordenacaoPalavras = new OrdenacaoPalavras();

        ordenacaoPalavras.adicionarPalavras("pao");
        ordenacaoPalavras.adicionarPalavras("faca");
        ordenacaoPalavras.adicionarPalavras("queijo");
        ordenacaoPalavras.adicionarPalavras("garfo");

        System.out.println(ordenacaoPalavras.palavrasEmOrdemAlfabetica());
    }
}
