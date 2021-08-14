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

		return "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<( VIOL�O 7 CORDAS / REFER�NCIA -> 05 )>>>>>>>>>>>>>>>>>>>>>\n\n => Valor: R$"
				+ getValorVenda()
				+ "\n\nTipo brasileiro! � indicado para acompanhar g�neros como o choro e o samba\nModelo ac�stico suas cordas na maioria das vezes s�o feitas de nylon.\n� indicado para iniciantes gra�as � sua leveza e maciez.\nSeu diferencial est� na s�tima corda, que costuma ser afinada de maneira mais grave que as outras seis.\nExige um conhecimento do m�sico que for toc�-lo.";

	}

	@Override
	public FabricaViolaoPrototype clonar() {

		return new SeteCordasRef05(this);
	}
}
