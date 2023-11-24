package prova;

public class Entrega {
    public void processarEntrega(Pedido pedido){
        System.out.println("Pedido do cliente: " +pedido.cliente.getNome());
        System.out.println("Endereco de entrega: "+pedido.cliente.getEndereco());
        System.out.println("\nProdutos do pedido: ");
        for (Produto produto: pedido.produtos){
            System.out.println(produto.getNome() + " do valor: " + produto.getPreco());
        }
        System.out.println("\nTotal do pedido = " + pedido.calcularTotal());
        System.out.println("\nPedido entrege.");
    }
}
