package strategy.frete;

public class FreteExpresso extends FreteStrategy {

  @Override
  public double calcularFrete(double pesoPacote) {
    System.out.println("Frete Expresso.");

    return (pesoPacote * 10) + calcularTaxaManuseio(pesoPacote);
  }
}
