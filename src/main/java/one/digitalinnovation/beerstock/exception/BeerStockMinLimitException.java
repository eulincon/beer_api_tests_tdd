package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockMinLimitException extends Exception {

	private static final long serialVersionUID = 1L;

	public BeerStockMinLimitException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed get to the min stock capacity: %s", id, quantityToDecrement));
    }
}
