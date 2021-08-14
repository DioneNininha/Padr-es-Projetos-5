package prototype;

/**
 * 
 * @author Dione
 *
 */
public class JumboRef04 extends FabricaViolaoPrototype {

	protected JumboRef04(JumboRef04 jumboRef06) {

		this.valorVenda = jumboRef06.getValorVenda();
	}

	public JumboRef04() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<( VIOL�O JUMBO / REFER�NCIA -> 04 )>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nModelo famoso nas m�so de Elvis Presley, mas apesar de ser bem parecido com o tipo cl�ssico, a\ngrande diferen�a est� em seu corpo mais largo e na base mais arredondada. Eletroac�stico e com cordas de a�o.\nGera som mais grave e encorpado.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new JumboRef04(this);
	}
}
