package strategy.frete;

public class FinalizarCompra {

  private final FreteStrategy freteStrategy;

  public FinalizarCompra(FreteStrategy freteStrategy) {
    this.freteStrategy = freteStrategy;
  }

  public void finalizarCompra(double pesoPacote) {
    System.out.println("Finalizando compra...");

    double precoFrete = freteStrategy.calcularFrete(pesoPacote);
    System.out.println("Preço do frete: " + precoFrete);

    // todo além do cálculo do frete, pode ser adicionado outras ações de finalização da compra

    System.out.println("Compra finalizada com sucesso!\n");
  }
}
