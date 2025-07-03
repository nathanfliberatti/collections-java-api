package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itens.isEmpty()) {
            for(Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itens.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;

        if (!itens.isEmpty()) {
            for(Item i : itens) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
        } else {
            System.out.println("A lista esta vazia!");
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lapis", 5, 5);
        carrinhoDeCompras.adicionarItem("Borracha", 8, 5);
        carrinhoDeCompras.adicionarItem("Caderno", 10, 5);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lapis");

        carrinhoDeCompras.exibirItens();

        System.out.println();

        System.out.println("O valor total do seu carrinho de compras é: R$" + carrinhoDeCompras.calcularValorTotal());
    }
}
