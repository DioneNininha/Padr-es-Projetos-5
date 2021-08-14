package prototype;

/**
 * 
 * @author Dione
 *
 */
public class SeteCordasRef05 extends FabricaViolaoPrototype {

	protected SeteCordasRef05(SeteCordasRef05 seteCordasRef07) {

		this.valorVenda = seteCordasRef07.getValorVenda();
	}

	public SeteCordasRef05() {

	}

	@Override
	public String exibirInfo() {

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<( VIOLÃO 7 CORDAS / REFERÊNCIA -> 05 )>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nTipo brasileiro! É indicado para acompanhar gêneros como o choro e o samba\nModelo acústico suas cordas na maioria das vezes são feitas de nylon.\nÉ indicado para iniciantes graças à sua leveza e maciez.\nSeu diferencial está na sétima corda, que costuma ser afinada de maneira mais grave que as outras seis.\nExige um conhecimento do músico que for tocá-lo.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new SeteCordasRef05(this);
	}
}
