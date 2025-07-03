package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros () {
        this.numeros = new ArrayList<>();
    }

    private void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    private List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    private List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(numeros);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(20);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}