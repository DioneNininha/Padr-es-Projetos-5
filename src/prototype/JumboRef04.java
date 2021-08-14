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

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<( VIOLÃO JUMBO / REFERÊNCIA -> 04 )>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nModelo famoso nas mãso de Elvis Presley, mas apesar de ser bem parecido com o tipo clássico, a\ngrande diferença está em seu corpo mais largo e na base mais arredondada. Eletroacústico e com cordas de aço.\nGera som mais grave e encorpado.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new JumboRef04(this);
	}
}
