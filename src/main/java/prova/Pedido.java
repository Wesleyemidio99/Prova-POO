package prova;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    Cliente cliente;
    List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public double calcularTotal(){
        double total =0;
        for (Produto produto : produtos) {
            total = total + produto.getPreco();
        }
        return total;
    }
}
