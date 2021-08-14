package prototype;

/**
 * 
 * @author Dione
 *
 */
public class FletRef03 extends FabricaViolaoPrototype {

	protected FletRef03(FletRef03 fletRef04) {

		this.valorVenda = fletRef04.getValorVenda();
	}

	public FletRef03() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<( VIOLÃO FLET ACÚSTICO / REFERÊNCIA -> 03 )>>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nFlat do inglês, pode significar,PLANO ou LISO. Principal característica: sua caixa acústica é bastante fina!";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new FletRef03(this);
	}
}
