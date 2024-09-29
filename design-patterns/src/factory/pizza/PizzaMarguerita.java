package factory.pizza;

public class PizzaMarguerita implements Pizza {

  @Override
  public void preparar() {
    System.out.println("Preparando pizza de Marguerita...");
  }

  @Override
  public void calcularValor(boolean isBordaRecheada) {
    System.out.println("Calculando valor do pizza de Marguerita...");

    System.out.println("Valor total: " + (30.00 + Pizza.calcularBordaRecheada(isBordaRecheada)));
  }
}
