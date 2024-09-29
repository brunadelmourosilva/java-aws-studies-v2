package strategy.frete;

public class FreteInternacional extends FreteStrategy {

  @Override
  public double calcularFrete(double pesoPacote) {
    System.out.println("Frete Internacional.");

    return (pesoPacote * 20) + calcularTaxaManuseio(pesoPacote);
  }
}
