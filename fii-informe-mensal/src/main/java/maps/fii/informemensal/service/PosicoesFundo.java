package maps.fii.informemensal.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PosicoesFundo implements Iterable<PosicaoFundo> {

	public PosicoesFundo() {
	}

	public PosicoesFundo(List<PosicaoFundo> posicoes) {
		super();
		this.posicoes = posicoes;
	}

	private List<PosicaoFundo> posicoes = new ArrayList<PosicaoFundo>();

	public void add(PosicaoFundo posicaoFundo) {
		posicoes.add(posicaoFundo);
	}

	public List<PosicaoFundo> getPosicoes() {
		return posicoes;
	}

	@Override
	public String toString() {
		return "PosicoesFundo [posicoes=" + posicoes + "]";
	}

	public void setPosicoes(List<PosicaoFundo> posicoes) {
		this.posicoes = posicoes;
	}

	@Override
	public Iterator<PosicaoFundo> iterator() {
		return posicoes.iterator();
	}
}
