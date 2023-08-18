package br.edu.ifsp.arq.creditauth;

import br.edu.ifsp.arq.creditauth.domain.model.Purchase;
import br.edu.ifsp.arq.creditauth.domain.model.Card;
import br.edu.ifsp.arq.creditauth.resource.Checkout;
import br.edu.ifsp.arq.creditauth.resource.Cielo;
import br.edu.ifsp.arq.creditauth.resource.Redecard;
import br.edu.ifsp.arq.creditauth.resource.OperadoraCartao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditAuthApplication {

	public static void main(String[] args) {
		
		//Definição da Compra
		 Purchase compra = new Purchase();
		 compra.setNumero("123");
		 compra.setNomeCliente("João");
		 compra.setNomeProduto("Macarrão");
		 compra.setValorTotal(500.00);
		 
		//Definição do Cartão
	     Card cartao = new Card();
	     cartao.setNomeCliente("João Vitor");
	     cartao.setNumero("12345678");
	     cartao.setValidade("12/25");
	     

	        OperadoraCartao operadora = new Cielo(); // Ou poderia ser Redecard
	        Checkout checkout = new Checkout(operadora);

	        if (checkout.finalizarCompra(compra, cartao)) {
	            System.out.println("Compra autorizada!");
	        } else {
	            System.out.println("Compra não autorizada.");
	        }
		SpringApplication.run(CreditAuthApplication.class, args);
	}

}
