package projetoprincipiosdesign;

public class DescontoAluno implements IDesconto {

    @Override
    public double desconto(double valor) {

        double total = valor * 0.90;
        return total;
    }
}
