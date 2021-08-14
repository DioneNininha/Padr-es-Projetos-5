package prototype;

/**
 * 
 * @author Dione
 *
 */
public class DuploZeroRef08 extends FabricaViolaoPrototype {

	protected DuploZeroRef08(DuploZeroRef08 duplozeroRef03) {

		this.valorVenda = duplozeroRef03.getValorVenda();
	}

	public DuploZeroRef08() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<( Violão DUPLO ZERO / REFERÊNCIA -> 08 )>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n =>Valor: R$"
				+ getValorVenda()
				+ "\n\nCategorizado como Parlor,é um pouco maior, apresentando uma boa sonoridade e sendo indicado\npara técnicas de fingerstyle.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new DuploZeroRef08(this);
	}
}
