package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    @Override
    public String toString() {
        return "ContagemPalavras{" +
                "palavras=" + palavras +
                '}';
    }

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(palavras);
    }

    public Integer exibirContagemPalavras() {
        int quantidade = 0;
        for(int i : palavras.values()) {
            quantidade += i;
        }
        return quantidade;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorOcorrencia = 0;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorOcorrencia) {
                maiorOcorrencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        contagemPalavras.exibirPalavras();
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());

        contagemPalavras.removerPalavra("Python");

        contagemPalavras.exibirPalavras();
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
