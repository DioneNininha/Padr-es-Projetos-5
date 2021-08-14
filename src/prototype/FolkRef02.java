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

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<( VIOL�O FOLK / REFER�NCIA -> 02 )>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nPosui o corpo maior e mais acinturado, bastante popular entre os m�sico. A maioria dos\nmodelos desse tipo de viol�o funciona com a utiliza��o de cordas de a�o, podendo ser\nel�tricos ou eletroac�sticos. Mais indicado para g�neros como pop e rock, j� que gera um\nsom mais encorpado, com timbre diferenciado.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new FolkRef02(this);
	}
}
