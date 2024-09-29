package strategy.frete;

/**
 * Quando usar uma classe abstrata no Strategy?
 * <p>
 * Use uma classe abstrata quando houver comportamento ou lógica comum entre as estratégias e
 * você queira que todas as implementações herdem esse comportamento,
 * além de implementar suas próprias variações.
 * <p>
 * Interface é preferível se as classes concretas compartilharem pouco ou nenhum código comum e
 * você quiser garantir apenas que elas implementem um contrato.
 * */

public abstract class FreteStrategy {

  // método abstrato que será implementado por cada estratégia
  public abstract double calcularFrete(double pesoPacote);

  // método comum para todas as estratégias
  protected double calcularTaxaManuseio(double pesoPacote) {
    return pesoPacote * 2;
  }

}
