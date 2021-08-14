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

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<( VIOL�O DOZE CORDAS / REFER�NCIA -> 06 )>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor:R$ "
				+ getValorVenda()
				+ "\n\nN�o apresenta difern�as na estrutura, possuindo o dobro de cordas do que o cl�ssico.\nEssas cordas s�o agrupadas em duplas (metade delas afinadas com uma oitava acima).\nEsse tipo apresenta resson�ncia plena e exige t�cnica e pr�tica para poder pressionar\nduas cordas simultaneamente.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new DozeCordasRef06(this);
	}
}
