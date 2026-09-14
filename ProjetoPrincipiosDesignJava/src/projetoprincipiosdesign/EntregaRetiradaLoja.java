package projetoprincipiosdesign;

public class EntregaRetiradaLoja implements IEntrega {
    @Override
    public boolean disponivelPara(double total) {
        return false;
    }

    @Override
    public double calcularEntrega(double valor) {
        return 0;
    }
}
