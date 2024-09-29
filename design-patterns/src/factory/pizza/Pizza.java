package factory.pizza;

public interface Pizza {

    static double calcularBordaRecheada(boolean isBordaRecheada) {
        return isBordaRecheada ? 5.00 : 0.00;
    }

    void preparar();

    void calcularValor(boolean isBordaRecheada);
}
