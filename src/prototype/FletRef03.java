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

		return "\n\n<<<<<<<<<<<<<<<<<<<<<( VIOL�O FLET AC�STICO / REFER�NCIA -> 03 )>>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nFlat do ingl�s, pode significar,PLANO ou LISO. Principal caracter�stica: sua caixa ac�stica � bastante fina!";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new FletRef03(this);
	}
}
