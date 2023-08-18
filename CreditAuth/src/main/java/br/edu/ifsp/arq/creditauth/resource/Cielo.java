package br.edu.ifsp.arq.creditauth.resource;

import br.edu.ifsp.arq.creditauth.resource.OperadoraCartao;
import br.edu.ifsp.arq.creditauth.domain.model.Purchase;
import br.edu.ifsp.arq.creditauth.domain.model.Card;


public class Cielo implements OperadoraCartao{
	
	 @Override
	    public boolean autorizar(Purchase compra, Card cartao) {
	        // Implementação específica para a operadora Cielo
	        return cartao.getNumero().startsWith("1234") && compra.getValorTotal() < 1000;
	    }

}
