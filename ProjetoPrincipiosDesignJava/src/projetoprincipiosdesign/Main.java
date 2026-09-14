package projetoprincipiosdesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LOJA ACADÊMICA ===");

        Cliente cliente = new Cliente(
            "Ana",
            new Endereco(
                "Rua das Flores",
                new Cidade("Belo Horizonte")
            )
        );

        Pedido pedido = new Pedido(
            cliente,
            List.of(
                new ItemPedido("Livro de Engenharia de Software", 120.0, 1),
                new ItemPedido("Caderno", 20.0, 2)
            )

        );

        IDesconto desconto = new DescontoAluno();
        IPagamento pagamento = new PagamentoBoleto();

        cliente.getCidadeEntrega();
        IPedidoRepository repository = new PedidoRepository();
        PedidoService servico = new PedidoService(repository);

        System.out.println();
        System.out.println("Cidade de entrega:");
        System.out.println(servico.obterCidadeEntrega(pedido));

        System.out.println();
        System.out.println("Total com desconto:");
        System.out.printf("R$ %.2f%n", servico.calcularTotal(pedido, desconto));

        System.out.println();
        System.out.println("Pagamento:");
        servico.finalizarPedido(pedido, desconto, pagamento);

        System.out.println();
        System.out.println("Programa executado com sucesso.");
    }
}
