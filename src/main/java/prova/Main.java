package prova;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criar produtos
        Produto produto1 = new Produto("Televisao sansung 50 polegadas", 3000.00);
        Produto produto2 = new Produto("Radio", 500.00);


        //criar pedido
        Pedido pedido = new Pedido(criarCliente());

        //adicionar produtos
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        //criar Entrega
        Entrega sistemaEntrega = new Entrega();

        //processar pedido
        sistemaEntrega.processarEntrega(pedido);

    }

    public static Cliente criarCliente(){
        String nome;
        String endereco;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite seu endereco: ");
        endereco = entrada.nextLine();

        //criar cliente
        Cliente cliente = new Cliente(nome,endereco);
        return cliente;
    }
}