package maps.monolith.api.carteira.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import maps.monolith.api.carteira.domain.Carteira;
import maps.monolith.api.carteira.domain.CarteiraRepository;

@RestController
@RequestMapping(value = "/carteiras")
public class CarteiraController {

	private CarteiraRepository repository;

	@Autowired
	public CarteiraController(CarteiraRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/{mne}", method = RequestMethod.GET)
	public @ResponseBody Carteira find(@PathVariable String mne) {
		Carteira carteira = repository.findByMnemonico(mne);
		if (carteira == null) {
			throw new CarteiraNaoEncontradaException(mne);
		}
		System.out.println("carteira encontrada: " + carteira);
		return carteira;
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	class CarteiraNaoEncontradaException extends RuntimeException {
		public CarteiraNaoEncontradaException(String mne) {
			super("Carteira não encontrada. Mnemônico: " + mne);
		}
	}
}
