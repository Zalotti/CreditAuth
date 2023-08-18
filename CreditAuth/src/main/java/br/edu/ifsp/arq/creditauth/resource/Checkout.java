package br.edu.ifsp.arq.creditauth.resource;
import br.edu.ifsp.arq.creditauth.domain.model.Purchase;
import br.edu.ifsp.arq.creditauth.domain.model.Card;

public class Checkout {

	private OperadoraCartao operadora;

    public Checkout(OperadoraCartao operadora) {
        this.operadora = operadora;
    }

    public boolean finalizarCompra(Purchase compra, Card cartao) {
        return operadora.autorizar(compra, cartao);
    }
}
