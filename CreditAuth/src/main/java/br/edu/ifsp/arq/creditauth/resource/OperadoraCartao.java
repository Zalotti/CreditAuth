package br.edu.ifsp.arq.creditauth.resource;

import br.edu.ifsp.arq.creditauth.domain.model.Purchase;
import br.edu.ifsp.arq.creditauth.domain.model.Card;

public interface OperadoraCartao {

	boolean autorizar(Purchase compra, Card cartao);
}
