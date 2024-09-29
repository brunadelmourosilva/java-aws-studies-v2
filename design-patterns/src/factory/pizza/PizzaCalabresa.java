package factory.pizza;

public class PizzaCalabresa implements Pizza {

  @Override
  public void preparar() {
    System.out.println("Preparando pizza de Calabresa...");
  }

  @Override
  public void calcularValor(boolean isBordaRecheada) {
    System.out.println("Calculando valor do pizza de Calabresa...");

    System.out.println("Valor total: " + (20.00 + Pizza.calcularBordaRecheada(isBordaRecheada)));
  }
}
