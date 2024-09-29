package factory.pizza;

public class PizzaFactory {

  public static Pizza createPizza(String type) {
    return switch (type.toLowerCase()) {
      case "calabresa" -> new PizzaCalabresa();
      case "marguerita" -> new PizzaMarguerita();
      default -> null;
    };
  }
}
