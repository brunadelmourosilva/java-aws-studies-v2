package strategy;

import strategy.frete.FinalizarCompra;
import strategy.frete.FreteExpresso;
import strategy.frete.FreteInternacional;
import strategy.frete.FreteNormal;

public class Main {
  public static void main(String[] args) {

    FinalizarCompra finalizarCompraNormal = new FinalizarCompra(new FreteNormal());
    finalizarCompraNormal.finalizarCompra(10); // 10 quilos

    FinalizarCompra finalizarCompraExpresso = new FinalizarCompra(new FreteExpresso());
    finalizarCompraExpresso.finalizarCompra(2); // 2 quilos

    FinalizarCompra finalizarCompraInternacional = new FinalizarCompra(new FreteInternacional());
    finalizarCompraInternacional.finalizarCompra(3); // 3 quilos
  }
}
