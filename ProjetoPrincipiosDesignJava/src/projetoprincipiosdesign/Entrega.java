package projetoprincipiosdesign;

public class Entrega  implements IEntrega{
    @Override
    public boolean disponivelPara(double total) {
        return true;
    }

    @Override
    public double calcularEntrega(double valor) {
        return 0;
    }
}
