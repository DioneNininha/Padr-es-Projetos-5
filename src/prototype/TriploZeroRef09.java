package prototype;

/**
 * 
 * @author Dione
 *
 */
public class TriploZeroRef09 extends FabricaViolaoPrototype {

	protected TriploZeroRef09(TriploZeroRef09 triplozeroRef08) {

		this.valorVenda = triplozeroRef08.getValorVenda();
	}

	public TriploZeroRef09() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<( VIOL�O TRIPLO ZERO / REFER�NCIA -> 09 )>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nCategorizado como Parlor, possui tamanho intermedi�rio e gera um timbre mais peculiar.\n";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new TriploZeroRef09(this);
	}
}
