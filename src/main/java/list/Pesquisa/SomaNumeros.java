package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    private void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    private int calcularSoma() {
        int soma = 0;
        for(Integer n : numeros) {
            soma += n;
        }
        return soma;
    }

    private int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for(Integer n : numeros) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    private int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        for(Integer n : numeros) {
            if (n <= menorNumero) {
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    private void exibirNumeros() {
        System.out.println(numeros);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);

        System.out.println("A soma de todos os numeros da lista e: " + somaNumeros.calcularSoma());

        System.out.println("O maior valor da lista e: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor valor da lista e: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
}