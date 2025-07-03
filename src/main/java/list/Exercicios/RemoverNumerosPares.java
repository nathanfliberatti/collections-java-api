package main.java.list.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class RemoverNumerosPares {

    List<Integer> numerosList;

    public RemoverNumerosPares() {
        this.numerosList = new ArrayList<>();
    }

    private void adicionarNumeros(int n) {
        numerosList.add(n);
    }

    private List<Integer> removerNumerosPares() {
        List<Integer> pares = new ArrayList<>();
        for(Integer n : numerosList) {
            if (n % 2 == 0) {
                pares.add(n);
            }
        }
        numerosList.removeAll(pares);

        return numerosList;
    }

    public static void main(String[] args) {
        RemoverNumerosPares numeros = new RemoverNumerosPares();

        numeros.adicionarNumeros(1);
        numeros.adicionarNumeros(2);
        numeros.adicionarNumeros(3);
        numeros.adicionarNumeros(4);
        numeros.adicionarNumeros(5);
        numeros.adicionarNumeros(6);
        numeros.adicionarNumeros(7);
        numeros.adicionarNumeros(8);
        numeros.adicionarNumeros(9);
        numeros.adicionarNumeros(10);

        System.out.println("Lista completa: " + numeros.numerosList);
        System.out.println("Lista sem os números pares: " + numeros.removerNumerosPares());
    }
}