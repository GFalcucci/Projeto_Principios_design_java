package projetoprincipiosdesign;

public class DescontoFunc implements IDesconto{
    @Override
    public double desconto(double valor) {
        double total = valor * 0.80;
        return total;
    }
}
