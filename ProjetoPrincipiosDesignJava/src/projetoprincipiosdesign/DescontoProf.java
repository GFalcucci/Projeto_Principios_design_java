package projetoprincipiosdesign;

public class DescontoProf implements IDesconto{
    @Override
    public double desconto(double valor) {
        double total = valor * 0.85;
        return total;
    }
}
