package prototype;

/**
 * 
 * @author Dione
 *
 */
public class FolkRef02 extends FabricaViolaoPrototype {

	protected FolkRef02(FolkRef02 folkRef05) {

		this.valorVenda = folkRef05.getValorVenda();
	}

	public FolkRef02() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<( VIOLÃO FOLK / REFERÊNCIA -> 02 )>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nPosui o corpo maior e mais acinturado, bastante popular entre os músico. A maioria dos\nmodelos desse tipo de violão funciona com a utilização de cordas de aço, podendo ser\nelétricos ou eletroacústicos. Mais indicado para gêneros como pop e rock, já que gera um\nsom mais encorpado, com timbre diferenciado.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new FolkRef02(this);
	}
}
