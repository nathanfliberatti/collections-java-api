package main.java.list.Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContarOcorrencias {
    List<String> cores = new ArrayList<>(Arrays.asList("azul", "vermelho", "amarelo",
            "verde", "preto", "azul", "azul"));

    private int ContarCoresRepetidas() {
        int i = 0;
        for(String c : cores) {
            if (c.equalsIgnoreCase("azul")) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        ContarOcorrencias contarOcorrencias = new ContarOcorrencias();

        System.out.println("A cor azul apareceu " + contarOcorrencias.ContarCoresRepetidas() + " vezes");
    }

}
