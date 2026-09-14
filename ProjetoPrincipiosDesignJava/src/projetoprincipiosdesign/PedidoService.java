package projetoprincipiosdesign;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PedidoService{

    private final IPedidoRepository repository;

    public PedidoService(IPedidoRepository repository) {
        this.repository = repository;
    }


    public double calcularTotal(Pedido pedido, IDesconto desconto) {
        double total = 0.0;

        for (ItemPedido item : pedido.getItens()) {
            total += item.getPreco() * item.getQuantidade();
        }

        return desconto.desconto(total);
    }

    public String obterCidadeEntrega(Pedido pedido) {

        return pedido.getCliente().getCidadeEntrega();
    }

    public void finalizarPedido(Pedido pedido, IDesconto desconto, IPagamento pagamento) {

        double total = calcularTotal(pedido, desconto);
        repository.salvar(pedido, total);

        System.out.println("Gerando resumo do pedido...");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.printf("Total: R$ %.2f%n", total);

        System.out.println(
            "Enviando mensagem para " + pedido.getCliente().getNome() + ": pedido finalizado."
        );
    }
}
