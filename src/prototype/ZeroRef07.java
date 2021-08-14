package prototype;

/**
 * 
 * @author Dione
 *
 */
public class ZeroRef07 extends FabricaViolaoPrototype {

	protected ZeroRef07(ZeroRef07 zeroRef09) {

		this.valorVenda = zeroRef09.getValorVenda();
	}

	public ZeroRef07() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<( VIOLÃO ZERO / REFERÊNCIA -> 07 )>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nCategorizado como Parlor, possui estrutura menor que as outras categorias zero e sendo\nmais indicado para uso casual e não tanto profissional. Possui uma estrutura confortável\npara tocar por bastante tempo.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new ZeroRef07(this);
	}
}
