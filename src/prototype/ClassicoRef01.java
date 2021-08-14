package prototype;

/**
 * 
 * @author Dione
 *
 */
public class ClassicoRef01 extends FabricaViolaoPrototype {

	protected ClassicoRef01(ClassicoRef01 classicoRef01) {
		this.valorVenda = classicoRef01.getValorVenda();
	}

	public ClassicoRef01() {
		
	}

	@Override
	public String exibirInfo() {
		return "<<<<<<<<<<<<<<<<<<<<<<<<( VIOL�O C�SSICO / REFER�NCIA -> 01 )>>>>>>>>>>>>>>>>>>>>>>>>\n\n => Valor:R$"
				+ getValorVenda()
				+ "\n\nModelo ac�stico e funciona com seis cordas (na maioria das vezes, feitas de nylon).\nAl�m da facilidade em encontrar esse modelo, ele possui um custo mais baixo quando comparado aos outros tipos,\ntamb�m � indicado para iniciantes gra�as � sua leveza e maciez.";
	}

	@Override
	public FabricaViolaoPrototype clonar() {
		return new ClassicoRef01(this);
	}
}
