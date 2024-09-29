package factory;

import factory.pizza.Pizza;
import factory.pizza.PizzaFactory;

public class Main {

  public static void main(String[] args) {

    Pizza pizzaFactoryM = PizzaFactory.createPizza("marguerita");
    pizzaFactoryM.calcularValor(true);

    System.out.println();

    Pizza pizzaFactoryC = PizzaFactory.createPizza("calabresa");
    pizzaFactoryC.calcularValor(false);
  }
}
