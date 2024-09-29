package strategy.frete;

public class FreteNormal extends FreteStrategy {

  @Override
  public double calcularFrete(double pesoPacote) {
    System.out.println("Frete Normal.");

    // Não tem taxa de manuseio
    return pesoPacote * 5;
  }
}
