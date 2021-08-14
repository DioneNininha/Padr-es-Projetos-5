package prototype;

/**
 * 
 * @author Dione
 *
 */
public class DozeCordasRef06 extends FabricaViolaoPrototype {

	protected DozeCordasRef06(DozeCordasRef06 dozeCordasRef02) {

		this.valorVenda = dozeCordasRef02.getValorVenda();
	}

	public DozeCordasRef06() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<( VIOLÃO DOZE CORDAS / REFERÊNCIA -> 06 )>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor:R$ "
				+ getValorVenda()
				+ "\n\nNão apresenta difernças na estrutura, possuindo o dobro de cordas do que o clássico.\nEssas cordas são agrupadas em duplas (metade delas afinadas com uma oitava acima).\nEsse tipo apresenta ressonância plena e exige técnica e prática para poder pressionar\nduas cordas simultaneamente.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new DozeCordasRef06(this);
	}
}
