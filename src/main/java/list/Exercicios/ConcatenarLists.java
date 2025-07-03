package main.java.list.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ConcatenarLists {

    private final List<String> nameList1 = new ArrayList<>();
    private final List<String> nameList2 = new ArrayList<>();
    private final List<String> nameList1e2 = new ArrayList<>();

    private void adicionarNomes1() {
        this.nameList1.add("Joao");
        this.nameList1.add("Maria");
    }

    private void adicionarNomes2() {
        this.nameList2.add("Marcio");
        this.nameList2.add("Ana");
    }

    private void contatenarListas() {
        nameList1e2.addAll(this.nameList1);
        nameList1e2.addAll(this.nameList2);
    }

    public void mostrarListaFinal() {
        System.out.println("Lista unificada: ");
        for(String nome : nameList1e2) {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        ConcatenarLists concatenarLists = new ConcatenarLists();

        concatenarLists.adicionarNomes1();
        concatenarLists.adicionarNomes2();
        concatenarLists.contatenarListas();
        concatenarLists.mostrarListaFinal();
    }
}